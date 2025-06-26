package _250506_Travel_Agency_Project_Completed.Model;

import static java.lang.Math.round;

public class Calculation {
    private int id;
    private int hotel_id;
    private int room_id;
    private String accommodation_type;
    private int season_id;
    private int feature_id;
    private int roomfeature_id;
    private int adultGuestNumber;
    private int childGuestNumber;
    private double currentCoefficient;
    private double calculatedPrice;

    private Hotel hotel;

    public Calculation() {

    }

    public Calculation(int id, int hotel_id, int room_id, String accommodation_type, int season_id, int feature_id, int roomfeature_id, int adultGuestNumber, int childGuestNumber, double currentCoefficient, double calculatedPrice) {
        this.id = id;
        this.hotel_id = hotel_id;
        this.room_id = room_id;
        this.accommodation_type = accommodation_type;
        this.season_id = season_id;
        this.feature_id = feature_id;
        this.roomfeature_id = roomfeature_id;
        this.adultGuestNumber = adultGuestNumber;
        this.childGuestNumber = childGuestNumber;
        this.currentCoefficient = currentCoefficient;
        this.calculatedPrice = calculatedPrice;
    }

    public static double calculateCurrentCoefficient(int room_id) {
        int currentCoefficient = 1;

        int selectedHotel_id = Room.getFetch(room_id).getHotel_id();
        Hotel selectedHotel = Hotel.getFetch(selectedHotel_id);

        //Hotel Stars----------------------------------------------------------
        String star = "0";
        star = selectedHotel.getStar();
        switch (star) {
            case "1":
                currentCoefficient *= 1;
                break;
            case "2":
                currentCoefficient *= 2;
                break;
            case "3":
                currentCoefficient *= 3;
                break;
            case "4":
                currentCoefficient *= 4;
                break;
            case "5":
                currentCoefficient *= 5;
                break;
            default:
                currentCoefficient *= 1;
                break;
        }
        //##Hotel Stars----------------------------------------------------------

        //Room Types----------------------------------------------------------

        switch (Room.getFetch(room_id).getRoom_type().toString()) {
            case "single_room":
                currentCoefficient *= 1.1;
                break;
            case "double_room":
                currentCoefficient *= 1.2;
                break;
            case "junior_suite":
                currentCoefficient *= 1.3;
                break;
            case "suite":
                currentCoefficient *= 1.4;
                break;
            default:
                currentCoefficient *= 1;
                break;
        }
        //##Room Type;----------------------------------------------------------


        //Accommodation Types----------------------------------------------------------
 /*
        Accommodation selectedAccommodation = Accommodation.getFetch(selectedHotel_id);
        if (selectedAccommodation.isBed_only()) currentCoefficient *= 1.1;
        if (selectedAccommodation.isBed_and_breakfast()) currentCoefficient *= 1.2;
        if (selectedAccommodation.isHalf_board()) currentCoefficient *= 1.3;
        if (selectedAccommodation.isFull_board()) currentCoefficient *= 1.4;
        if (selectedAccommodation.isExcluding_alcohol_full_credit()) currentCoefficient *= 1.5;
        if (selectedAccommodation.isAll_in()) currentCoefficient *= 1.6;
        if (selectedAccommodation.isUltra_all_inclusive()) currentCoefficient *= 1.7;
*/
        //##Accommodation Types----------------------------------------------------------

        //Season----------------------------------------------------------
//        Season selectedSeason = Season.getFetchByHotelId(selectedHotel_id);
//        if (selectedSeason.isSeason_1()) currentCoefficient *= 1.1;
//        else if (selectedSeason.isSeason_2()) currentCoefficient *= 1.5;
//        else currentCoefficient *= 1;
        //##Season----------------------------------------------------------

        //Features----------------------------------------------------------
        Feature selectedFeature = Feature.getFetch(selectedHotel_id);
        if (selectedFeature.isFree_wifi()) currentCoefficient *= 1.1;
        if (selectedFeature.isFree_parking()) currentCoefficient *= 1.2;
        if (selectedFeature.isHotel_concierge()) currentCoefficient *= 1.3;
        if (selectedFeature.isFitness_center()) currentCoefficient *= 1.4;
        if (selectedFeature.isSpa()) currentCoefficient *= 1.5;
        if (selectedFeature.isPool()) currentCoefficient *= 1.6;
        if (selectedFeature.isRoom_service()) currentCoefficient *= 1.7;
        //##Features----------------------------------------------------------

        //Room Features----------------------------------------------------------

        Roomfeature selectedRoomfeature = Roomfeature.getFetch(room_id);
        if (selectedRoomfeature.getBed_count() > 1) currentCoefficient *= 1.1;
        if (selectedRoomfeature.getSquaremeters() > 20) currentCoefficient *= 1.2;
        if (selectedRoomfeature.isTv()) currentCoefficient *= 1.1;
        if (selectedRoomfeature.isMinibar()) currentCoefficient *= 1.1;
        if (selectedRoomfeature.isConsole()) currentCoefficient *= 1.1;
        if (selectedRoomfeature.isSafe()) currentCoefficient *= 1.1;
        if (selectedRoomfeature.isProjector()) currentCoefficient *= 1.1;

        //##Room Features----------------------------------------------------------
        return currentCoefficient;
    }

