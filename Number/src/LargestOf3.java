import java.util.Scanner;

public class LargestOf3 {

    public static void largest(int a,int b,int c)
    {
        if(a>b && a>c)
            System.out.println("a big");
        else if(b>a && b>c)
            System.out.println("b big");
        else
            System.out.println("c big");

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        largest(a,b,c);
    }





}
