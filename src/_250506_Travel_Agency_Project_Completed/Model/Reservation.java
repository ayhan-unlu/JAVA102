package _250506_Travel_Agency_Project_Completed.Model;

import _250506_Travel_Agency_Project_Completed.Helper.DBConnector;
import _250506_Travel_Agency_Project_Completed.Helper.Helper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Reservation {
    private int id;
    private int room_id;
    private int hotel_id;
    private String accommodation_type;
    private String check_in_date;
    private String check_out_date;
    private String contact_id_no;
    private String contact_name;
    private String contact_phone;
    private String contact_email;
    private String note;
    private String guest_1_name;
    private String guest_1_country;
    private String guest_1_id_no;
    private String guest_1_type;
    private String guest_2_name;
    private String guest_2_country;
    private String guest_2_id_no;
    private String guest_2_type;
    private String guest_3_name;
    private String guest_3_country;
    private String guest_3_id_no;
    private String guest_3_type;
    private Room room;
    private Hotel hotel;
    private Accommodation accommodation;
    private Season season;

    public Reservation() {
    }


    public Reservation(int id, int room_id, int hotel_id, String accommodation_type, String check_in_date, String check_out_date, String contact_name, String contact_phone, String contact_email, String contact_id_no, String note, String guest_1_name, String guest_1_country, String guest_1_id_no, String guest_1_type, String guest_2_name, String guest_2_country, String guest_2_id_no, String guest_2_type, String guest_3_name, String guest_3_country, String guest_3_id_no, String guest_3_type) {
        this.id = id;
        this.room_id = room_id;
        this.hotel_id = hotel_id;
        this.accommodation_type = accommodation_type;
        this.check_in_date = check_in_date;
        this.check_out_date = check_out_date;
        this.contact_id_no = contact_id_no;
        this.contact_name = contact_name;
        this.contact_phone = contact_phone;
        this.contact_email = contact_email;
        this.note = note;
        this.guest_1_name = guest_1_name;
        this.guest_1_country = guest_1_country;
        this.guest_1_id_no = guest_1_id_no;
        this.guest_1_type = guest_1_type;
        this.guest_2_name = guest_2_name;
        this.guest_2_country = guest_2_country;
        this.guest_2_id_no = guest_2_id_no;
        this.guest_2_type = guest_2_type;
        this.guest_3_name = guest_3_name;
        this.guest_3_country = guest_3_country;
        this.guest_3_id_no = guest_3_id_no;
        this.guest_3_type = guest_3_type;

        this.room = Room.getFetch(room_id);
        this.hotel = Hotel.getFetch(hotel_id);
        this.accommodation = Accommodation.getFetch(hotel_id);
        this.season = Season.getFetchByHotelId(hotel_id);

    }

    public static ArrayList<Reservation> getList() {
        ArrayList<Reservation> reservationList = new ArrayList<>();
        Reservation obj;
        String query = "SELECT * FROM reservation";
        try {
            Statement st = DBConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("id");
                int room_id = rs.getInt("room_id");
                int hotel_id = rs.getInt("hotel_id");
                String accommodation_type = rs.getString("accommodation_type");
                String check_in_date = rs.getString("check_in_date");
                String check_out_date = rs.getString("check_out_date");
                String contact_name = rs.getString("contact_name");
                String contact_phone = rs.getString("contact_phone");
                String contact_email = rs.getString("contact_email");
                String contact_id_no = rs.getString("contact_id_no");
                String note = rs.getString("note");
                String guest_1_name = rs.getString("guest_1_name");
                String guest_1_country = rs.getString("guest_1_country");
                String guest_1_id_no = rs.getString("guest_1_id_no");
                String guest_1_type = rs.getString("guest_1_type");
                String guest_2_name = rs.getString("guest_2_name");
                String guest_2_country = rs.getString("guest_2_country");
                String guest_2_id_no = rs.getString("guest_2_id_no");
                String guest_2_type = rs.getString("guest_2_type");
                String guest_3_name = rs.getString("guest_3_name");
                String guest_3_country = rs.getString("guest_3_country");
                String guest_3_id_no = rs.getString("guest_3_id_no");
                String guest_3_type = rs.getString("guest_3_type");

                obj = new Reservation(id, room_id, hotel_id, accommodation_type, check_in_date, check_out_date, contact_name, contact_phone, contact_email, contact_id_no, note, guest_1_name, guest_1_country, guest_1_id_no, guest_1_type, guest_2_name, guest_2_country, guest_2_id_no, guest_2_type, guest_3_name, guest_3_country, guest_3_id_no, guest_3_type);
                reservationList.add(obj);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return reservationList;
    }

    public static Reservation getFetch(int id) {
        Reservation obj = new Reservation();
        String query = "SELECT * FROM reservation WHERE id=?";
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setInt(1, id);
            ResultSet rs = pr.executeQuery();

            if (rs.next()) {
                obj = new Reservation();
                obj.setId(rs.getInt("id"));
                obj.setRoom_id(rs.getInt("room_id"));
                obj.setHotel_id(rs.getInt("hotel_id"));
                obj.setAccommodation_type(rs.getString("accommodation_type"));
                obj.setCheck_in_date(rs.getString("check_in_date"));
                obj.setCheck_out_date(rs.getString("check_out_date"));
                obj.setContact_name(rs.getString("contact_name"));
                obj.setContact_phone(rs.getString("contact_phone"));
                obj.setContact_email(rs.getString("contact_email"));
                obj.setContact_id_no(rs.getString("contact_id_no"));
                obj.setNote(rs.getString("note"));
                obj.setGuest_1_name(rs.getString("guest_1_name"));
                obj.setGuest_1_country(rs.getString("guest_1_country"));
                obj.setGuest_1_id_no(rs.getString("guest_1_id_no"));
                obj.setGuest_1_type(rs.getString("guest_1_type"));
                obj.setGuest_2_name(rs.getString("guest_2_name"));
                obj.setGuest_2_country(rs.getString("guest_2_country"));
                obj.setGuest_2_id_no(rs.getString("guest_2_id_no"));
                obj.setGuest_2_type(rs.getString("guest_2_type"));
                obj.setGuest_3_name(rs.getString("guest_3_name"));
                obj.setGuest_3_country(rs.getString("guest_3_country"));
                obj.setGuest_3_id_no(rs.getString("guest_3_id_no"));
                obj.setGuest_3_type(rs.getString("guest_3_type"));

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return obj;
    }

    public static Reservation getFetchByRoomId(int room_id) {
        Reservation obj = null;

        String query = "SELECT * FROM reservation WHERE room_id=?";
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setInt(1, room_id);
            ResultSet rs = pr.executeQuery();

            if (rs.next()) {
                obj = new Reservation();
                obj.setId(rs.getInt("id"));
                obj.setRoom_id(rs.getInt("room_id"));
                obj.setHotel_id(rs.getInt("hotel_id"));
                obj.setAccommodation_type(rs.getString("accommodation_type"));
                obj.setCheck_in_date(rs.getString("check_in_date"));
                obj.setCheck_out_date(rs.getString("check_out_date"));
                obj.setContact_name(rs.getString("contact_name"));
                obj.setContact_phone(rs.getString("contact_phone"));
                obj.setContact_email(rs.getString("contact_email"));
                obj.setContact_id_no(rs.getString("contact_id_no"));
                obj.setNote(rs.getString("note"));
                obj.setGuest_1_name(rs.getString("guest_1_name"));
                obj.setGuest_1_country(rs.getString("guest_1_country"));
                obj.setGuest_1_id_no(rs.getString("guest_1_id_no"));
                obj.setGuest_1_type(rs.getString("guest_1_type"));
                obj.setGuest_2_name(rs.getString("guest_2_name"));
                obj.setGuest_2_country(rs.getString("guest_2_country"));
                obj.setGuest_2_id_no(rs.getString("guest_2_id_no"));
                obj.setGuest_2_type(rs.getString("guest_2_type"));
                obj.setGuest_3_name(rs.getString("guest_3_name"));
                obj.setGuest_3_country(rs.getString("guest_3_country"));
                obj.setGuest_3_id_no(rs.getString("guest_3_id_no"));
                obj.setGuest_3_type(rs.getString("guest_3_type"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return obj;
    }

    public static boolean add(int room_id,
                              int hotel_id,
                              String accommodation_type,
                              String check_in_date,
                              String check_out_date,
                              String contact_name,
                              String contact_phone,
                              String contact_email,
                              String contact_id_no,
                              String note,
                              String guest_1_name,
                              String guest_1_country,
                              String guest_1_id_no,
                              String guest_1_type,
                              String guest_2_name,
                              String guest_2_country,
                              String guest_2_id_no,
                              String guest_2_type,
                              String guest_3_name,
                              String guest_3_country,
                              String guest_3_id_no,
                              String guest_3_type) {
        System.out.println("reservation is added-1");
        String query = "INSERT INTO reservation (room_id, hotel_id, accommodation_type, check_in_date, check_out_date, contact_name, contact_phone, contact_email, contact_id_no,note, guest_1_name,guest_1_country,guest_1_id_no,guest_1_type,guest_2_name,guest_2_country,guest_2_id_no,guest_2_type,guest_3_name,guest_3_country,guest_3_id_no,guest_3_type)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        System.out.println("reservation is added-2");
        Reservation foundReservation = Reservation.getFetchByRoomId(room_id);
        if (foundReservation != null) {
            boolean isRoomReservedOnSelectedDates = Helper.reservationController(foundReservation, check_in_date, check_out_date);
            if (isRoomReservedOnSelectedDates) {
                Helper.showMessage("Room is already reserved on selected dates");
                return false;
            }
        }
        if (Roomfeature.getFetch(room_id).getBed_count() >= Helper.calculateGuestCount(guest_1_name, guest_2_name) + Helper.calculateGuestCount(guest_3_name)) {
            try {
                PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
                pr.setInt(1, room_id);
                pr.setInt(2, hotel_id);
                pr.setString(3, accommodation_type);
                pr.setString(4, check_in_date);
                pr.setString(5, check_out_date);
                pr.setString(6, contact_name);
                pr.setString(7, contact_phone);
                pr.setString(8, contact_email);
                pr.setString(9, contact_id_no);
                pr.setString(10, note);
                pr.setString(11, guest_1_name);
                pr.setString(12, guest_1_country);
                pr.setString(13, guest_1_id_no);
                pr.setString(14, guest_1_type);
                pr.setString(15, guest_2_name);
                pr.setString(16, guest_2_country);
                pr.setString(17, guest_2_id_no);
                pr.setString(18, guest_2_type);
                pr.setString(19, guest_3_name);
                pr.setString(20, guest_3_country);
                pr.setString(21, guest_3_id_no);
                pr.setString(22, guest_3_type);
                int response = pr.executeUpdate();
                Helper.decreaseRoomStockOne(room_id);
                if (response == -1) {
                    Helper.showMessage("error");
                }
                return response != -1;
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        } else {
            Helper.showMessage("Room capacity is lower than the guest number");
            return false;
        }
        return true;
    }

    public static boolean delete(int id) {
        String query = "DELETE FROM reservation WHERE id = ? ";
        System.out.println("reservation id" + id);
        int room_id = Reservation.getFetch(id).getRoom_id();
        System.out.println("room id" + room_id);
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setInt(1, id);
            Helper.increaseRoomStockOne(room_id);

            return pr.executeUpdate() != -1;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return true;
    }

    public static boolean update(int id, String accommodation_type, String check_in_date, String check_out_date, String contact_name, String contact_phone, String contact_email, String contact_id_no, String note, String guest_1_name, String guest_1_country, String guest_1_id_no, String guest_1_type, String guest_2_name, String guest_2_country, String guest_2_id_no, String guest_2_type, String guest_3_name, String guest_3_country, String guest_3_id_no, String guest_3_type) {
        String query = "UPDATE reservation SET accommodation_type =?, check_in_date=?, check_out_date=?,  contact_name=?, contact_phone=?,contact_email=?,contact_id_no=?,note=?,guest_1_name =?, guest_1_country=?,guest_1_id_no=?,guest_1_type=?, guest_2_name =?, guest_2_country=?,guest_2_id_no=?,guest_2_type=?, guest_3_name =?, guest_3_country=?,guest_3_id_no=?,guest_3_type=? WHERE id=?";
        Reservation foundReservation = Reservation.getFetch(id);
        if (foundReservation != null && foundReservation.getId() != id) {
            Helper.showMessage("exist");
            return false;
        }
        if (Helper.guestTypeController(guest_1_type, guest_2_type, guest_3_type)) {
        } else {
            Helper.showMessage("Please choose a valid Guest Type. (adult or child)");
            return false;
        }

        if (Helper.accommodationTypeController(accommodation_type)) {
        } else {
            Helper.showMessage("Please choose a valid Accommodation Type (Ultra All Inclusive, All In, Bed And Breakfast, Full Board, Half Board, Bed Only, Excluding Alcohol Full Credit)");
            return false;
        }

        if (Helper.createIntFromStringDate(check_in_date) > Helper.createIntFromStringDate(check_out_date)) {
            Helper.showMessage("Check In Date is after Check Out Date. Please set it properly, if required choose update Check Out Date first.");
            return false;
        }
        if (Roomfeature.getFetch(Reservation.getFetch(id).getRoom_id()).getBed_count() >= Helper.calculateGuestCount(guest_1_name, guest_2_name) + Helper.calculateGuestCount(guest_3_name)) {
            try {
                PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
                pr.setString(1, accommodation_type);
                pr.setString(2, check_in_date);
                pr.setString(3, check_out_date);
                pr.setString(4, contact_name);
                pr.setString(5, contact_phone);
                pr.setString(6, contact_email);
                pr.setString(7, contact_id_no);
                pr.setString(8, note);
                pr.setString(9, guest_1_name);
                pr.setString(10, guest_1_country);
                pr.setString(11, guest_1_id_no);
                pr.setString(12, guest_1_type);
                pr.setString(13, guest_2_name);
                pr.setString(14, guest_2_country);
                pr.setString(15, guest_2_id_no);
                pr.setString(16, guest_2_type);
                pr.setString(17, guest_3_name);
                pr.setString(18, guest_3_country);
                pr.setString(19, guest_3_id_no);
                pr.setString(20, guest_3_type);
                pr.setInt(21, id);

                return pr.executeUpdate() != -1;
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        } else {
            Helper.showMessage("Room capacity is lower than total guest number");
            return false;
        }
        return true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public int getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(int hotel_id) {
        this.hotel_id = hotel_id;
    }

    public String getAccommodation_type() {
        return accommodation_type;
    }

    public void setAccommodation_type(String accommodation_type) {
        this.accommodation_type = accommodation_type;
    }

    public String getCheck_in_date() {
        return check_in_date;
    }

    public void setCheck_in_date(String check_in_date) {
        this.check_in_date = check_in_date;
    }

    public String getCheck_out_date() {
        return check_out_date;
    }

    public void setCheck_out_date(String check_out_date) {
        this.check_out_date = check_out_date;
    }

    public String getContact_id_no() {
        return contact_id_no;
    }

    public void setContact_id_no(String contact_id_no) {
        this.contact_id_no = contact_id_no;
    }

    public String getContact_name() {
        return contact_name;
    }

    public void setContact_name(String contact_name) {
        this.contact_name = contact_name;
    }

    public String getContact_phone() {
        return contact_phone;
    }

    public void setContact_phone(String contact_phone) {
        this.contact_phone = contact_phone;
    }

    public String getContact_email() {
        return contact_email;
    }

    public void setContact_email(String contact_email) {
        this.contact_email = contact_email;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getGuest_1_name() {
        return guest_1_name;
    }

    public void setGuest_1_name(String guest_1_name) {
        this.guest_1_name = guest_1_name;
    }

    public String getGuest_1_country() {
        return guest_1_country;
    }

    public void setGuest_1_country(String guest_1_country) {
        this.guest_1_country = guest_1_country;
    }

    public String getGuest_1_id_no() {
        return guest_1_id_no;
    }

    public void setGuest_1_id_no(String guest_1_id_no) {
        this.guest_1_id_no = guest_1_id_no;
    }

    public String getGuest_1_type() {
        return guest_1_type;
    }

    public void setGuest_1_type(String guest_1_type) {
        this.guest_1_type = guest_1_type;
    }

    public String getGuest_2_name() {
        return guest_2_name;
    }

    public void setGuest_2_name(String guest_2_name) {
        this.guest_2_name = guest_2_name;
    }

    public String getGuest_2_country() {
        return guest_2_country;
    }

    public void setGuest_2_country(String guest_2_country) {
        this.guest_2_country = guest_2_country;
    }

    public String getGuest_2_id_no() {
        return guest_2_id_no;
    }

    public void setGuest_2_id_no(String guest_2_id_no) {
        this.guest_2_id_no = guest_2_id_no;
    }

    public String getGuest_2_type() {
        return guest_2_type;
    }

    public void setGuest_2_type(String guest_2_type) {
        this.guest_2_type = guest_2_type;
    }

    public String getGuest_3_name() {
        return guest_3_name;
    }

    public void setGuest_3_name(String guest_3_name) {
        this.guest_3_name = guest_3_name;
    }

    public String getGuest_3_country() {
        return guest_3_country;
    }

    public void setGuest_3_country(String guest_3_country) {
        this.guest_3_country = guest_3_country;
    }

    public String getGuest_3_id_no() {
        return guest_3_id_no;
    }

    public void setGuest_3_id_no(String guest_3_id_no) {
        this.guest_3_id_no = guest_3_id_no;
    }

    public String getGuest_3_type() {
        return guest_3_type;
    }

    public void setGuest_3_type(String guest_3_type) {
        this.guest_3_type = guest_3_type;
    }


    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Accommodation getAccommodation() {
        return accommodation;
    }

    public void setAccommodation(Accommodation accommodation) {
        this.accommodation = accommodation;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }
}
