package _250506_Tourism_Agency_Project.Model;

import _250506_Tourism_Agency_Project.Helper.DBConnector;
import _250506_Tourism_Agency_Project.Helper.Helper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Price {
    Hotel hotel;
    Room room;
    private int id;
    private int hotel_id;
    private int room_id;
    private int adult_price_1;
    private int adult_price_2;
    private int child_price_1;
    private int child_price_2;

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
                if (Room.getFetch(room_id).getStock() > 0) priceList.add(obj);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return priceList;
    }

    public static Price getFetch(int room_id) {
        Price obj = null;
        String query = "SELECT * FROM price WHERE room_id=?";
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
        Price foundPrice = Price.getFetch(room_id);
        if (foundPrice != null) {
            Helper.showMessage("exist");
        } else {
            try {
                PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
                pr.setInt(1, hotel_id);
                pr.setInt(2, room_id);
                if (Season.getFetch(hotel_id).isSeason_1()) {
                    pr.setInt(3, adult_price_1);
                    pr.setInt(5, child_price_1);
                } else {
                    pr.setInt(3, 0);
                    pr.setInt(5, 0);
                }
                if (Season.getFetch(hotel_id).isSeason_2()) {
                    pr.setInt(4, adult_price_2);
                    pr.setInt(6, child_price_2);
                } else {
                    pr.setInt(4, 0);
                    pr.setInt(6, 0);
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
