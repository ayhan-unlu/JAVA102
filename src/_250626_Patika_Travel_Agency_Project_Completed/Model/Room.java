package _250626_Patika_Travel_Agency_Project_Completed.Model;

import _250626_Patika_Travel_Agency_Project_Completed.Helper.DBConnector;
import _250626_Patika_Travel_Agency_Project_Completed.Helper.Helper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Room {

    private int id;
    private int hotel_id;
    private String room_type;
    private int stock;

    private Hotel hotel;

    public Room() {

    }

    public Room(int id, int hotel_id, String room_type, int stock) {
        this.id = id;
        this.hotel_id = hotel_id;
        this.room_type = room_type;
        this.stock = stock;
    }

    public static ArrayList<Room> getList() {
        ArrayList<Room> roomList = new ArrayList<>();
        Room obj;
        String query = "SELECT * FROM room";
        try {
            Statement st = DBConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("id");
                int hotel_id = rs.getInt("hotel_id");
                String room_type = rs.getString("room_type");
                int stock = rs.getInt("stock");
                obj = new Room(id, hotel_id, room_type, stock);
                if (obj.getStock() != 0) roomList.add(obj);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return roomList;
    }

//
//    public static ArrayList<Room> searchRoomList(String query) {
//        ArrayList<Room> searchList = new ArrayList<>();
//        Room obj;
//        try {
//            Statement st = DBConnector.getInstance().createStatement();
//            ResultSet rs = st.executeQuery(query);
//            while(rs.next()){
//                obj = new Room();
//                obj.setId (rs.getInt ("id"));
//                obj.setHotel_id (rs.getInt ("hotel_id"));
//                obj.setRoom_type (rs.getString ("room_type"));
//                obj.setStock (rs.getInt ("stock"));
//                searchList.add(obj);
//            }
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//        return searchList;
//    }

//    public static String searchQuery(String start_date, String end_date, String city, String hotel_name){
//
//        String query ="SELECT room.id,room.hotel_id, hotel.name, room.room_type, room.stock FROM room JOIN hotel ON hotel.id=room.hotel_id JOIN season ON season.hotel_id=room.hotel_id WHERE";
//        if(!city.isEmpty()){
//            query += "hotel.city="+city;
//        }
//       // "hotel.city='ist' AND season.season_2=true AND hotel.name = 'first'";
//        System.out.println(query);
//        return query;
//    }

    public static ArrayList<Room> getListByCity(String city) {
        ArrayList<Room> roomListByCity = new ArrayList<>();
        Room obj;
        String query = "SELECT * FROM room JOIN hotel ON hotel.id=room.hotel_id WHERE hotel.city =?";
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setString(1, city);
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                int hotel_id = rs.getInt("hotel_id");
                String room_type = rs.getString("room_type");
                int stock = rs.getInt("stock");
                obj = new Room(id, hotel_id, room_type, stock);
                if (obj.getStock() != 0) roomListByCity.add(obj);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return roomListByCity;
    }

    public static ArrayList<Room> getListBySeason(int season) {
        ArrayList<Room> roomListBySeason = new ArrayList<>();
        Room obj;
        String query = null;
        if (season == 1) {
            query = "SELECT * FROM room JOIN hotel On hotel.id = room.hotel_id JOIN season ON season.hotel_id = room.hotel_id WHERE season_1 =true";
        }
        if (season == 2) {
            query = "SELECT * FROM room JOIN hotel ON hotel.id = room.hotel_id JOIN season ON season.hotel_id = room.hotel_id WHERE season_2 = true";
        }
        try {
            Statement st = DBConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                int hotel_id = rs.getInt("hotel_id");
                String room_type = rs.getString("room_type");
                int stock = rs.getInt("stock");
                obj = new Room(id, hotel_id, room_type, stock);
                if (obj.getStock() != 0) roomListBySeason.add(obj);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return roomListBySeason;
    }

    public static ArrayList<Room> getListByHotelName(String hotel_name) {
        ArrayList<Room> roomListByHotelName = new ArrayList<>();
        Room obj;
        String query = "SELECT * FROM room JOIN hotel ON  hotel.id = room.hotel_id WHERE hotel.name =?";

        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setString(1, hotel_name);
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                int hotel_id = rs.getInt("hotel_id");
                String room_type = rs.getString("room_type");
                int stock = rs.getInt("stock");
                obj = new Room(id, hotel_id, room_type, stock);
                if (obj.getStock() != 0) roomListByHotelName.add(obj);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return roomListByHotelName;
    }

    public static ArrayList<Object> getCompleteRoomInfoList() {
        ArrayList<Object> completeRoomList = new ArrayList<>();
//        Room room=new Room();
//        Hotel hotel=new Hotel();
//        Accommodation accommodation=new Accommodation();
//        Feature feature=new Feature();
//        Season season=new Season();
//        Roomfeature roomfeature=new Roomfeature();
//        Object []obj=new Object[6];
//        obj[0]=room;
//        obj[1]=hotel;
//        obj[2]=accommodation;
//        obj[3]=feature;
//        obj[4]=season;
//        obj[5]=roomfeature;
        String query = "SELECT * FROM room\n" +
                "JOIN hotel ON hotel.id=room.hotel_id\n" +
                "JOIN accommodation ON accommodation.hotel_id = room.hotel_id\n" +
                "JOIN feature ON feature.hotel_id=room.hotel_id\n" +
                "JOIN season ON season.hotel_id = room.hotel_id\n" +
                "JOIN roomfeature ON roomfeature.room_id = room.id;";
        try {
            Statement st = DBConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

//                room=new Room(rs.getInt("id"),rs.getInt("hotel_id"),rs.getString("room_type"),rs.getInt("stock"));
//                obj[0]=room;
//                completeRoomList.add(obj);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return completeRoomList;
    }

    public static Room getFetch(int hotel_id, String room_type) {
        Room obj = null;
        String query = "SELECT * FROM room WHERE hotel_id = ? AND room_type = ?";
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setInt(1, hotel_id);
            pr.setString(2, room_type);
            ResultSet rs = pr.executeQuery();
            if (rs.next()) {
                obj = new Room();
                obj.setId(rs.getInt("id"));
                obj.setHotel_id(rs.getInt("hotel_id"));
                obj.setRoom_type(rs.getString("room_type"));
                obj.setStock(rs.getInt("stock"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return obj;
    }

    public static Room getFetch(int id) {
        Room obj = new Room();
        String query = "SELECT * FROM room WHERE id=?";
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setInt(1, id);
            ResultSet rs = pr.executeQuery();

            if (rs.next()) {
                obj = new Room();
                obj.setId(rs.getInt("id"));
                obj.setHotel_id(rs.getInt("hotel_id"));
                obj.setRoom_type(rs.getString("room_type"));
                obj.setStock(rs.getInt("stock"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return obj;
    }

    public static boolean add(int hotel_id, String room_type, int stock) {
        String query = "INSERT INTO room (hotel_id,room_type,stock) VALUES (?, ?, ?)";
        Room foundRoom = Room.getFetch(hotel_id, room_type);
        if (foundRoom != null) {
            Helper.showMessage("exist");
            return false;
        } else {
            try {
                PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
                pr.setInt(1, hotel_id);
                pr.setString(2, room_type);
                pr.setInt(3, stock);
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

    public static boolean delete(int id) {
        String query = "DELETE FROM room WHERE id=?";
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setInt(1, id);
            return pr.executeUpdate() != -1;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        Roomfeature.delete(Roomfeature.getFetch(id).getId());
        return true;
    }
    public static boolean deleteByHotelId(int hotel_id) {
        String query = "DELETE FROM room WHERE hotel_id=?";
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setInt(1, hotel_id);
            return pr.executeUpdate() != -1;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return true;
    }

    public static boolean update(int id, int hotel_id, String room_type, int stock) {
        String query = "UPDATE room SET hotel_id=?, room_type=?, stock=? WHERE id=?";
        Room foundRoom = Room.getFetch(id);

//        if (foundRoom != null && foundRoom.getId() != id) {
//            Helper.showMessage("exist");
//            return false;
//        }
        ArrayList <Room> roomList = new ArrayList<>();
        roomList = Room.getListByHotelName(Hotel.getFetch(hotel_id).getName());

        for(Room obj:roomList){
            if(obj.room_type.equals(room_type)&&obj.stock==stock){
                Helper.showMessage("This room type already exists");
                return false;
            }
        }

//        int i = 0;
//        for (Hotel obj : Hotel.getList()) {
//            if (hotel_id == obj.getId()) {
//                i++;
//            }
//        }
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
//            if (i > 0) {
                pr.setInt(1, hotel_id);
//            } else {
//                Helper.showMessage("Choose an existing Hotel Id");
//                return false;
          //  }
            if (room_type.equals("single_room") || room_type.equals("double_room") || room_type.equals("junior_suite") || room_type.equals("suite")) {
                pr.setString(2, room_type);
            } else {
                Helper.showMessage("Please choose proper room_type: single_room,double_room,junior_suite or suite");
                return false;
            }
            pr.setInt(3, stock);
            pr.setInt(4, id);
            return pr.executeUpdate() != -1;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return true;
    }

    public static ArrayList<Room> searchRoomList(String query) {
        ArrayList<Room> roomList = new ArrayList<>();
        System.out.println("searchlist"+1);
        Room obj;
        System.out.println("searchlist"+2);
        try {
            Statement st = DBConnector.getInstance().createStatement();
            System.out.println("searchlist"+3);
            ResultSet rs = st.executeQuery(query);
            System.out.println("searchlist"+4);
            while (rs.next()) {
                System.out.println("searchlist"+5);
                obj = new Room();
                obj.setId(rs.getInt("id"));
                obj.setHotel_id(rs.getInt("hotel_id"));
                obj.setRoom_type(rs.getString("room_type"));
                obj.setStock(rs.getInt("stock"));
                System.out.println("searchlist"+6);
                roomList.add(obj);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return roomList;
    }

    public static String createSearchQuery(String check_in_date, String check_out_date, String city, String hotel_name, int guestCount) {
        System.out.println("111");
        String query = "SELECT * FROM room JOIN hotel ON room.hotel_id = hotel.id JOIN season ON room.hotel_id = season.hotel_id JOIN roomfeature ON roomfeature.id = room.id WHERE room.stock>0";
        System.out.println("112");



        boolean dateCondition;
        if (!city.isEmpty()) {
            query += " AND hotel.city='{{city}}'";
            query = query.replace("{{city}}", city);
        }
        System.out.println("113");

        if (!hotel_name.isEmpty()) {
            query += " AND hotel.name='{{hotel_name}}'";
            query = query.replace("{{hotel_name}}", hotel_name);
        }


        if (!check_in_date.isEmpty() && !check_out_date.isEmpty()) {
            System.out.println("114");

            dateCondition = true;
            System.out.println("115");

        } else {
            System.out.println("116");

            dateCondition = false;
            System.out.println("117");

        }
        if (dateCondition) {
            System.out.println("118");

            int int_check_in_date = Helper.createIntFromStringDate(check_in_date);
            int int_check_out_date = Helper.createIntFromStringDate(check_out_date);
            int duration = Helper.calculateDuration(check_in_date, check_out_date);
            int season = Season.seasonDecider(check_in_date);
            query += " AND {{season}} = true";
            System.out.println("119");
            System.out.println(season);

            String searchedSeason = "";
            System.out.println("120");

            if (season == 1) {
                System.out.println("121");

                searchedSeason = "season_1";
                System.out.println("122");

            } else if (season == 2) {
                System.out.println("123");

                searchedSeason = "season_2";
                System.out.println("124");

            }
            System.out.println("125");

            query = query.replace("{{season}}", searchedSeason);
            System.out.println("126");

        }
        if (guestCount > 0) {
            query += " AND  roomfeature.bed_count >= '{{guestCount}}'";
            query = query.replace("{{guestCount}}", String.valueOf(guestCount));
        }
        System.out.println("QUERY " + query);
        return query;
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

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Hotel getHotel() {
        return this.hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;

    }
}
