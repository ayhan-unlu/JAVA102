package _250506_Travel_Agency_Project_Completed.Model;

import _250506_Travel_Agency_Project_Completed.Helper.Helper;
import _250506_Travel_Agency_Project_Completed.View.LoginGUI;

public class Main {
    public static void main(String[] args) {
        Helper.setLayout();
        if(User.getList().isEmpty()) {
            User.add("a", "a", "a", "a", "admin");
        }
        LoginGUI loginGUI = new LoginGUI();
         //Admin defaultAdmin = new Admin();
         //AdminGUI adminGUI = new AdminGUI(defaultAdmin);
    }
}

/*
insert into room (id, hotel_id, room_type, stock) values (1, 1, "single_room", 1);
insert into room (id, hotel_id, room_type, stock) values (2, 1, "double_room", 2);
insert into room (id, hotel_id, room_type, stock) values (3, 1, "junior_suite", 3);
insert into room (id, hotel_id, room_type, stock) values (4, 1, "suite", 4);
insert into room (id, hotel_id, room_type, stock) values (5, 2, "single_room", 5);
insert into room (id, hotel_id, room_type, stock) values (6, 2, "double_room", 6);
insert into room (id, hotel_id, room_type, stock) values (7, 2, "junior_suite", 7);
insert into room (id, hotel_id, room_type, stock) values (8, 2, "suite", 8);
insert into room (id, hotel_id, room_type, stock) values (9, 3, "single_room", 9);
insert into room (id, hotel_id, room_type, stock) values (10, 3, "double_room", 10);
insert into room (id, hotel_id, room_type, stock) values (11, 3, "junior_suite", 11);
insert into room (id, hotel_id, room_type, stock) values (12, 3, "suite", 12);
insert into room (id, hotel_id, room_type, stock) values (13, 4, "single_room", 13);
insert into room (id, hotel_id, room_type, stock) values (14, 4, "double_room", 14);
insert into room (id, hotel_id, room_type, stock) values (15, 4, "junior_suite", 15);
insert into room (id, hotel_id, room_type, stock) values (16, 4, "suite", 16);
insert into room (id, hotel_id, room_type, stock) values (17, 5, "single_room", 17);
insert into room (id, hotel_id, room_type, stock) values (18, 5, "double_room", 18);
insert into room (id, hotel_id, room_type, stock) values (19, 5, "junior_suite", 19);
insert into room (id, hotel_id, room_type, stock) values (20, 5, "suite", 20);
insert into room (id, hotel_id, room_type, stock) values (21, 6, "single_room", 21);
insert into room (id, hotel_id, room_type, stock) values (22, 6, "double_room", 22);
insert into room (id, hotel_id, room_type, stock) values (23, 6, "junior_suite", 23);
insert into room (id, hotel_id, room_type, stock) values (24, 6, "suite", 24);
insert into room (id, hotel_id, room_type, stock) values (25, 7, "single_room", 25);
insert into room (id, hotel_id, room_type, stock) values (26, 7, "double_room", 26);
insert into room (id, hotel_id, room_type, stock) values (27, 7, "junior_suite", 27);
insert into room (id, hotel_id, room_type, stock) values (28, 7, "suite", 28);
insert into room (id, hotel_id, room_type, stock) values (29, 8, "single_room", 29);
insert into room (id, hotel_id, room_type, stock) values (30, 8, "double_room", 30);
insert into room (id, hotel_id, room_type, stock) values (31, 8, "junior_suite", 31);
insert into room (id, hotel_id, room_type, stock) values (32, 8, "suite", 32);
insert into room (id, hotel_id, room_type, stock) values (33, 9, "single_room", 33);
insert into room (id, hotel_id, room_type, stock) values (34, 9, "double_room", 34);
insert into room (id, hotel_id, room_type, stock) values (35, 9, "junior_suite", 35);
insert into room (id, hotel_id, room_type, stock) values (36, 9, "suite", 36);


insert into roomfeature (id, hotel_id, room_id, bed_count, squaremeters, tv, minibar, console, safe, projector) values (1, 1, 1, 1, 1, false, false, false, true, false);
insert into roomfeature (id, hotel_id, room_id, bed_count, squaremeters, tv, minibar, console, safe, projector) values (2, 1, 2, 2, 2, false, false, false, true, false);
insert into roomfeature (id, hotel_id, room_id, bed_count, squaremeters, tv, minibar, console, safe, projector) values (3, 1, 3, 3, 3, false, true, false, true, true);
insert into roomfeature (id, hotel_id, room_id, bed_count, squaremeters, tv, minibar, console, safe, projector) values (4, 1, 4, 4, 4, false, true, true, true, false);
insert into roomfeature (id, hotel_id, room_id, bed_count, squaremeters, tv, minibar, console, safe, projector) values (5, 2, 5, 5, 5, false, true, false, false, true);
insert into roomfeature (id, hotel_id, room_id, bed_count, squaremeters, tv, minibar, console, safe, projector) values (6, 2, 6, 6, 6, false, false, true, true, true);
insert into roomfeature (id, hotel_id, room_id, bed_count, squaremeters, tv, minibar, console, safe, projector) values (7, 2, 7, 7, 7, false, false, true, true, false);
insert into roomfeature (id, hotel_id, room_id, bed_count, squaremeters, tv, minibar, console, safe, projector) values (8, 2, 8, 8, 8, false, false, true, true, true);
insert into roomfeature (id, hotel_id, room_id, bed_count, squaremeters, tv, minibar, console, safe, projector) values (9, 3, 9, 9, 9, true, false, true, true, true);
insert into roomfeature (id, hotel_id, room_id, bed_count, squaremeters, tv, minibar, console, safe, projector) values (10, 3, 10, 10, 10, true, true, true, false, true);
insert into roomfeature (id, hotel_id, room_id, bed_count, squaremeters, tv, minibar, console, safe, projector) values (11, 3, 11, 11, 11, true, true, true, true, true);
insert into roomfeature (id, hotel_id, room_id, bed_count, squaremeters, tv, minibar, console, safe, projector) values (12, 3, 12, 12, 12, false, true, true, false, true);
insert into roomfeature (id, hotel_id, room_id, bed_count, squaremeters, tv, minibar, console, safe, projector) values (13, 4, 13, 13, 13, false, false, true, true, false);
insert into roomfeature (id, hotel_id, room_id, bed_count, squaremeters, tv, minibar, console, safe, projector) values (14, 4, 14, 14, 14, false, false, false, false, false);
insert into roomfeature (id, hotel_id, room_id, bed_count, squaremeters, tv, minibar, console, safe, projector) values (15, 4, 15, 15, 15, false, true, true, false, true);
insert into roomfeature (id, hotel_id, room_id, bed_count, squaremeters, tv, minibar, console, safe, projector) values (16, 4, 16, 16, 16, false, true, true, false, false);
insert into roomfeature (id, hotel_id, room_id, bed_count, squaremeters, tv, minibar, console, safe, projector) values (17, 5, 17, 17, 17, true, false, true, true, true);
insert into roomfeature (id, hotel_id, room_id, bed_count, squaremeters, tv, minibar, console, safe, projector) values (18, 5, 18, 18, 18, true, false, true, false, true);
insert into roomfeature (id, hotel_id, room_id, bed_count, squaremeters, tv, minibar, console, safe, projector) values (19, 5, 19, 19, 19, true, false, true, false, true);
insert into roomfeature (id, hotel_id, room_id, bed_count, squaremeters, tv, minibar, console, safe, projector) values (20, 5, 20, 20, 20, false, false, true, false, true);
insert into roomfeature (id, hotel_id, room_id, bed_count, squaremeters, tv, minibar, console, safe, projector) values (21, 6, 21, 21, 21, false, true, true, true, false);
insert into roomfeature (id, hotel_id, room_id, bed_count, squaremeters, tv, minibar, console, safe, projector) values (22, 6, 22, 22, 22, true, true, true, false, true);
insert into roomfeature (id, hotel_id, room_id, bed_count, squaremeters, tv, minibar, console, safe, projector) values (23, 6, 23, 23, 23, true, true, true, true, true);
insert into roomfeature (id, hotel_id, room_id, bed_count, squaremeters, tv, minibar, console, safe, projector) values (24, 6, 24, 24, 24, true, false, true, false, false);
insert into roomfeature (id, hotel_id, room_id, bed_count, squaremeters, tv, minibar, console, safe, projector) values (25, 7, 25, 25, 25, false, true, false, false, true);
insert into roomfeature (id, hotel_id, room_id, bed_count, squaremeters, tv, minibar, console, safe, projector) values (26, 7, 26, 26, 26, true, false, false, false, true);
insert into roomfeature (id, hotel_id, room_id, bed_count, squaremeters, tv, minibar, console, safe, projector) values (27, 7, 27, 27, 27, true, true, true, true, false);
insert into roomfeature (id, hotel_id, room_id, bed_count, squaremeters, tv, minibar, console, safe, projector) values (28, 7, 28, 28, 28, true, true, false, true, true);
insert into roomfeature (id, hotel_id, room_id, bed_count, squaremeters, tv, minibar, console, safe, projector) values (29, 8, 29, 29, 29, true, false, true, false, true);
insert into roomfeature (id, hotel_id, room_id, bed_count, squaremeters, tv, minibar, console, safe, projector) values (30, 8, 30, 30, 30, false, false, false, true, true);
insert into roomfeature (id, hotel_id, room_id, bed_count, squaremeters, tv, minibar, console, safe, projector) values (31, 8, 31, 31, 31, true, true, true, false, false);
insert into roomfeature (id, hotel_id, room_id, bed_count, squaremeters, tv, minibar, console, safe, projector) values (32, 8, 32, 32, 32, true, false, true, true, true);
insert into roomfeature (id, hotel_id, room_id, bed_count, squaremeters, tv, minibar, console, safe, projector) values (33, 9, 33, 33, 33, false, false, true, true, false);
insert into roomfeature (id, hotel_id, room_id, bed_count, squaremeters, tv, minibar, console, safe, projector) values (34, 9, 34, 34, 34, false, true, true, false, true);
insert into roomfeature (id, hotel_id, room_id, bed_count, squaremeters, tv, minibar, console, safe, projector) values (35, 9, 35, 35, 35, false, false, true, false, true);
insert into roomfeature (id, hotel_id, room_id, bed_count, squaremeters, tv, minibar, console, safe, projector) values (36, 9, 36, 36, 36, false, false, true, false, false);

 */