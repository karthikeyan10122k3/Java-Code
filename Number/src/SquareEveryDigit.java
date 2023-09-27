import java.util.Scanner;

public class SquareEveryDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        System.out.println(squareAndConcatenate(num));

    }
    public static StringBuilder squareAndConcatenate(int n) {
        String s = String.valueOf(n);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int parseInt = Integer.parseInt(String.valueOf(s.charAt(i)));
            result.append(parseInt * parseInt);
        }
        return result;
    }
}
