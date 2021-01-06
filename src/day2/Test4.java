package day2;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        int x;

        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        if (x > 0) {
            System.out.println("正数");
        } else if (x < 0) {
            System.out.println("负数");
        }

    }
}
