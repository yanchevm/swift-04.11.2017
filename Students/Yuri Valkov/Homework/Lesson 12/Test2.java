import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class Test2 {

    private Deque<File> queue = new ArrayDeque<File>();

    public void Lister(String pathname) throws IOException {
        File path = new File(pathname);
        if (!path.exists()) {
            throw new IOException("Cannot access " + path.getAbsolutePath() + ": No such file or directory");
        }
        queue.addLast(path);

        while (!queue.isEmpty()) {
            path = queue.removeFirst();
            if (path.isDirectory()) {
                File[] files = path.listFiles();
                for (File item : files){
                    if (item.isDirectory()){
                        queue.addLast(item);
                    }
                    else
                        //if (item.getName().indexOf("cv")>=0)
                        System.out.print(item.getAbsolutePath()+"\n");
                }
            }
        }
    }


    public static void main(String args[]) {
        Test2 m = new Test2();
        try {
            m.Lister("D:/Java");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}