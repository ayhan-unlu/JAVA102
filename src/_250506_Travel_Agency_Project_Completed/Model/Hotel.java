package _250506_Travel_Agency_Project_Completed.Model;

import _250506_Travel_Agency_Project_Completed.Helper.DBConnector;
import _250506_Travel_Agency_Project_Completed.Helper.Helper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Hotel {
    private int id;
    private String name;
    private String city;
    private String region;
    private String address;
    private String email;
    private String phone;
    private String star;
    // private Feature feature;

    public Hotel() {
    }

    public Hotel(int id, String name, String city, String region, String address, String email, String phone, String star) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.region = region;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.star = star;
        //this.facilityFeatureList = facilityFeatureList;
    }

    public static ArrayList<Hotel> getList() {
        ArrayList<Hotel> hotelList = new ArrayList<>();
        String query = "SELECT * FROM hotel";

        Hotel obj;

        try {
            Statement st = DBConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                obj = new Hotel();
                obj.setId(rs.getInt("id"));
                obj.setName(rs.getString("name"));
                obj.setCity(rs.getString("city"));
                obj.setRegion(rs.getString("region"));
                obj.setAddress(rs.getString("address"));
                obj.setEmail(rs.getString("email"));
                obj.setPhone(rs.getString("phone"));
                obj.setStar(rs.getString("star"));
                //     obj.setFacility_feature(rs.getString("facility_feature"));
                hotelList.add(obj);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return hotelList;
    }


    public static Hotel getFetch(String name) {
        Hotel obj = null;

        String query = "SELECT * FROM hotel WHERE name = ?";

        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setString(1, name);
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                obj = new Hotel();
                obj.setId(rs.getInt("id"));
                obj.setName(rs.getString("name"));
                obj.setCity(rs.getString("city"));
                obj.setRegion(rs.getString("region"));
                obj.setAddress(rs.getString("address"));
                obj.setEmail(rs.getString("email"));
                obj.setPhone(rs.getString("phone"));
                obj.setStar(rs.getString("star"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return obj;
    }

    public static Hotel getFetch(int id) {
        Hotel obj = new Hotel();

        String query = "SELECT * FROM hotel WHERE id = ?";


        try {

            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setInt(1, id);
            ResultSet rs = pr.executeQuery();

            if (rs.next()) {
                obj = new Hotel();
                obj.setId(rs.getInt("id"));
                obj.setName(rs.getString("name"));
                obj.setCity(rs.getString("city"));
                obj.setRegion(rs.getString("region"));
                obj.setAddress(rs.getString("address"));
                obj.setEmail(rs.getString("email"));
                obj.setPhone(rs.getString("phone"));
                obj.setStar(rs.getString("star"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return obj;
    }


    public static boolean add(String name, String city, String region, String address, String email, String phone, String star/*, String facility_feature*/) {

        //String query = "INSERT INTO hotel(name, city, region, address, email, phone, star, facility_feature) VALUES(?, ?, ?, ?, ?, ?, ?,?)";
        String query = "INSERT INTO hotel(name, city, region, address, email, phone, star) VALUES(?, ?, ?, ?, ?, ?, ?)";
        Hotel foundHotel = Hotel.getFetch(name);

        if (foundHotel != null) {
            Helper.showMessage("exist");
            return false;
        }
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setString(1, name);
            pr.setString(2, city);
            pr.setString(3, region);
            pr.setString(4, address);
            pr.setString(5, email);
            pr.setString(6, phone);
            pr.setString(7, star);
            //    pr.setString(8, facility_feature);

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

    public static boolean delete(int id) {
        String query = "DELETE FROM hotel WHERE id = ?";
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setInt(1, id);
            return pr.executeUpdate() != -1;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return true;
    }

    public static boolean update(int id, String name, String city, String region, String address, String email, String phone, String star/*, String facility_feature*/) {
        String query = "UPDATE hotel SET name = ?, city = ?, region = ?, address = ?, email = ?, phone = ?, star = ? WHERE id =?";

        Hotel foundHotel = Hotel.getFetch(name);
        if ((foundHotel != null) && (foundHotel.getId() != id)) {
            Helper.showMessage("exist");
            return false;
        }
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setString(1, name);
            pr.setString(2, city);

            pr.setString(3, region);
            pr.setString(4, address);
            pr.setString(5, email);
            pr.setString(6, phone);
            pr.setString(7, star);
            pr.setInt(8, id);
            return pr.executeUpdate() != -1;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return true;
    }

    public static ArrayList<Boolean> createFacilityFeatureList(boolean freeParking, boolean freeWifi, boolean pool, boolean fitnessCenter, boolean hotelCorcierge, boolean spa, boolean roomService) {
        ArrayList<Boolean> facilityFeatureList = new ArrayList<>();
        facilityFeatureList.add(freeParking);
        facilityFeatureList.add(freeWifi);
        facilityFeatureList.add(pool);
        facilityFeatureList.add(fitnessCenter);
        facilityFeatureList.add(hotelCorcierge);
        facilityFeatureList.add(spa);
        facilityFeatureList.add(roomService);

        return facilityFeatureList;
    }

    public static String createHotelInfoString(int hotel_id) {
        String hotelInfoString = "";
        Hotel hotel = Hotel.getFetch(hotel_id);
        if (hotel != null) {
            hotelInfoString = "City: " + hotel.getCity() + " Region: " + hotel.getRegion() + " Address: " + hotel.getAddress() + " Email: " + hotel.getEmail() + " Phone: " + hotel.getPhone();
        }
        return hotelInfoString;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

//    public String getFacility_feature() {
//        return facility_feature;
//    }
//
//    public void setFacility_feature(String facility_feature) {
//        this.facility_feature = facility_feature;
//    }
//
//    public ArrayList<Boolean> getFacilityFeatureList() {
//        return facilityFeatureList;
//    }
//
//    public void setFacilityFeatureList(ArrayList<Boolean> facilityFeatureList) {
//        this.facilityFeatureList = facilityFeatureList;
//    }


}
