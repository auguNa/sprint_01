package s01_05.n1ejercicio1;

import java.io.File;
import java.util.Arrays;

public class DirectoryLister {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java DirectoryLister <directory_path>");
            System.exit(1);
        }

        String directoryPath = args[0];
        File directory = new File(directoryPath);

        if (!directory.exists() || !directory.isDirectory()) {
            System.err.println("Invalid directory path provided.");
            System.exit(1);
        }

        String[] files = directory.list();
        if (files != null) {
            Arrays.sort(files);
            System.out.println("Contents of directory '" + directoryPath + "' (Alphabetically sorted):");
            for (String file : files) {
                System.out.println(file);
            }
        } else {
            System.err.println("An error occurred while listing the contents of the directory.");
        }
    }
}

