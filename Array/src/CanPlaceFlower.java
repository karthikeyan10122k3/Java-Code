import java.util.Scanner;

public class CanPlaceFlower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[]{0, 0, 1, 0, 1, 0, 1};
        System.out.println("enter no of flowers:");
        int n = sc.nextInt();
        System.out.println(canPlaceFlowers(a, n));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){
                int prev=(i==0 || flowerbed[i]==0 )?0:1;
                int next=(i==flowerbed.length-1 || flowerbed[i+1]==0)?0:1;
                if(prev==0 && next==0){
                    flowerbed[i]=1;
                    count++;

                }
            }
            if(count>=n){
                return true;
            }
        }
        return false;
    }
}
