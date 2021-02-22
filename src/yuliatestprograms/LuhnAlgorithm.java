package yuliatestprograms;
import java.util.Arrays;

public class LuhnAlgorithm {
    private static int[] toIntArray(String input) {
        String [] arr1 = input.split("");
        int [] intArr = new int [arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            intArr[i] = Integer.parseInt(arr1[i]);
        }
        return intArr;
    }

    public static boolean digitCheck (String userCardNumber) {
        int [] intArr = toIntArray(userCardNumber);
        int sum = 0;
        for (int i = intArr.length - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                intArr[i] = intArr[i] * 2;
                if (intArr[i] > 9){
                    intArr[i] = intArr[i] - 9;
                }
            }
            sum += intArr[i];
        }

        if (sum % 10 == 0) {
           return true;
        }
        else
            return false;
    }

    public static long [] validCardNumberGenerator(int range) {
        long [] longArray = new long [range];
        Arrays.fill(longArray, 0L);

        int currentIndex = 0;

        while (longArray[range-1] == 0L) {

            long number1 = (long) (Math.random() * 10000000000000000L);
            String number = Long.toString(number1);


            if (digitCheck(number)) {
                longArray[currentIndex] += Long.parseLong(number);
                currentIndex++;
            }
        }
        return longArray;
    }
}
