import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    static java.util.Scanner scanner = new java.util.Scanner((System.in));
    //static ArrayList<Hashtag> hashtags = new ArrayList<>();
    static String[]hashtags = new String[5];


    static void firstHashtag(){
        System.out.print("Enter First Custom Hashtag: ");
        String firstCustomHashtagInput = scanner.nextLine();
        String firstCustomHashtag = firstCustomHashtagInput.toLowerCase();
        String firstFinalHashtag = "#" + firstCustomHashtag;
        hashtags[1] = firstFinalHashtag;

    }

    static void secondHashtag(){
        System.out.print("Enter Second Custom Hashtag: ");
        String secondCustomHashtagInput = scanner.nextLine();
        String secondCustomHashtag = secondCustomHashtagInput.toLowerCase();
        String secondFinalHashtag = "#" + secondCustomHashtag;
        hashtags[2] = secondFinalHashtag;
    }

    static void thirdHashtag(){
        System.out.print("Enter Third Custom Hashtag: ");
        String thirdCustomHashtagInput = scanner.nextLine();
        String thirdCustomHashtag = thirdCustomHashtagInput.toLowerCase();
        String thirdFinalHashtag = "#" + thirdCustomHashtag;
        hashtags[3] = thirdFinalHashtag;
    }

    static void printHashtags(){
       int neededHashtags = 5;

       File f = new File("src/hashtags.txt");
        try {
            Scanner myReader = new Scanner(f);

            while (myReader.hasNextLine()){
                String line = myReader.nextLine();


                if (hashtags[1].equals("")){
                    hashtags[1] = line;
                    neededHashtags =- 1;
                }
                if (hashtags[2].equals("")){
                    hashtags[2] = line;
                    neededHashtags =- 1;
                }
                if (hashtags[3].equals("")){
                    hashtags[3] = line;
                    neededHashtags =- 1;
                }

                hashtags[4] = line;
                hashtags[5] = line;
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    }



    //Current method does not work, because booleans and other variables can't be used for a status.

    public static void main(String[] args) {
//        for (String c : hashtags){
//            c = "";
//        }

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
            System.out.println("\n  E  -> Exit program");
            //User Message if custom hashtag is used

//            if (!hashtags[1].equals("")){
//                System.out.println("First Custom Hashtag Used = Yes");
//            }
//            if (!hashtags[2].equals("")){
//                System.out.println("Second Custom Hashtag Used = Yes");
//            }
//            if (!hashtags[3].equals("")){
//                System.out.println("Third Custom Hashtag Used = Yes");
//            }

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
