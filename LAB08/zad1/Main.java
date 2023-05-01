package zad1;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File exerciseDir = new File("exercise");
        try {
            exerciseDir.mkdir();
            File file1 = new File("exercise/file1.txt");
            file1.createNewFile();
            File file2 = new File("exercise/file2.txt");
            file2.createNewFile();
            File file3 = new File("exercise/file3.txt");
            file3.createNewFile();

            File dir1 = new File("exercise/dir1");
            dir1.mkdir();
            File dir2 = new File("exercise/dir2");
            dir2.mkdir();
        } finally {
            System.out.println("Files and directories are already created");
        }
        InformationProvider infoProvider = new InformationProvider();

        for (File file : exerciseDir.listFiles()) {
            infoProvider.displayInformation(file);
        }
    }
}
