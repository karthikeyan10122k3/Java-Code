import java.util.Scanner;

public class PrintUsingForeach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("element no of elements:");
        int n=sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
         }
        for(int arrElement : arr){
            System.out.println(arrElement);
        }
    }

    
}
