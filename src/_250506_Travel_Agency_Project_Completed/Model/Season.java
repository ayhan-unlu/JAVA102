package _250506_Travel_Agency_Project_Completed.Model;

import _250506_Travel_Agency_Project_Completed.Helper.DBConnector;
import _250506_Travel_Agency_Project_Completed.Helper.Helper;

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

    public static Season getFetch(int id) {
        String query = "SELECT * FROM season WHERE id=?";
        Season obj = new Season();
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setInt(1, id);
            ResultSet rs = pr.executeQuery();

            if (rs.next()) {
                obj = new Season();
                obj.setId(rs.getInt("id"));
                obj.setHotel_id(rs.getInt("hotel_id"));
                obj.setSeason_1(rs.getBoolean("Season_1"));
                obj.setSeason_2(rs.getBoolean("Season_2"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return obj;
    }

    public static Season getFetchByHotelId(int hotel_id) {
        Season obj = null;
        String query = "SELECT * FROM season WHERE hotel_id = ?";
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

    public static String createStringSeasonList(Season season) {
        String seasonList = "";
        if (season.season_1) seasonList += " Season 1 ";
        if (season.season_2) seasonList += " Season 2 ";
        return seasonList;
    }

    public static boolean add(int hotel_id, boolean season_1, boolean season_2) {
        String query = "INSERT INTO season (hotel_id,season_1,season_2) VALUES (?, ?,? )";
        Season foundHotelSeason = Season.getFetchByHotelId(hotel_id);

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

    public static boolean delete(int id) {
        String query = "DELETE FROM season WHERE id=?";
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setInt(1, id);
            return pr.executeUpdate() != -1;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return true;
    }

    public static boolean deleteByHotelId(int hotel_id) {
        int id = Season.getFetchByHotelId(hotel_id).getId();
        String query = "DELETE FROM season WHERE id=?";
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setInt(1, id);
            return pr.executeUpdate() != -1;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return true;
    }


    public static boolean update(int id, String season_1, String season_2) {

        String query = "UPDATE season SET season_1=?,season_2=? WHERE id=?";
        Season foundSeason = Season.getFetch(id);
        Hotel foundHotel = Hotel.getFetch(foundSeason.getHotel_id());

        int foundHotelId = foundSeason.getHotel_id();

        if ((foundSeason != null) && (foundSeason.getId() != id)) {
            Helper.showMessage("exist");
            return false;
        }
        System.out.println("Season 1" + season_1);
        System.out.println("Season 2" + season_2);
        boolean boolean_season_1;
        if (season_1.equals("true")) {
            boolean_season_1 = true;
        } else if (season_1.equals("false")) {
            boolean_season_1 = false;
            System.out.println("1");
            Price.updateSeason1Prices(foundHotelId);
            //Price.update(1);

//            if (Price.deleteRelatedPrices(foundHotelId)) {
//                System.out.println("2");
//                Helper.showMessage("Seasonal prices also deleted and will be displayed as zero");
//                System.out.println("3");
//            }
//            ;
//            if (!Price.deleteRelatedPrices(foundHotelId)) {
//                System.out.println("4");
//                return false;
//            }
        } else {
            Helper.showMessage("Please choose true or false for 1eason 1");
            return false;
        }
        boolean boolean_season_2;

        if (season_2.equals("true")) {
            boolean_season_2 = true;
        } else if (season_2.equals("false")) {
            boolean_season_2 = false;
            System.out.println("5");
            //Price.update(1);
        } else {
            Helper.showMessage("Please choose true or false for 2eason 2 ");
            return false;
        }


//        if (season_1.equals("true") || season_1.equals("false")) {
//            boolean boolean_season_1 = Boolean.getBoolean(season_1);
//            if (season_2.equals("true") || season_2.equals("false")) {
//                boolean boolean_season_2 =Boolean.getBoolean(season_2);
//            } else {
//                Helper.showMessage("Please choose true or false for Season 2");
//                return false;
//            }
//        } else {
//            Helper.showMessage("Please choose true or false for Season 1");
//            return false;
//        }

        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setBoolean(1, boolean_season_1);
            pr.setBoolean(2, boolean_season_2);
            pr.setInt(3, id);

//s            pr.setBoolean(1,boolean_season_1)
//
//            pr.setInt(3, id);
            return pr.executeUpdate() != -1;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return true;
    }

    public static int seasonDecider(String selectedDate) {
        int season;
        season = Helper.createIntFromStringDate(selectedDate);
        if (season >= 20250601) {
            season = 2;
        } else season = 1;
        return season;
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
