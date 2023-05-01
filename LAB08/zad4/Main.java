package zad4;
import java.io.*;
import java.nio.file.*;
import java.time.*;
import java.time.format.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String inboundDir = "inbound";
        String outboundDir = "outbound";

        File inboundDirFile = new File(inboundDir);
        File outboundDirFile = new File(outboundDir);

        if (!inboundDirFile.isDirectory()) {
            System.out.println("Błąd: " + inboundDir + " nie jest katalogiem.");
            return;
        }

        if (!outboundDirFile.isDirectory()) {
            System.out.println("Błąd: " + outboundDir + " nie jest katalogiem.");
            return;
        }

        File[] files = inboundDirFile.listFiles();

        for (File file : files) {
            if (file.isFile()) {
                try {
                    String filename = file.getName();
                    String newFilename = getNewFilename(filename);
                    String content = readFileContent(file);
                    String newContent = transformContent(content);
                    saveFile(outboundDir, newFilename, newContent);
                    deleteFile(file);
                } catch (IOException e) {
                    System.out.println("Błąd przetwarzania pliku " + file.getName() + ": " + e.getMessage());
                }
            }
        }
    }

    private static String getNewFilename(String filename) {
        String extension = getExtension(filename);
        String baseName = getBaseName(filename);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        LocalDateTime dateTime = LocalDateTime.now();
        String timestamp = dateTime.format(formatter);
        return baseName + "_" + timestamp + "." + extension + ".out";
    }

    private static String getExtension(String filename) {
        int dotIndex = filename.lastIndexOf(".");
        if (dotIndex == -1) {
            return "";
        } else {
            return filename.substring(dotIndex + 1);
        }
    }

    private static String getBaseName(String filename) {
        int dotIndex = filename.lastIndexOf(".");
        if (dotIndex == -1) {
            return filename;
        } else {
            return filename.substring(0, dotIndex);
        }
    }

    private static String readFileContent(File file) throws IOException {
        StringBuilder contentBuilder = new StringBuilder();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            contentBuilder.append(line);
            contentBuilder.append(System.lineSeparator());
        }
        reader.close();
        return contentBuilder.toString();
    }

    private static String transformContent(String content) {
        String transformedContent = content.replaceAll(" ", "_");
        char[] chars = transformedContent.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    chars[i] = (char) (((c - 'A') + 3) % 26 + 'A');
                } else {
                    chars[i] = (char) (((c - 'a') + 3) % 26 + 'a');
                }
            }
        }
        return new String(chars);
    }

    private static void saveFile(String directory, String filename, String content) throws IOException {
        String filePath = Paths.get(directory, filename).toString();
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
        writer.write(content);
        writer.close();
    }

    private static void deleteFile(File file) {
        file.delete();
    }

}
