package _240706_Generic;

//public class Student implements IDatabase<Student>{

/*    @Override
    public boolean insert(Student data){
        return false;
    }

    @Override
    public boolean delete(Student data){
        return false;
    }

    @Override
    public boolean update(Student data){
        return false;
    }

    @Override
    public Student select (){
        return null;
    } */

/*public class Student implements IDatabase<String> {

    @Override
    public boolean insert(String data){
        return false;
    }

    @Override
    public boolean delete(String data){
        return false;
    }

    @Override
    public boolean update(String data){
        return false;
    }

    @Override
    public String select(){
        return null;
    }
*/
public class Student<T> implements IDatabase<T> {

    @Override
    public boolean insert(T data) {
        System.out.println("The data is added");
        System.out.println(data);
        return true;
        // return false;
    }

    @Override
    public boolean delete(T data) {
        System.out.println("The data is deleted");
        System.out.println(data);
        return true;
        // return false;
    }

    @Override
    public boolean update(T data) {
        System.out.println("The data is updated");
        System.out.println(data);
        return true;
        // return false;
    }

    @Override
    public T select() {
        System.out.println("The data is viewed");
        return null;
    }
}