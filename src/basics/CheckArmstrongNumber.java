package basics;

import java.util.Scanner;

// program to check whether a number is Armstrong number or not
public class CheckArmstrongNumber {
    private static boolean isArmstrong(int num) {
        int temp = num;
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum = sum + rem * rem * rem;
            num = num / 10;
        }

        // if sum of cubes of digits of num is equal to num
        return temp == sum;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        if(isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}
