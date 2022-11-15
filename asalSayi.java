package patikadev;

import java.util.Scanner;

public class asalSayi {
    static void prime(int n, int i) {
        if (i == n) {
            System.out.println(n + " is a prime number");
            return;
        } else if (n % i == 0) {
            System.out.println(n + " is not a prime number");
            return;
        }
        prime(n, i+1);
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;
        System.out.print("enter a number:");
        n = inp.nextInt();
        prime(n, 2);

    }
}
