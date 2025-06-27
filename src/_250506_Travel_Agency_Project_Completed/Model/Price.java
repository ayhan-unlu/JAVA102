package _250506_Travel_Agency_Project_Completed.Model;

import _250506_Travel_Agency_Project_Completed.Helper.DBConnector;
import _250506_Travel_Agency_Project_Completed.Helper.Helper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Price {

    private int id;
    private int hotel_id;
    private int room_id;
    private int adult_price_1;
    private int adult_price_2;
    private int child_price_1;
    private int child_price_2;
    private Hotel hotel;
    private Room room;

    public Price() {

    }

    public Price(int id, int hotel_id, int room_id, int adult_price_1, int adult_price_2, int child_price_1, int child_price_2) {
        this.id = id;
        this.hotel_id = hotel_id;
        this.room_id = room_id;
        this.adult_price_1 = adult_price_1;
        this.adult_price_2 = adult_price_2;
        this.child_price_1 = child_price_1;
        this.child_price_2 = child_price_2;
    }

    public static ArrayList<Price> getList() {
        ArrayList<Price> priceList = new ArrayList<>();
        Price obj;
        String query = "SELECT * FROM price";
        try {
            Statement st = DBConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("id");
                int hotel_id = rs.getInt("hotel_id");
                int room_id = rs.getInt("room_id");
                int adult_price_1 = rs.getInt("adult_price_1");
                int adult_price_2 = rs.getInt("adult_price_2");
                int child_price_1 = rs.getInt("child_price_1");
                int child_price_2 = rs.getInt("child_price_2");
                obj = new Price(id, hotel_id, room_id, adult_price_1, adult_price_2, child_price_1, child_price_2);
                priceList.add(obj);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return priceList;
    }

    public static String searchQuery(String start_date, String end_date, String city, int room_id) {
        String query = "SELECT * FROM room JOIN hotel ON hotel.id=room.hotel_id JOIN season ON season.hotel_id=room.hotel_id WHERE room.id='%{{room_id}}%'";

        query = query.replace("%{{room_id}}%", String.valueOf(room_id));
        if (!city.isEmpty()) {
            query += "AND hotel.city ='__city__'";
            query = query.replace("__city__", city);
        }

        if (!((String.valueOf(start_date).isEmpty()) || String.valueOf(end_date).isEmpty())) {
            boolean season_1;
            if (Season.seasonDecider(start_date) == 1) {

                query += "AND season.season_1 ='__season_1__'";
                query = query.replace("__season_1__", "true");
            }
            if (Season.seasonDecider(start_date) == 2) {
                query += "AND season.season_2 = '__season_2__'";
                query = query.replace("__season_2__", "true");
            }
        }
        return query;
    }

    public static ArrayList<Price> search(String start_date, String end_date, String city, int room_id) {
        ArrayList<Price> searchList = null;
        Price obj = null;
        String query = Price.searchQuery(start_date, end_date, city, room_id);
        try {
            Statement st = DBConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                obj = new Price();
                obj.setId(rs.getInt("id"));
                obj.setHotel_id(rs.getInt("hotel_id"));
                obj.setRoom_id(rs.getInt("room_id"));
                obj.setAdult_price_1(rs.getInt("adult_price_1"));
                obj.setAdult_price_2(rs.getInt("adult_price_2"));
                obj.setChild_price_1(rs.getInt("child_price_1"));
                obj.setChild_price_2(rs.getInt("child_price_2"));
                searchList.add(obj);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return searchList;
    }

    public static Price getFetchByRoomId(int room_id) {

        String query = "SELECT * FROM price WHERE room_id=?";

        Price obj = null;
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setInt(1, room_id);
            ResultSet rs = pr.executeQuery();
            if (rs.next()) {
                obj = new Price();
                obj.setId(rs.getInt("id"));
                obj.setHotel_id(rs.getInt("hotel_id"));
                obj.setRoom_id(rs.getInt("room_id"));
                obj.setAdult_price_1(rs.getInt("adult_price_1"));
                obj.setAdult_price_2(rs.getInt("adult_price_2"));
                obj.setChild_price_1(rs.getInt("child_price_1"));
                obj.setChild_price_2(rs.getInt("child_price_2"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return obj;
    }

    public static boolean add(int hotel_id, int room_id, int adult_price_1, int adult_price_2, int child_price_1, int child_price_2) {

        String query = "INSERT INTO price (hotel_id, room_id, adult_price_1,adult_price_2,child_price_1,child_price_2) VALUES (?, ?, ?, ?, ?, ?)";
        Price foundPrice = Price.getFetchByRoomId(room_id);

        if (foundPrice != null) {
            Helper.showMessage("exist");
            return false;
        } else {
            try {
                PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
                pr.setInt(1, hotel_id);
                pr.setInt(2, room_id);
                if (Season.getFetchByHotelId(hotel_id).isSeason_1()) {
                    pr.setInt(3, adult_price_1);
                    pr.setInt(5, child_price_1);
                } else {
                    pr.setInt(3, 0);
                    pr.setInt(5, 0);
                    Helper.showMessage("Because the hotel is closed in season 1 price is added as zero");
                }
                if (Season.getFetchByHotelId(hotel_id).isSeason_2()) {
                    pr.setInt(4, adult_price_2);
                    pr.setInt(6, child_price_2);
                } else {
                    pr.setInt(4, 0);
                    pr.setInt(6, 0);
                    Helper.showMessage("Because the hotel is closed in season 2 price is added as zero");
                }
                int response = pr.executeUpdate();
                if (response == -1) {
                    Helper.showMessage("error");
                }
                return response != -1;
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return true;
    }

    public static boolean delete(int room_id) {
        String query = "DELETE FROM price WHERE room_id=?";

        Price foundPrice = Price.getFetchByRoomId(room_id);
        if (foundPrice != null) {

            try {
                PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
                pr.setInt(1, room_id);
                return pr.executeUpdate() != -1;
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        } else {
            Helper.showMessage("No assigned Price for the room");
            return false;
        }
        return true;
    }

    public static boolean deleteByHotelId(int hotel_id) {
        String query = "DELETE FROM price WHERE hotel_id=?";

        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setInt(1, hotel_id);
            return pr.executeUpdate() != -1;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return true;
    }

    public static boolean update(int room_id, int adult_price_1, int adult_price_2, int child_price_1, int child_price_2) {
        String query = "UPDATE price SET adult_price_1=?, adult_price_2=?, child_price_1=?, child_price_2=? WHERE room_id=?";

        Price foundPrice = Price.getFetchByRoomId(room_id);
        int hotel_id = Room.getFetch(room_id).getHotel_id();
        if (foundPrice == null) {
            Helper.showMessage("error");
            return false;
        } else {
            try {
                PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
                if (Season.getFetchByHotelId(hotel_id).isSeason_1()) {
                    adult_price_1 = 0;
                    child_price_1 = 0;
                }
                if (!Season.getFetchByHotelId(hotel_id).isSeason_2()) {
                    adult_price_2 = 0;
                    child_price_2 = 0;
                }
                pr.setInt(1, adult_price_1);
                pr.setInt(2, adult_price_2);
                pr.setInt(3, child_price_1);
                pr.setInt(4, child_price_2);
                pr.setInt(5, room_id);
                return pr.executeUpdate() != -1;
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return true;
    }

    public static boolean update1(int room_id, int adult_price_1, int adult_price_2, int child_price_1, int child_price_2) {
        String query = "UPDATE price SET adult_price_1=?, adult_price_2=?, child_price_1=?, child_price_2=? WHERE room_id=?";

        Price foundPrice = Price.getFetchByRoomId(room_id);
        if (foundPrice == null) {
            Helper.showMessage("error");
            return false;
        } else {
            try {
                PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);

                pr.setInt(1, adult_price_1);
                pr.setInt(2, adult_price_2);
                pr.setInt(3, child_price_1);
                pr.setInt(4, child_price_2);
                pr.setInt(5, room_id);
                return pr.executeUpdate() != -1;
            } catch (SQLException e) {
            }
        }
        return true;
    }

    public static void updateSeason1Prices(int hotel_id) {
        Hotel hotel = Hotel.getFetch(hotel_id);
        ArrayList<Room> roomList = new ArrayList<>();
        roomList = Room.getListByHotelName(hotel.getName());

        for (Room obj : roomList) {
            int room_id = obj.getId();
            Price currentPrice = Price.getFetchByRoomId(room_id);
            currentPrice.update(room_id, currentPrice.adult_price_1, currentPrice.adult_price_2, currentPrice.child_price_1, currentPrice.child_price_2);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(int hotel_id) {
        this.hotel_id = hotel_id;
    }

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public int getAdult_price_1() {
        return adult_price_1;
    }

    public void setAdult_price_1(int adult_price_1) {
        this.adult_price_1 = adult_price_1;
    }

    public int getAdult_price_2() {
        return adult_price_2;
    }

    public void setAdult_price_2(int adult_price_2) {
        this.adult_price_2 = adult_price_2;
    }

    public int getChild_price_1() {
        return child_price_1;
    }

    public void setChild_price_1(int child_price_1) {
        this.child_price_1 = child_price_1;
    }

    public int getChild_price_2() {
        return child_price_2;
    }

    public void setChild_price_2(int child_price_2) {
        this.child_price_2 = child_price_2;
    }

}
