package Inheritance_221230;

public class MainUniversity {
        public static void main(String[] args) {
                Employee employee1 = new Employee("Ayhan Unlu", "+905005002020", "a@a.com");

                System.out.println(employee1.getNameSurname());
                employee1.enterUniversity();

        //       Academician academician1 = new Academician("Mahmut Hodja", "+905005005050", "mahmut@patika.dev", "CENG",                                "Associated Proffessor");

        //        academician1.exitUniversity();
        //        System.out.println(academician1.getEmailAddress());
        //        System.out.println(academician1.getStatus());

        //        academician1.enterCourse();

          //      CivilServant civilServant1 = new CivilServant("Hafize Mom", "+905005015020304",                                "haf@patika.dev",                                "CENG", "24/7");
        //        civilServant1.work();

           //     Employee civilServant2 = new CivilServant("Body Ekrem", "+905015023456", "body@kodluyoruz.org", "PR",                                "09-18");

         //       civilServant2.goToMesshall();
                // civilServant2.work();
        //        civilServant1.work();

                Lecturer lecturer1 = new Lecturer("No Ashes", "+905555555555", "noAsh@gmail.com", "CENG", "proffesor",
                                "123");

                lecturer1.senateMeeting();
                lecturer1.makeExam();

                Assistant assistant1 = new Assistant("Assistant Ali", "+905435432121", "intern@patika.dev", "Bootcamp",
                                "Assistant", "10-18");

           //     assistant1.enterUniversity();
           //     assistant1.enterCourse();
                assistant1.makeQuiz();

                LabAssistant labAssistant1 = new LabAssistant("Patika Dev", "+9055555552020", "patika@patika.dev",
                                "CENG",
                                "Assistant", "07-19");

           //     labAssistant1.enterUniversity();
           //     labAssistant1.enterCourse();
                labAssistant1.makeQuiz();
                labAssistant1.enterLab();

                IT_Personel IT_Personel1 = new IT_Personel("IT guy", "+906665554433", "it_guy@it.com", "IT Department",
                                "08-18",
                                "network");

           //     IT_Personel1.exitUniversity();
           //     IT_Personel1.work();
                IT_Personel1.networkEstablishment();

                Security_Personel securityPersonel1 = new Security_Personel("Mr. Halil", "+905055052233",
                                "halil@patika.dev",
                                "security", "10-22", "entrance Document");

           //     securityPersonel1.goToMesshall();
          //      securityPersonel1.work();
                securityPersonel1.shift();

                // Method overloading...
                System.out.println();
                lecturer1.enterUniversity();
                System.out.println();
            //    lecturer1.enterUniversity("10:00");
                System.out.println();
            //    lecturer1.enterUniversity("10:00", "A");
                System.out.println();

                // method overriding..
                lecturer1.enterUniversity();

                // Polimorphism
                System.out.println("**************");
                employee1.enterUniversity();
        //        academician1.enterUniversity();
                lecturer1.enterUniversity();
        //        civilServant1.enterUniversity();

               // Employee academician2 = new Academician("Kodluyoruz","+905554443322","a@kodluyoruz.org","Coding","Prof.");
                System.out.println("**************");
               // academician2.enterUniversity();
               //academician2.exitUniversity();
                
                System.out.println("**************");
                //int [] enteredEmployee = new int[5];
                //Academician [] enteredEmployeeList = {employee1,academician1,lecturer1,assistant1,labAssistant1,civilServant1,IT_Personel1,securityPersonel1};
              //  Employee [] enteredEmployeeList = {employee1,academician1,lecturer1,assistant1,labAssistant1,civilServant1,IT_Personel1,securityPersonel1};

               // Employee.whoEnteredUniversity(enteredEmployeeList);
                  
                //Abstraction 
                


        }
}
