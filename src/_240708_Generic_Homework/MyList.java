package _240708_Generic_Homework;

import java.util.Arrays;

public class MyList<T> {

    private int capacity;
    private int size;
    private T[] arr;

    @SuppressWarnings("unchecked")
    MyList() {
        this.size = 0;
        this.capacity = 10;
        this.arr = (T[]) new Object[capacity];
    }

    @SuppressWarnings("unchecked")
    MyList(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        this.arr = (T[]) new Object[capacity];
    }

    // how to get the size of the array
    public int getSize() {
        return size;
    }

    // how to get the length of the array
    public int getCapacity() {
        return capacity;
    }

    // how to add data to the array+increase the capacity of the array if needed
    public void add(T data) {
        if (this.size < this.capacity) {
            this.arr[this.size] = data;
            this.size++;
        } else {
            this.capacity *= 2;
            System.out.println("Array capacity is doubled due to lack of empty index");
        }

    }

    // how to get the data from a a specifix index
    public T get(int index) {
        if (index > this.size) {
            return null;
        } else {
            return this.arr[index];
        }

    }

    // how to remove the data from a specific index and move the rest of the array
    // to a new index number
    public void remove(int index) {
        for (int i = index; i < arr.length - 1; i++) {
            this.arr[i] = this.arr[i + 1];
        }
        arr[arr.length - 1] = null;
        size--;
    }

    // how to set data to a specific index
    public void set(int index, T data) {
        this.arr[index] = data;
    }

    // how to print array
    public void print() {
        System.out.println("[");
        for (T t : arr) {
            if (t != null) {
                System.out.println(t + " ");
            } else {
                System.out.println("]");
            }
        }
    }

    // how to return the index number of the specific data
    public int indexOf(T data) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data) {
                return i;
            }
        }
        return -1;
    }

    // how to return the last index number of the specific data
    /*
     * public int lastIndexOf(T data){
     * for (int i=arr.length;0<=i;i--){
     * if (arr[i]==data){
     * return i;
     * }
     * }return -1;
     * }
     */
    // how to return the last index number of the specific data
    public int lastIndexOf(T data) {
        int counter = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data) {
                return counter;
            }
        }
        return counter;
    }

    // how to check if the array is empty
    public boolean isEmpty() {
        return this.size == 0;
    }

    // how to copy the array
    public T[] toArray() {
        return Arrays.copyOf(arr, size);
    }

    // how to remove all elements in the list (in fact creating an empty list)
    @SuppressWarnings("unchecked")
    public void clear() {
        arr = (T[]) new Object[10];
        size = 0;
    }

    // how to remove all elements in the list (by making all elements null)
    public void deleteAllElements() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = null;
        }
    }

    // how to make a sublist that starts and finishes on specific index numbers
    public MyList<T> sublist(int start, int finish) {
        MyList<T> subList = new MyList<>(finish - start + 1);
        for (int i = start; i <= finish; i++) {
            subList.add(this.get(i));
        }
        return subList;
    }

    // how to decide whether the data is in the list or not
    public boolean isContains(T data){
        return indexOf(data)!=-1;
    }

}