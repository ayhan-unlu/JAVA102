package _240718_PatikaStore;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Menu {

    public void printMainMenu() {
        System.out.println("Patika Store Management Panel");
        System.out.println("-----------------------------\n1- Notebooks:\n2- Mobiles\n3- Brand List\n0- Exit");
        System.out.println();
        System.out.println("Please enter your selection(0-3): ");
    }

    public void printNotebookMenu() {
        System.out.println("Notebook Related Issues");
        System.out.println(
                "-----------------------------\n1- Add a Notebook:\n2- Delete a Notebook by Id\n3-List Notebooks\n0-Return to the Store Management Panel");
        System.out.println();
        System.out.println("Please enter your selection(0-3): ");

    }

    public void printMobileMenu() {
        System.out.println("Mobile Related Issues");
        System.out.println(
                "-----------------------------\n1- Add a Mobile:\n2- Delete a Mobile by Id\n3-List Mobiles\n0-Return to the Store Management Panel");
        System.out.println();
        System.out.println("Please enter your selection(0-3): ");

    }

    public void printInvalidInput() {
        System.out.println("You have entered an invalid value. Please Try again.");
    }

    public void runMainMenu(Brand b, TreeSet<Brand> brandList, Notebook n, ArrayList<Notebook> notebookList, Mobile m,
            ArrayList<Mobile> mobileList) {

        boolean isExit = true;
        Scanner scan = new Scanner(System.in);

        while (isExit) {
            try {
                printMainMenu();
                int selection = scan.nextInt();

                switch (selection) {
                    case 0:
                        System.out.println("Thanks for visiting us. Bye for now.");
                        isExit = false;
                        break;

                    case 1:
                        runNotebookMenu(b, brandList, n, notebookList, m, mobileList);
                        break;

                    case 2:
                        printMobileMenu();
                        break;

                    case 3:
                        b.printBrandFullList(brandList);
                        runMainMenu(b, brandList, n, notebookList, m, mobileList);
                        break;

                    default:
                        printInvalidInput();
                        runMainMenu(b, brandList, n, notebookList, m, mobileList);
                        break;
                }
                /*
                 * * n.deleteNotebook(1, notebookList);
                 * case 3:
                 * n.printNotebookFullList(notebookList);
                 * default:
                 * break;
                 * }
                 * }
                 * case 2: {
                 * 
                 * m.printMobileFullList(mobileList);
                 * m.deleteMobile(2, mobileList);
                 * m.printMobileFullList(mobileList);
                 */

                /*
                 * switch (selection) {
                 * case 0: {
                 * break;
                 * }
                 * case 1: {
                 * screen.notebookScreen();
                 * switch (selection) {
                 * case 0:
                 * screen.mainScreen();
                 * 
                 * case 1:
                 * screen.mainScreen();
                 * case 2:
                 * screen.mainScreen();
                 * screen.getUsersSelection();
                 * 
                 * }
                 * case 3: {
                 * b.printBrandFullList(brandList);
                 * screen.mainScreen();
                 * screen.getUsersSelection();
                 * }
                 * }
                 */
                isExit = false;
            } catch (Exception e) {
                printInvalidInput();
                runMainMenu(b, brandList, n, notebookList, m, mobileList);
            }
        }
        scan.close();
    }

    public void runNotebookMenu(Brand b, TreeSet<Brand> brandList, Notebook n, ArrayList<Notebook> notebookList,
            Mobile m,
            ArrayList<Mobile> mobileList) {

        boolean isExit = true;
        Scanner scan = new Scanner(System.in);

        while (isExit) {
            try {
                printNotebookMenu();
                int selection = scan.nextInt();

                switch (selection) {
                    case 0:
                        runMainMenu(b, brandList, n, notebookList, m, mobileList);
                        break;

                    case 1:
                        runNotebookMenu(b, brandList, n, notebookList, m, mobileList);
                        break;

                    case 2:
                        runNotebookMenu(b, brandList, n, notebookList, m, mobileList);
                        break;

                    case 3:
                        n.printNotebookFullList(notebookList);
                        runNotebookMenu(b, brandList, n, notebookList, m, mobileList);
                        break;

                    default:
                        printInvalidInput();
                        runNotebookMenu(b, brandList, n, notebookList, m, mobileList);
                        break;
                }
                /*
                 * * n.deleteNotebook(1, notebookList);
                 * case 3:
                 * n.printNotebookFullList(notebookList);
                 * default:
                 * break;
                 * }
                 * }
                 * case 2: {
                 * 
                 * m.printMobileFullList(mobileList);
                 * m.deleteMobile(2, mobileList);
                 * m.printMobileFullList(mobileList);
                 */

                /*
                 * switch (selection) {
                 * case 0: {
                 * break;
                 * }
                 * case 1: {
                 * screen.notebookScreen();
                 * switch (selection) {
                 * case 0:
                 * screen.mainScreen();
                 * 
                 * case 1:
                 * screen.mainScreen();
                 * case 2:
                 * screen.mainScreen();
                 * screen.getUsersSelection();
                 * 
                 * }
                 * case 3: {
                 * b.printBrandFullList(brandList);
                 * screen.mainScreen();
                 * screen.getUsersSelection();
                 * }
                 * }
                 */
                isExit = false;
            } catch (Exception e) {
                printInvalidInput();
                runNotebookMenu(b, brandList, n, notebookList, m, mobileList);
            }
        }
        scan.close();
    }

    public void runMobileMenu(Brand b, TreeSet<Brand> brandList, Notebook n, ArrayList<Notebook> notebookList,
            Mobile m, ArrayList<Mobile> mobileList) {

        boolean isExit = true;
        Scanner scan = new Scanner(System.in);

        while (isExit) {
            try {
                printMobileMenu();
                int selection = scan.nextInt();

                switch (selection) {
                    case 0:
                        runMainMenu(b, brandList, n, notebookList, m, mobileList);
                        break;

                    case 1:
                        runMobileMenu(b, brandList, n, notebookList, m, mobileList);
                        break;

                    case 2:
                        runMobileMenu(b, brandList, n, notebookList, m, mobileList);
                        break;

                    case 3:
                        m.printMobileFullList(mobileList);
                        runMobileMenu(b, brandList, n, notebookList, m, mobileList);
                        break;

                    default:
                        printInvalidInput();
                        runMobileMenu(b, brandList, n, notebookList, m, mobileList);
                        break;
                }
                /*
                 * * n.deleteNotebook(1, notebookList);
                 * case 3:
                 * n.printNotebookFullList(notebookList);
                 * default:
                 * break;
                 * }
                 * }
                 * case 2: {
                 * 
                 * m.printMobileFullList(mobileList);
                 * m.deleteMobile(2, mobileList);
                 * m.printMobileFullList(mobileList);
                 */

                /*
                 * switch (selection) {
                 * case 0: {
                 * break;
                 * }
                 * case 1: {
                 * screen.notebookScreen();
                 * switch (selection) {
                 * case 0:
                 * screen.mainScreen();
                 * 
                 * case 1:
                 * screen.mainScreen();
                 * case 2:
                 * screen.mainScreen();
                 * screen.getUsersSelection();
                 * 
                 * }
                 * case 3: {
                 * b.printBrandFullList(brandList);
                 * screen.mainScreen();
                 * screen.getUsersSelection();
                 * }
                 * }
                 */
                isExit = false;
            } catch (Exception e) {
                printInvalidInput();
                runMobileMenu(b, brandList, n, notebookList, m, mobileList);
            }
        }
        scan.close();
    }
}