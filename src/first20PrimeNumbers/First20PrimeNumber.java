package first20PrimeNumbers;

import java.util.Scanner;

public class First20PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;

        System.out.println("So luong SNT muon in ra: ");
        int number = input.nextInt();
        int N = 2;
        while (count < number) {
            if (isPrime(N)) {
                System.out.println(N);
                count++;
            }
            N++;
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= (long)Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