    public static double calculateReservationPrice(int room_id, int selectedSeason, String selectedAccommodation_type, int adultGuestCount, int childGuestCount, int duration) {
        int j = 0;

        double reservationPrice = 1;
        double currentCoefficient = Calculation.calculateCurrentCoefficient(room_id);
        double adult_price = 1;
        double child_price = 1;
        System.out.println("J: " + j++ + "Room id:" + room_id + "selectseason:" + selectedSeason + "selectedAccommodation_type:" + selectedAccommodation_type + " adultGuestCount:" + adultGuestCount + " childGuestCount:" + childGuestCount + "duration" + duration + "Reservation Price" + reservationPrice + "current Coefficient:" + currentCoefficient + "adultprice" + adult_price + "childPrice" + child_price);
        if (selectedSeason == 1) {
            adult_price = Price.getFetchByRoomId(room_id).getAdult_price_1();
            child_price = Price.getFetchByRoomId(room_id).getChild_price_1();
        }
        System.out.println("J: " + j++ + "Room id:" + room_id + "selectseason:" + selectedSeason + "selectedAccommodation_type:" + selectedAccommodation_type + " adultGuestCount:" + adultGuestCount + " childGuestCount:" + childGuestCount + "duration" + duration + "Reservation Price" + reservationPrice + "current Coefficient:" + currentCoefficient + "adultprice" + adult_price + "childPrice" + child_price);
        if (selectedSeason == 2) {
            adult_price = Price.getFetchByRoomId(room_id).getAdult_price_2();
            child_price = Price.getFetchByRoomId(room_id).getChild_price_2();
        }
        System.out.println("J: " + j++ + "Room id:" + room_id + "selectseason:" + selectedSeason + "selectedAccommodation_type:" + selectedAccommodation_type + " adultGuestCount:" + adultGuestCount + " childGuestCount:" + childGuestCount + "duration" + duration + "Reservation Price" + reservationPrice + "current Coefficient:" + currentCoefficient + "adultprice" + adult_price + "childPrice" + child_price);
        reservationPrice = currentCoefficient * (adultGuestCount * adult_price + childGuestCount * child_price) * duration;
        System.out.println("J: " + j++ + "Room id:" + room_id + "selectseason:" + selectedSeason + "selectedAccommodation_type:" + selectedAccommodation_type + " adultGuestCount:" + adultGuestCount + " childGuestCount:" + childGuestCount + "duration" + duration + "Reservation Price" + reservationPrice + "current Coefficient:" + currentCoefficient + "adultprice" + adult_price + "childPrice" + child_price);

        switch (selectedAccommodation_type) {
            case "Bed Only":
                reservationPrice *= 1.1;
                break;
            case "Bed And Breakfast":
                reservationPrice *= 1.2;
                break;
            case "Half Board":
                reservationPrice *= 1.3;
                break;
            case "Full Board":
                reservationPrice *= 1.4;
                break;
            case "Excluding Alcohol Full Credit":
                reservationPrice *= 1.5;
                break;
            case "All In":
                reservationPrice *= 1.6;
                break;
            case "Ultra All Inclusive":
                reservationPrice *= 1.7;
                break;
            default:
                reservationPrice *= 1;
        }
        System.out.println("J: " + j++ + "Room id:" + room_id + "selectseason:" + selectedSeason + "selectedAccommodation_type:" + selectedAccommodation_type + " adultGuestCount:" + adultGuestCount + " childGuestCount:" + childGuestCount + "duration" + duration + "Reservation Price" + reservationPrice + "current Coefficient:" + currentCoefficient + "adultprice" + adult_price + "childPrice" + child_price);
        reservationPrice = round(reservationPrice);
        return reservationPrice;
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

    public String getAccommodation_type() {
        return accommodation_type;
    }

    public void setAccommodation_type(String accommodation_type) {
        this.accommodation_type = accommodation_type;
    }

    public int getSeason_id() {
        return season_id;
    }

    public void setSeason_id(int season_id) {
        this.season_id = season_id;
    }

    public int getFeature_id() {
        return feature_id;
    }

    public void setFeature_id(int feature_id) {
        this.feature_id = feature_id;
    }

    public int getRoomfeature_id() {
        return roomfeature_id;
    }

    public void setRoomfeature_id(int roomfeature_id) {
        this.roomfeature_id = roomfeature_id;
    }

    public int getAdultGuestNumber() {
        return adultGuestNumber;
    }

    public void setAdultGuestNumber(int adultGuestNumber) {
        this.adultGuestNumber = adultGuestNumber;
    }

    public int getChildGuestNumber() {
        return childGuestNumber;
    }

    public void setChildGuestNumber(int childGuestNumber) {
        this.childGuestNumber = childGuestNumber;
    }

    public double getCurrentCoefficient() {
        return currentCoefficient;
    }

    public void setCurrentCoefficient(double currentCoefficient) {
        this.currentCoefficient = currentCoefficient;
    }

    public double getCalculatedPrice() {
        return calculatedPrice;
    }

    public void setCalculatedPrice(double calculatedPrice) {
        this.calculatedPrice = calculatedPrice;
    }

    public Hotel getHotel() {
        return this.hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

}
