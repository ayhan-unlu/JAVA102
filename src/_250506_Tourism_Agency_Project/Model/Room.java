package _250506_Tourism_Agency_Project.Model;

import _250506_Tourism_Agency_Project.Helper.DBConnector;
import _250506_Tourism_Agency_Project.Helper.Helper;

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
        //   this.hotel = Hotel.getFetch(hotel_id);
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
        Room obj = null;
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

//    public static ArrayList<Room> searchByCity(String selectedCity){
//        ArrayList<Room> roomListByCity = new ArrayList<>();
//
//
//
//        return ;
//    }

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
