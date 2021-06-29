package Ex2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        StringTokenizer st = new StringTokenizer(text);
        System.out.println("Result: ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
