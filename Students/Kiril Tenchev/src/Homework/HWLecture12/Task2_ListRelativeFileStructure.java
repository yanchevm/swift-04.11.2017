package Homework.HWLecture12;

import java.io.File;
import java.util.Scanner;

public class Task2_ListRelativeFileStructure {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter path: ");
        String pathName = sc.nextLine();
        listFiles(pathName);
    }

    private static void listFiles(String path) {
        File folder = new File(path);
        File[] files = folder.listFiles();
        
	for (File file : files) {
            if (file.isFile()) {
            	System.out.println(file.getName());
            } else if (file.isDirectory()) {
               System.out.print(file.getName()+"\\");
               listFiles(file.getAbsolutePath());
                //когато влезе в този цикъл веднъж после седи в дадената папака и
                // върти горния if и след като изкара всички файлове от папката без пътя,
                // дегакто трябвада показва постоянно поддиректориите, ако нее в главната директория
                //тествам програмата с папката на Angel toshev от гит-а и не знам дали изпълнието на програмата е
                //точно като описанието ?
		
		//Милен: Много яко си се опитал с рекурсия! БРАВО! 
		// Проблема е, че дъното не ти е много добре! 
            }
        }
    }

// Милен: Ето един пример как да го направиш! 
/*
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter path: ");
        String pathName = sc.nextLine();

        File root = new File(pathName);

        if (! root.exists()) {
            System.out.println("Invalid path name " + pathName);

            return;
        }

        listFiles(root);
    }
    private static void listFiles(File root) throws IOException {
        //Bottom of the recursion
        if (root.isFile() || root.listFiles().length == 0) {
            System.out.println(root.getCanonicalPath());

            return;
        }

        for (File file : root.listFiles()) {
            listFiles(file);
        }
    }
*/

}

