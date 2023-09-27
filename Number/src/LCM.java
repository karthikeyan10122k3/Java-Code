public class LCM {
    public static void main(String[] args) {
        int num1=12,num2=14;
        int highestFactor = 0;
        for (int i = 1; i <=num1 || i<=num2; i++) {
            if((num1%i==0)&& (num2%i==0)){
                highestFactor=i;
            }
        }
        int leastMultiple=(num1*num2)/highestFactor;
        System.out.println(leastMultiple);
    }
}
