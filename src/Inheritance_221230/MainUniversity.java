package Inheritance_221230;

public class MainUniversity {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ayhan Unlu", "+905005002020", "a@a.com");

        // System.out.println(employee1.getNameSurname());
        // System.out.println();
        // employee1.enter();

        Academician academician1 = new Academician("Mahmut Hodja", "+905005005050", "mahmut@patika.dev", "CENG",
                "Associated Proffessor");

        // academician1.exitUniversity();
        // System.out.println(academician1.getEmailAddress());
        // System.out.println(academician1.getStatus());

        // academician1.enterCourse();

        CivilServant civilServant1 = new CivilServant("Hafize Civil Servant", "+905005015020304", "haf@patika.dev",
                "CENG", "24/7");

        // civilServant1.work();

        Employee  civilServant2 = new CivilServant ("Body Ekrem", "+905015023456", "body@kodluyoruz.org", "PR", "09-18");

        civilServant2.goToMesshall();
  //      civilServant2.work();
        civilServant1.work();

        Lecturer lecturer1 = new Lecturer("No Ashes", "+905555555555", "noAsh@gmail.com", "CENG", "proffesor", "123");


        lecturer1.senateMeeting();
        lecturer1.makeExam();

        Assistant assistant1 = new Assistant ("Intern Ali", "+905435432121", "intern@patika.dev", "Bootcamp", "Assistant", "10-18");

        assistant1.enterUniversity();
        assistant1.enterCourse();
        assistant1.makeQuiz();

    }
}
