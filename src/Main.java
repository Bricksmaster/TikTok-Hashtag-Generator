
public class Main {
    static java.util.Scanner scanner = new java.util.Scanner((System.in));
    //static ArrayList<Hashtag> hashtags = new ArrayList<>();
    static String[]hashtags = new String[5];

    static void firstHashtag(){
        System.out.print("Enter First Custom Hashtag: ");
        String firstCustomHashtagInput = scanner.nextLine();
        String firstCustomHashtag = firstCustomHashtagInput.toLowerCase();
        String firstFinalHashtag = "#" + firstCustomHashtag;
        System.out.println(firstFinalHashtag);

    }

    static void secondHashtag(){
        System.out.print("Enter Second Custom Hashtag: ");
        String secondCustomHashtagInput = scanner.nextLine();
        String secondCustomHashtag = secondCustomHashtagInput.toLowerCase();
        String secondFinalHashtag = "#" + secondCustomHashtag;
        System.out.println(secondFinalHashtag);
        Boolean secondHashtagUsed = true;
    }

    static void thirdHashtag(){
        System.out.print("Enter Third Custom Hashtag: ");
        String thirdCustomHashtagInput = scanner.nextLine();
        String thirdCustomHashtag = thirdCustomHashtagInput.toLowerCase();
        String thirdFinalHashtag = "#" + thirdCustomHashtag;
        System.out.println(thirdFinalHashtag);
        Boolean thirdHashtagUsed = true;
    }

    //Current method does not work, because booleans and other variables can't be used for a status.

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
            System.out.println("\n  E  -> Exit program");



            System.out.print("\nChoice: ");
            String input2 = scanner.nextLine().toUpperCase();
            switch (input2) {
                case "F" -> firstHashtag();
                case "S" -> secondHashtag();
                case "T" -> thirdHashtag();
//                case "O" ->
                case "E" -> endProgram = true;
                default -> System.out.println("Invalid Choice!");
            }
        }
    }
}
