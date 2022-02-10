import java.util.Scanner;

import static java.lang.Integer.sum;

public class BAEKJOON_15596 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;

        for(int x : a) {
            sum = sum(sum, sc.nextInt());
        }
        System.out.println(sum);

    }
}
