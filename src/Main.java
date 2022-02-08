import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static java.util.Scanner scanner = new java.util.Scanner((System.in));
    static String[]hashtags = new String[5];


    static void firstHashtag(){
        System.out.print("Enter First Custom Hashtag: ");
        String firstCustomHashtagInput = scanner.nextLine();
        String firstFinalHashtag = firstCustomHashtagInput.toLowerCase();
        hashtags[0] = firstFinalHashtag;

    }

    static void secondHashtag(){
        System.out.print("Enter Second Custom Hashtag: ");
        String secondCustomHashtagInput = scanner.nextLine();
        String secondFinalHashtag = secondCustomHashtagInput.toLowerCase();
        hashtags[1] = secondFinalHashtag;
    }

    static void thirdHashtag(){
        System.out.print("Enter Third Custom Hashtag: ");
        String thirdCustomHashtagInput = scanner.nextLine();
        String thirdFinalHashtag = thirdCustomHashtagInput.toLowerCase();
        hashtags[2] = thirdFinalHashtag;
    }

    static void printHashtags(){


            File file = new File("src/hashtags.txt");
        LineNumberReader lineNumberReader = null;
        try {
            lineNumberReader = new LineNumberReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
                lineNumberReader.skip(Long.MAX_VALUE);
            } catch (IOException e) {
                e.printStackTrace();
            }
            int countLines = lineNumberReader.getLineNumber();
            try {
                lineNumberReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("Total lines read: " + countLines);

        Random r = new Random();


        try {
            if (hashtags[0] == null){
                int random = r.nextInt(countLines - 1) + 1;
                String line = Files.readAllLines(Paths.get("src/hashtags.txt")).get(random);
                hashtags[0] = line;
            }
            if (hashtags[1] == null){
                int random = r.nextInt(countLines - 1) + 1;
                String line = Files.readAllLines(Paths.get("src/hashtags.txt")).get(random);
                hashtags[1] = line;
            }
            if (hashtags[2] == null){
                int random = r.nextInt(countLines - 1) + 1;
                String line = Files.readAllLines(Paths.get("src/hashtags.txt")).get(random);
                hashtags[2] = line;
            }

            if (hashtags[3] == null){
                int random = r.nextInt(countLines - 1) + 1;
                String line = Files.readAllLines(Paths.get("src/hashtags.txt")).get(random);
                hashtags[3] = line;
            }
            if (hashtags[4] == null){
                int random = r.nextInt(countLines - 1) + 1;
                String line = Files.readAllLines(Paths.get("src/hashtags.txt")).get(random);
                hashtags[4] = line;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        for (String c : hashtags){
            System.out.println("#" + c.toLowerCase());
        }

    }


    public static void main(String[] args) {

        boolean endProgram = false;
        while (!endProgram) {
            System.out.println();
            System.out.println();
            System.out.println("Main Menu");
            System.out.println("---------");
            System.out.println();
            System.out.println("    F  -> Enter First Custom Hashtag");
            System.out.println("    S  -> Enter Second Custom Hashtag");
            System.out.println("    T  -> Enter Third Custom Hashtag");
            System.out.println("    O  -> Print Hashtags");
            System.out.println("    E  -> Exit program\n");
            //User Message if custom hashtag is used

            if (hashtags[0] != null){
                System.out.println("First Custom Hashtag Used!");
            }
            if (hashtags[1] != null){
                System.out.println("Second Custom Hashtag Used!");
            }
            if (hashtags[2] != null){
                System.out.println("Third Custom Hashtag Used!");
            }


            System.out.print("\nChoice: ");
            String input2 = scanner.nextLine().toUpperCase();
            switch (input2) {
                case "F" -> firstHashtag();
                case "S" -> secondHashtag();
                case "T" -> thirdHashtag();
                case "O" -> printHashtags();
                case "E" -> endProgram = true;
                default -> System.out.println("Invalid Choice!");
            }
        }
    }
}
