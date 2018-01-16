package Homework.HWLecture12;
import java.io.File;
import java.util.Scanner;

public class Task1_ListFileStructure {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter path: ");
        String pathName = sc.nextLine();
        listFiles(pathName);
    }

    private static void listFiles(String path){
        File folder = new File(path);
        File[] files = folder.listFiles();
        for (File file : files)
        {
                System.out.println(file.getAbsolutePath());
        }
    }

}
