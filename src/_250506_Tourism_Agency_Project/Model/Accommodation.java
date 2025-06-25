package _250506_Tourism_Agency_Project.Model;

import _250506_Tourism_Agency_Project.Helper.DBConnector;
import _250506_Tourism_Agency_Project.Helper.Helper;
import _250506_Tourism_Agency_Project.Helper.Item;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Accommodation {
    private int id;
    private int hotel_id;
    private boolean ultra_all_inclusive;
    private boolean all_in;
    private boolean bed_and_breakfast;
    private boolean full_board;
    private boolean half_board;
    private boolean bed_only;
    private boolean excluding_alcohol_full_credit;

    private Hotel hotel;

    public Accommodation() {
    }

    public Accommodation(int id, int hotel_id, boolean ultra_all_inclusive, boolean all_in, boolean bed_and_breakfast, boolean full_board, boolean half_board, boolean bed_only, boolean excluding_alcohol_full_credit) {
        this.id = id;
        this.hotel_id = hotel_id;
        this.ultra_all_inclusive = ultra_all_inclusive;
        this.all_in = all_in;
        this.bed_and_breakfast = bed_and_breakfast;
        this.full_board = full_board;
        this.half_board = half_board;
        this.bed_only = bed_only;
        this.excluding_alcohol_full_credit = excluding_alcohol_full_credit;
        this.hotel = Hotel.getFetch(hotel_id);
    }

    public static ArrayList<Accommodation> getList() {
        ArrayList<Accommodation> accommodationList = new ArrayList<>();
        Accommodation obj;
        String query = "SELECT * FROM accommodation";

        try {
            Statement st = DBConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                int id = rs.getInt("id");
                int hotel_id = rs.getInt("hotel_id");
                boolean ultra_all_inclusive = rs.getBoolean("ultra_all_inclusive");
                boolean all_in = rs.getBoolean("all_in");
                boolean bed_and_breakfast = rs.getBoolean("bed_and_breakfast");
                boolean full_board = rs.getBoolean("full_board");
                boolean half_board = rs.getBoolean("half_board");
                boolean bed_only = rs.getBoolean("bed_only");
                boolean excluding_alcohol_full_credit = rs.getBoolean("excluding_alcohol_full_credit");
                obj = new Accommodation(id, hotel_id, ultra_all_inclusive, all_in, bed_and_breakfast, full_board, half_board, bed_only, excluding_alcohol_full_credit);
                accommodationList.add(obj);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return accommodationList;
    }

    public static Accommodation getFetch(int hotel_id) {
        Accommodation obj = null;

        for (Accommodation a : Accommodation.getList()) {
            if (a.getHotel_id() == hotel_id) {
                obj = new Accommodation();
                obj.setHotel_id(a.getHotel_id());
                obj.setUltra_all_inclusive(a.isUltra_all_inclusive());
                obj.setAll_in(a.isAll_in());
                obj.setBed_and_breakfast(a.isBed_and_breakfast());
                obj.setFull_board(a.isFull_board());
                obj.setHalf_board(a.isHalf_board());
                obj.setBed_only(a.isBed_only());
                obj.setExcluding_alcohol_full_credit(a.isExcluding_alcohol_full_credit());
            }
        }

        return obj;
    }

    public static String createStringHotelAccommodationTypeList(int hotel_id){
        String accommodationList = "";
        Accommodation currentAccommodation = new Accommodation();
         currentAccommodation = Accommodation.getFetch(hotel_id);

        if(    currentAccommodation.isUltra_all_inclusive()){
            accommodationList += " Ultra All Inclusive ";
        }
        if(currentAccommodation.isAll_in()){
            accommodationList += " All In ";
        }
        if(currentAccommodation.isBed_and_breakfast()){
            accommodationList += " Bed And Breakfast ";
        }
        if(currentAccommodation.isFull_board()){
            accommodationList += " Full Board ";
        }
        if(currentAccommodation.isHalf_board()){
            accommodationList += " Half Board ";
        }
        if(currentAccommodation.isBed_only()){
            accommodationList += " Bed Only ";
        }
        if(currentAccommodation.isExcluding_alcohol_full_credit()){
            accommodationList += " Excluding Alcohol Full Credit ";
        }

        return accommodationList;
    }

    public static boolean add(int hotel_id, boolean ultra_all_inclusive, boolean all_in, boolean bed_and_breakfast, boolean full_board, boolean half_board, boolean bed_only, boolean excluding_alcohol_full_credit) {
        String query = "INSERT INTO accommodation (hotel_id,ultra_all_inclusive,all_in, bed_and_breakfast,full_board, half_board,bed_only,excluding_alcohol_full_credit) VALUES(?,?,?,?,?,?,?,?)";

        Accommodation foundAccommodation = Accommodation.getFetch(hotel_id);

        if (foundAccommodation != null) {
            Helper.showMessage("exist");
            return false;
        } else {
            try {
                PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
                pr.setInt(1, hotel_id);
                pr.setBoolean(2, ultra_all_inclusive);
                pr.setBoolean(3, all_in);
                pr.setBoolean(4, bed_and_breakfast);
                pr.setBoolean(5, full_board);
                pr.setBoolean(6, half_board);
                pr.setBoolean(7, bed_only);
                pr.setBoolean(8, excluding_alcohol_full_credit);

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

    public static void loadHotelAccommodationTypeListCombobox(JComboBox combobox,int hotel_id){
        combobox.removeAllItems();
        Accommodation a=Accommodation.getFetch(hotel_id);

        int i;
        i=0;
        combobox.addItem(new Item(i++,""));
        if(a.isUltra_all_inclusive()){
            combobox.addItem(new Item(i++,"Ultra All Inclusive"));
        }
        if(a.isAll_in()){
            combobox.addItem(new Item(i++,"All In"));
        }
        if(a.isBed_and_breakfast()){
            combobox.addItem(new Item(i++,"Bed And Breakfast"));
        }
        if(a.isFull_board()){
            combobox.addItem(new Item(i++,"Full Board"));
        }
        if(a.isHalf_board()){
            combobox.addItem(new Item(i++,"Half Board"));
        }
        if(a.isBed_only()){
            combobox.addItem(new Item(i++,"Bed Only"));
        }
        if(a.isExcluding_alcohol_full_credit()){
            combobox.addItem(new Item(i++,"Excluding Alcohol Full Credit"));
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

    public boolean isUltra_all_inclusive() {
        return ultra_all_inclusive;
    }

    public void setUltra_all_inclusive(boolean ultra_all_inclusive) {
        this.ultra_all_inclusive = ultra_all_inclusive;
    }

    public boolean isAll_in() {
        return all_in;
    }

    public void setAll_in(boolean all_in) {
        this.all_in = all_in;
    }

    public boolean isBed_and_breakfast() {
        return bed_and_breakfast;
    }

    public void setBed_and_breakfast(boolean bed_and_breakfast) {
        this.bed_and_breakfast = bed_and_breakfast;
    }

    public boolean isFull_board() {
        return full_board;
    }

    public void setFull_board(boolean full_board) {
        this.full_board = full_board;
    }

    public boolean isHalf_board() {
        return half_board;
    }

    public void setHalf_board(boolean half_board) {
        this.half_board = half_board;
    }

    public boolean isBed_only() {
        return bed_only;
    }

    public void setBed_only(boolean bed_only) {
        this.bed_only = bed_only;
    }

    public boolean isExcluding_alcohol_full_credit() {
        return excluding_alcohol_full_credit;
    }

    public void setExcluding_alcohol_full_credit(boolean excluding_alcohol_full_credit) {
        this.excluding_alcohol_full_credit = excluding_alcohol_full_credit;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}
