package primeCheck;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (number < 2) {
            System.out.println(" is not a prime");
        }else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) { //i lần lượt chạy qua các số nhỏ hơn căn bậc 2 của number, xét từng trường hợp, trường hợp nào
                if (number % i == 0) {       // sai thì dừng, xong tăng i lên 1 để xét các trường hợp tiếp theo.
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(" is a prime number!");
            } else {
                System.out.println(" is not a prime number!");
            }
        }
    }


}
