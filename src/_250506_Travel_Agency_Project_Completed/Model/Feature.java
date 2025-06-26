package _250506_Travel_Agency_Project_Completed.Model;

import _250506_Travel_Agency_Project_Completed.Helper.DBConnector;
import _250506_Travel_Agency_Project_Completed.Helper.Helper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Feature {
    private int id;
    private int hotel_id;
    private boolean free_parking;
    private boolean free_wifi;
    private boolean pool;
    private boolean fitness_center;
    private boolean hotel_concierge;
    private boolean spa;
    private boolean room_service;

    private Hotel hotel;

    public Feature() {
    }

    public Feature(int id, int hotel_id, boolean free_parking, boolean free_wifi, boolean pool, boolean fitness_center, boolean hotel_concierge, boolean spa, boolean room_service) {
        this.id = id;
        this.hotel_id = hotel_id;
        this.free_parking = free_parking;
        this.free_wifi = free_wifi;
        this.pool = pool;
        this.fitness_center = fitness_center;
        this.hotel_concierge = hotel_concierge;
        this.spa = spa;
        this.room_service = room_service;
    }

    public static ArrayList<Feature> getList() {
        ArrayList<Feature> featureList = new ArrayList<>();
        Feature obj;
        String query = "SELECT * FROM feature";

        try {
            Statement st = DBConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                int id = rs.getInt("id");
                int hotel_id = rs.getInt("hotel_id");
                boolean free_parking = rs.getBoolean("free_parking");
                boolean free_wifi = rs.getBoolean("free_wifi");
                boolean pool = rs.getBoolean("pool");
                boolean fitness_center = rs.getBoolean("fitness_center");
                boolean hotel_concierge = rs.getBoolean("hotel_concierge");
                boolean spa = rs.getBoolean("spa");
                boolean room_service = rs.getBoolean("room_service");
                obj = new Feature(id, hotel_id, free_parking, free_wifi, pool, fitness_center, hotel_concierge, spa, room_service);
                featureList.add(obj);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return featureList;
    }

    public static Feature getFetch(int hotel_id) {
        Feature obj = null;

        String query = "SELECT * FROM feature WHERE hotel_id = ?";
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setInt(1, hotel_id);

            ResultSet rs = pr.executeQuery();

            if (rs.next()) {
                obj = new Feature();
                obj.setId(rs.getInt("id"));
                obj.setHotel_id(rs.getInt("hotel_id"));
                obj.setFree_parking(rs.getBoolean("free_parking"));
                obj.setFree_wifi(rs.getBoolean("free_wifi"));
                obj.setPool(rs.getBoolean("pool"));
                obj.setFitness_center(rs.getBoolean("fitness_center"));
                obj.setHotel_concierge(rs.getBoolean("hotel_concierge"));
                obj.setSpa(rs.getBoolean("spa"));
                obj.setRoom_service(rs.getBoolean("room_service"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return obj;
    }

    public static boolean add(int hotel_id, boolean free_parking, boolean free_wifi, boolean pool, boolean fitness_center, boolean hotel_concierge, boolean spa, boolean room_service) {
        String query = "INSERT INTO feature(hotel_id, free_parking, free_wifi, pool, fitness_center, hotel_concierge, spa, room_service) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        Feature foundFeature = Feature.getFetch(hotel_id);
        if (foundFeature != null) {
            Helper.showMessage("exist");
            return false;
        }
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setInt(1, hotel_id);
            pr.setBoolean(2, free_parking);
            pr.setBoolean(3, free_wifi);
            pr.setBoolean(4, pool);
            pr.setBoolean(5, fitness_center);
            pr.setBoolean(6, hotel_concierge);
            pr.setBoolean(7, spa);
            pr.setBoolean(8, room_service);
            int response = pr.executeUpdate();
            if (response == -1) {
                Helper.showMessage("error");
            }

            return response != -1;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return true;
    }

    public static boolean deleteByHotelId(int hotel_id) {
        int id = Feature.getFetch(hotel_id).getId();
        String query = "DELETE FROM feature WHERE id = ?";
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setInt(1, id);
            return pr.executeUpdate() != -1;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return true;
    }


    public static String createStringHotelFeatureList(int hotel_id) {
        String hotelFeatureList = "";
        Feature currentFeature = Feature.getFetch(hotel_id);

        if (currentFeature.isFree_parking()) {
            hotelFeatureList += " Free Parking ";
        }

        if (currentFeature.isFree_wifi()) {
            hotelFeatureList += " Free Wifi";
        }
        if (currentFeature.isPool()) {
            hotelFeatureList += " Pool ";
        }

        if (currentFeature.isFitness_center()) {
            hotelFeatureList += " Fitness Center ";
        }


        if (currentFeature.isHotel_concierge()) {
            hotelFeatureList += " Hotel Concierge ";
        }

        if (currentFeature.isSpa()) {
            hotelFeatureList += " Spa ";
        }

        if (currentFeature.isRoom_service()) {
            hotelFeatureList += " 24/7 Room Service ";
        }


        return hotelFeatureList;
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

    public boolean isFree_parking() {
        return free_parking;
    }

    public void setFree_parking(boolean free_parking) {
        this.free_parking = free_parking;
    }

    public boolean isFree_wifi() {
        return free_wifi;
    }

    public void setFree_wifi(boolean free_wifi) {
        this.free_wifi = free_wifi;
    }

    public boolean isPool() {
        return pool;
    }

    public void setPool(boolean pool) {
        this.pool = pool;
    }

    public boolean isFitness_center() {
        return fitness_center;
    }

    public void setFitness_center(boolean fitness_center) {
        this.fitness_center = fitness_center;
    }

    public boolean isHotel_concierge() {
        return hotel_concierge;
    }

    public void setHotel_concierge(boolean hotel_concierge) {
        this.hotel_concierge = hotel_concierge;
    }

    public boolean isSpa() {
        return spa;
    }

    public void setSpa(boolean spa) {
        this.spa = spa;
    }

    public boolean isRoom_service() {
        return room_service;
    }

    public void setRoom_service(boolean room_service) {
        this.room_service = room_service;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

}
