package basics;

// program to check if a number is a palindrome
import java.util.Scanner;

public class checkPalindromeNumber {
    private static boolean isPalindrome(int num) {
        // storing the original number
        int originalNum = num;

        // storing the reverse of the number
        int reverseNum = 0;

        while(num != 0){
            int rem = num % 10;
            reverseNum = reverseNum * 10 + rem;
            num = num / 10;
        }

        // checking if the number is equal to its reverse
        return num == reverseNum;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = scan.nextInt();

        if(isPalindrome(num)){
            System.out.println(num + " is a palindrome number");
        } else {
            System.out.println(num + " is not a palindrome number");
        }
    }
}
