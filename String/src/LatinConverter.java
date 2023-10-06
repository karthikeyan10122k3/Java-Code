package com.kar.practice.exercise.String.src;

public class LatinConverter {



        public static void main(String[] args) {
            System.out.println(converter("Pig latin is cool"));
            System.out.println(converter1("Hello world !"));
        }
        public static String converter1(String str) {
            return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
            //(\w)- captures the first word character in a capturing group (group 1)
            //(\\w*): This part captures the rest of the word characters in a capturing group (group 2). The asterisk * means zero or more occurrences.
            //" $2$1ay": This is the replacement string. $2 refers to the second capturing group (rest of the word characters), $1 refers to the first capturing group (first word character), and "ay" is appended to the end. This effectively moves the first letter of each word to the end and adds "ay".
        }
        public static String converter(String input) {
            String[] words = input.split(" ");
            StringBuilder result = new StringBuilder();

            for (String i : words) {
                if (i.matches("\\p{Punct}+")) { //Checks for puntuation Character like Exclamation mark,Question mark and so on
                    result.append(i).append(" ");
                } else {
                    char firstChar = i.charAt(0);
                    String restOfWord = i.substring(1);
                    result.append(restOfWord).append(firstChar).append("ay ");
                }
            }

            return result.toString().trim(); //trim() removes Heading and Tailing WhiteSpace
        }
    }


