import java.util.Scanner;

public class ToCamelCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(toCamelCase("the-stealth-warrior"));
        System.out.println(toCamelCase("My_Daddy_Hot"));
        System.out.println(toCamelCase("The_Stealth-Warrior"));
    }
    public static String toCamelCase(String str){
        String camelStr="";
        for (int i = 0; i < str.length(); i++) {
            if((str.charAt(i)=='-' )|| (str.charAt(i)=='_')){

                camelStr+=String.valueOf(str.charAt(i+1)).toUpperCase();

                i+=1;
            }
            else {
                camelStr+=String.valueOf(str.charAt(i));
            }
        }
        return camelStr;

    }
}
