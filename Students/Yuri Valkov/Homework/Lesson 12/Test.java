import java.io.File;
import java.io.IOException;

public class Test {

    public static void main(final String[] args) throws IOException {

        System.out.println("List down all the files present on the server directory");
        File file1 = new File("D:/Java");
        File[] files = file1.listFiles();
        if (null != files) {
            for (int fileIntList = 0; fileIntList < files.length; fileIntList++) {
                String ss = files[fileIntList].toString();
                if (null != ss && ss.length() > 0) {
                    System.out.println("File: " + (fileIntList + 1) + " :" + ss.substring(ss.lastIndexOf("\\") + 1, ss.length()));
                }
            }
        }


    }


}