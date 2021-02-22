package yuliatestprograms;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter the number of valid bank cards you want to get:");
       int userInput = sc.nextInt();
       LuhnAlgorithm.validCardNumberGenerator(userInput);
       System.out.println("These are valid bank cards numbers:");
        for (Long number : LuhnAlgorithm.validCardNumberGenerator(userInput))
        {
            System.out.println(number);
        }
    }
}
