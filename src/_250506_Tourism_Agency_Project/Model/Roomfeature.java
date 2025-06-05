package _250506_Tourism_Agency_Project.Model;

import _250506_Tourism_Agency_Project.Helper.DBConnector;
import _250506_Tourism_Agency_Project.Helper.Helper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Roomfeature {
    private int id;
    private int hotel_id;
    private int room_id;
    private int bed_count;
    private int squaremeters;
    private boolean tv;
    private boolean minibar;
    private boolean console;
    private boolean safe;
    private boolean projector;

    private Hotel hotel;
    private Room room;

    public Roomfeature() {

    }

    public Roomfeature(int id, int hotel_id, int room_id, int bed_count, int squaremeters, boolean tv, boolean minibar, boolean console, boolean safe, boolean projector) {
        this.id = id;
        this.hotel_id = hotel_id;
        this.room_id = room_id;
        this.bed_count = bed_count;
        this.squaremeters = squaremeters;
        this.tv = tv;
        this.minibar = minibar;
        this.console = console;
        this.safe = safe;
        this.projector = projector;
    }

    public static ArrayList<Roomfeature> getList() {
        ArrayList<Roomfeature> roomfeatureList = new ArrayList<>();
        String query = "SELECT * FROM roomfeature";

        try {
            Statement st = DBConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("id");
                int hotel_id = rs.getInt("hotel_id");
                int room_id = rs.getInt("room_id");
                int bed_count = rs.getInt("bed_count");
                int squaremeters = rs.getInt("squaremeters");
                boolean tv = rs.getBoolean("tv");
                boolean minibar = rs.getBoolean("minibar");
                boolean console = rs.getBoolean("console");
                boolean safe = rs.getBoolean("safe");
                boolean projector = rs.getBoolean("projector");

                Roomfeature obj = new Roomfeature(id, hotel_id, room_id, bed_count, squaremeters, tv, minibar, console, safe, projector);
                roomfeatureList.add(obj);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return roomfeatureList;
    }

    public static Roomfeature getFetch(int room_id) {
        Roomfeature obj = null;

        String query = "SELECT * FROM roomfeature WHERE room_id = ?";
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setInt(1, room_id);
            ResultSet rs = pr.executeQuery();

            if (rs.next()) {
                obj = new Roomfeature();
                obj.setId(rs.getInt("id"));
                obj.setHotel_id(rs.getInt("hotel_id"));
                obj.setRoom_id(rs.getInt("room_id"));
                obj.setBed_count(rs.getInt("bed_count"));
                obj.setSquaremeters(rs.getInt("squaremeters"));
                obj.setTv(rs.getBoolean("tv"));
                obj.setMinibar(rs.getBoolean("minibar"));
                obj.setConsole(rs.getBoolean("console"));
                obj.setSafe(rs.getBoolean("safe"));
                obj.setProjector(rs.getBoolean("projector"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return obj;
    }

    public static boolean add(int hotel_id, int room_id, int bed_count, int squaremeters, boolean tv, boolean minibar, boolean console, boolean safe, boolean projector) {

        String query = "INSERT INTO roomfeature (hotel_id, room_id, bed_count, squaremeters, tv, minibar ,console, safe, projector) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        Roomfeature foundRoomfeature = Roomfeature.getFetch(room_id);

        //   System.out.println(foundRoomfeature.getHotel_id()+"hotel_id");
        if (foundRoomfeature != null) {
            Helper.showMessage("exist");
        } else {
            try {
                PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
                pr.setInt(1, hotel_id);
                pr.setInt(2, room_id);
                pr.setInt(3, bed_count);
                pr.setInt(4, squaremeters);
                pr.setBoolean(5, tv);
                pr.setBoolean(6, minibar);
                pr.setBoolean(7, console);
                pr.setBoolean(8, safe);
                pr.setBoolean(9, projector);
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

    public static String createStringRoomFeatureList(int room_id) {
        String roomFeatureList = "";
        Roomfeature currentRoomfeature = Roomfeature.getFetch(room_id);

        if (currentRoomfeature.getBed_count() > 0) {
            roomFeatureList += " Bed Count: " + currentRoomfeature.getBed_count();
        }
        if (currentRoomfeature.getSquaremeters() > 0) {
            roomFeatureList += " Squaremeters: " + currentRoomfeature.getSquaremeters();
        }
        if (currentRoomfeature.isTv()) {
            roomFeatureList += " Tv ";
        }
        if (currentRoomfeature.isMinibar()) {
            roomFeatureList += " Minibar ";
        }
        if (currentRoomfeature.isConsole()) {
            roomFeatureList += " Console ";
        }
        if (currentRoomfeature.isSafe()) {
            roomFeatureList += " Safe ";
        }
        if (currentRoomfeature.isProjector()) {
            roomFeatureList += " Projector ";
        }
        return roomFeatureList;
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

    public int getBed_count() {
        return bed_count;
    }

    public void setBed_count(int bed_count) {
        this.bed_count = bed_count;
    }

    public int getSquaremeters() {
        return squaremeters;
    }

    public void setSquaremeters(int squaremeters) {
        this.squaremeters = squaremeters;
    }

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public boolean isMinibar() {
        return minibar;
    }

    public void setMinibar(boolean Minibar) {
        this.minibar = minibar;
    }

    public boolean isConsole() {
        return console;
    }

    public void setConsole(boolean console) {
        this.console = console;
    }

    public boolean isSafe() {
        return safe;
    }

    public void setSafe(boolean safe) {
        this.safe = safe;
    }

    public boolean isProjector() {
        return projector;
    }

    public void setProjector(boolean projector) {
        this.projector = projector;
    }

    public Hotel getHotel() {
        return this.hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Room getRoom() {
        return this.room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
