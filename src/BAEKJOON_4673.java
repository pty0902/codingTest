import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.lang.Integer.sum;

public class BAEKJOON_4673 {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(int i=1; i<=10000; i++) {

            //int[] arrNum = Stream.of(String.valueOf(i).split("")).mapToInt(Integer::parseInt).toArray();
            ArrayList<Integer> arrNum = new ArrayList<Integer>();

            int cnt = 0;
            for(int j=1; j<=i; j++) {

                int sum = j;
                int num = j;
                while(num > 0){
                    arrNum.add(num % 10);
                    sum += num % 10;
                    num /= 10;
                }

                if(sum == i) {
                    cnt++;
                }
            }
            if(cnt == 0){
                arr.add(i);
            }

        }

        arr.forEach(i -> {
            System.out.println(i);
        });


    }
}
