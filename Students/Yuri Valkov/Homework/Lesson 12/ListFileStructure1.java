import java.io.File;
import java.util.ArrayList;

public class ListFileStructure1 {
    private static ArrayList<File> listWithFileNames = new ArrayList<>();
    public static void main(String[] args) {
        getListFiles("C://Users/Yurik");

        for (File fil : listWithFileNames) {
            System.out.println(fil.getName());
        }
    }

    public static void getListFiles(String str) {
        File f = new File(str);
        for (File s : f.listFiles()) {
            if (s.isFile()) {
                listWithFileNames.add(s); // Милен: По-добре е да попълниш масива и да го вършен... По начина по който си го направил, остава малко скрито какво се случа. Метода ти се казва getListFiles, а нищо не връща :)
            } else if (s.isDirectory()) {
                getListFiles(s.getAbsolutePath());
            }
        }

    }

}