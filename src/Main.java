import java.util.Scanner;

class FavoriteNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int favoriteInt = SafetyInput.getInt(scanner, "Please enter your favorite integer"); //ask for integer
        System.out.println("Your favorite integer is: " + favoriteInt); //output favorite integer

        double favoriteDouble = SafetyInput.getDouble(scanner, "Please enter your favorite double");// ask for favorite double
        System.out.println("Your favorite double is: " + favoriteDouble);// output favorite double

        scanner.close();
    }
}
