package day3;

import java.util.Scanner;

/**
 * @author lsw-shaowu
 * @date 2021/1/6
 */
public class Test6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        for (int i=1;i<=x;i++){

            for(int z=x-i;z>0;z--)
            {System.out.print(" ");}

            for (int l=1;l<=(2*i-1);l++)
            {System.out.print("*");}

            for(int z=x-i;z>0;z--)
            {System.out.print(" ");}
            System.out.println();
        }
    }
}
