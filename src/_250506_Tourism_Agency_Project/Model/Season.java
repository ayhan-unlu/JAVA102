package _250506_Tourism_Agency_Project.Model;

import _250506_Tourism_Agency_Project.Helper.DBConnector;
import _250506_Tourism_Agency_Project.Helper.Helper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Season {
    private int id;
    private int hotel_id;
    private boolean season_1;
    private boolean season_2;

    private Hotel hotel;

    public Season() {
    }

    public Season(int id, int hotel_id, boolean season_1, boolean season_2) {
        this.id = id;
        this.hotel_id = hotel_id;
        this.season_1 = season_1;
        this.season_2 = season_2;
        //       this.hotel = Hotel.getFetch(hotel_id);
    }

    public static ArrayList<Season> getList() {
        ArrayList<Season> seasonList = new ArrayList<>();
        Season obj;
        String query = "SELECT * FROM season";
        try {
            Statement st = DBConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("id");
                int hotel_id = rs.getInt("hotel_id");
                boolean season_1 = rs.getBoolean("season_1");
                boolean season_2 = rs.getBoolean("season_2");
                obj = new Season(id, hotel_id, season_1, season_2);
                seasonList.add(obj);
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return seasonList;
    }

    public static Season getFetch(int hotel_id) {
        String query = "SELECT * FROM season WHERE hotel_id = ?";

        Season obj = null;
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setInt(1, hotel_id);
            ResultSet rs = pr.executeQuery();
            if (rs.next()) {
                obj = new Season();
                obj.setHotel_id(rs.getInt("hotel_id"));
                obj.setSeason_1(rs.getBoolean("season_1"));
                obj.setSeason_2(rs.getBoolean("season_2"));

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return obj;
    }

    public static boolean add(int hotel_id, boolean season_1, boolean season_2) {
        String query = "INSERT INTO season (hotel_id,season_1,season_2) VALUES (?, ?,? )";
        Season foundHotelSeason = Season.getFetch(hotel_id);

        if (foundHotelSeason != null) {
            Helper.showMessage("exist");
        } else {
            try {
                PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
                pr.setInt(1, hotel_id);
                pr.setBoolean(2, season_1);
                pr.setBoolean(3, season_2);
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

//    public Season getFetch(int hotel_id){
//        String query = "SELECT * FROM season WHERE"
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

    public boolean isSeason_1() {
        return season_1;
    }

    public void setSeason_1(boolean season_1) {
        this.season_1 = season_1;
    }

    public boolean isSeason_2() {
        return season_2;
    }

    public void setSeason_2(boolean season_2) {
        this.season_2 = season_2;
    }

    public Hotel getHotel() {
        return this.hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}
