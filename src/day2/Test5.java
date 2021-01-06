package day2;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        int x;
        Scanner scanner=new Scanner(System.in);
        x=scanner.nextInt();
        if(x>0&&x<=100){
            if (x>50){System.out.println("老年");}
            else if(x>35){System.out.println("中年");}
            else if(x>17){System.out.println("青年");}
            else if(x>13){System.out.println("青少年");}
            else if (x>6){System.out.println("少儿");}
            else{System.out.println("儿童");}
        }else{
            System.out.println("儿童");
         }
        }
    }

