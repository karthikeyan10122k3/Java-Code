import java.util.*;


public class PlusMinus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of Elements: ");
        int n = sc.nextInt();
        System.out.println("Enter Elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        plusMinus(arr);

    }
    public static void plusMinus(int[] arr) {
        int count0=0;
        int count1=0;
        int count2=0;
        double n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                count0+=1;
            }
            else if(arr[i]>0){
                count1+=1;
            }
            else{
                count2+=1;
            }
        }

        double positive =  count1/n;
        double negative = count2/n;
        double zero = count0/n;
        System.out.println("Average Occurrence: ");
        System.out.println("Positive : "+positive);
        System.out.println("negative : "+negative);
        System.out.println("Zero : "+zero);
    }
}

