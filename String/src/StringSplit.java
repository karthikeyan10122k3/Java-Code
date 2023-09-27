import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class StringSplit {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println(splitIntoPairs("asdfghjk"));
        System.out.println(splitIntoPairs("waZESxdrctfvgybhunj"));

        

    }
    public static List<String> splitIntoPairs(String s) {
        List<String> pairs = new ArrayList<>();

        for (int i = 0; i < s.length(); i += 2) {
            if (i + 1 < s.length()) {
                pairs.add(s.substring(i, i + 2));
            } else {
                pairs.add(s.substring(i) + "_");
            }
        }

        return pairs;
    }
}
