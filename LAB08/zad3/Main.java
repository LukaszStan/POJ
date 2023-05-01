package zad3;

import java.io.File;

public class Main {
    public static void main(String[] args){
        String baseDir = "zad3/basedir/";

        File directory = new File(baseDir);

        if (!directory.isDirectory()) {
            System.out.println("Podana ścieżka nie jest katalogiem.");
            return;
        }

        File[] directories = directory.listFiles(File::isDirectory);
        int maxFilesCount = 0;
        String maxFilesDirectory = "";

        for (File dir : directories) {
            File[] files = dir.listFiles(File::isFile);
            int filesCount = files.length;
            if (filesCount > maxFilesCount) {
                maxFilesCount = filesCount;
                maxFilesDirectory = dir.getName();
            }
        }

        System.out.println("Katalog z największą ilością plików to: " + maxFilesDirectory +
                " (" + maxFilesCount + " plików)");
    }
}
