package day3;

/**
 * @author lsw-shaowu
 * @date 2021/1/6
 */
public class Test4 {
    public static void main(String[] args) {
        for (int i = 1000; i < 10001; i++) {
            int a = i % 10;
            int b = i / 10 % 10;
            int c = i / 100 % 10;
            int d = i / 1000 % 10;
            if (a * a * a * a + b * b * b * b + c * c * c * c + d * d * d * d == i)
                System.out.println(i);
        }
    }
}
