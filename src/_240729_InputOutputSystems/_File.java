package _240729_InputOutputSystems;

import java.io.File;
import java.io.IOException;

public class _File {
    public static void main(String[] args) {

//        File currentFile = new File("patika.txt");
//        File currentFile= new File("src/_240729_InputOutputSystems/patika.txt");
//xx        File currentFile=new File("_240729_InputOutputSystems/patika.txt");
        File currentFolder=new File("patika/test");
        System.out.println(currentFolder.mkdirs());

        File currentFile = new File("patika/test/patika.txt");

        File fileList=new File("src");

        String [] currentFileList=fileList.list();

        for(String str:currentFileList){
            System.out.println(str);
        }
    try {
            if (currentFile.createNewFile()) {
                System.out.println(currentFile.getName() + " file is created.");
            }else{
                System.out.println(currentFile.getName()+ " file is already created.");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(currentFile.delete());
        System.out.println(currentFile.delete());

        /*
         * try {
         * currentFile.createNewFile();
         * } catch (IOException e) {
         * e.printStackTrace();
         * }
         */ }
}
