package _240805_MultiThread_Concurency._Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberSorter implements Runnable {
    ArrayList<Integer> totalNumbers = new ArrayList<>(10000);
    List<Integer> dividedList1 = new ArrayList<>(2500);
    List<Integer> dividedList2 = new ArrayList<>(2500);
    List<Integer> dividedList3 = new ArrayList<>(2500);
    List<Integer> dividedList4 = new ArrayList<>(2500);
    ArrayList<Integer> oddNumbers = new ArrayList<>(5000);
    ArrayList<Integer> evenNumbers = new ArrayList<>(5000);

    // List<Integer> dividedList;

    public NumberSorter(/*
                         * List<Integer> dividedList, ArrayList<Integer> oddNumbers, ArrayList<Integer>
                         * evenNumbers
                         */) {
        // this.dividedList=dividedList;
        this.oddNumbers = oddNumbers;
        this.evenNumbers = evenNumbers;
    }

    // public List<Integer> getDividedList(){
    // return dividedList;
    // }

    // public void setDividedList(List<Integer> dividedList){
    // this.dividedList=dividedList;
    // }

    public ArrayList<Integer> getOddNumbers() {
        return oddNumbers;
    }

    public void setOddNumbers(ArrayList<Integer> oddNumbers) {
        this.oddNumbers = oddNumbers;
    }

    public ArrayList<Integer> getEvenNumbers() {
        return evenNumbers;
    }

    public void setEvenNumbers(ArrayList<Integer> evenNumbers) {
        this.evenNumbers = evenNumbers;
    }

    public synchronized void run() {

        for (int i = 1; i <= 10000; i++) {
            totalNumbers.add(i);
        }

        dividedList1 = totalNumbers.subList(0, 2500);
        dividedList2 = totalNumbers.subList(2500, 5000);
        dividedList3 = totalNumbers.subList(5000, 7500);
        dividedList4 = totalNumbers.subList(7500, 10000);

        // printList(totalNumbers);
        // printList(dividedList1);
        // printList(dividedList2);
        // printList(dividedList3);
        // printList(dividedList4);
        // decideNumberType(dividedList1);
        // decideNumberType(dividedList2);
        // decideNumberType(dividedList3);
        // decideNumberType(dividedList4);

        switch (Thread.currentThread().getName()) {
            case "t1":
                decideNumberType(dividedList1, Thread.currentThread().getName());

                break;
            case "t2":
                decideNumberType(dividedList2, Thread.currentThread().getName());
                break;
            case "t3":
                decideNumberType(dividedList3, Thread.currentThread().getName());
                break;
            case "t4":
                decideNumberType(dividedList4, Thread.currentThread().getName());
                break;

            default:
                break;
        }

        Collections.sort(oddNumbers);
        Collections.sort(evenNumbers);

        printList(oddNumbers);
        printList(evenNumbers);

    }

    public void divideTotalNumbers(ArrayList<Integer> totalNumbers) {
    }

    public synchronized void decideNumberType(List list, String threadName) {

        for (int i = 0; i < 2500; i++) {
            if ((int) list.get(i) % 2 == 0) {
                evenNumbers.add((int) list.get(i));
                // System.out.print(threadName + "-" + list.get(i) + ", ");
            } else {
                oddNumbers.add((int) list.get(i));
                // System.out.print(threadName + "-" + list.get(i) + ", ");
            }
        }

    }

    public static void printList(ArrayList list) {
        if (list.size() == 5000)
            System.out.println(list);
        // System.out.println("#######################################################");
    }

    public static void printList(List list) {
        System.out.println(list);
        // System.out.println("#######################################################");
    }
}
