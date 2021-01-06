package day2;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        int gewei=n%10;
        int shiwei=n/10%10;
        int baiwei=n/100%10;
        System.out.println(gewei);
        System.out.println(shiwei);
        System.out.println(baiwei);
    }
}
