package com.kar.practice.exercise;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter Hour:");
//        int hours= sc.nextInt();
//        System.out.println("Enter Minutes:");
//        int minutes= sc.nextInt();
//        System.out.println("Enter Seconds:");
//        int seconds= sc.nextInt();
//        System.out.println("Is it AM or PM:");
//        sc.nextLine();
//        String clockFormat= sc.nextLine();
//        timeConverter(hours,minutes,seconds,clockFormat);
        timeConversion();
     }
//    public static void timeConverter(int hours,int minutes,int seconds,String clockFormat){
//        int changedHour=hours;
//        if((clockFormat=="PM") || (clockFormat=="pm")){
//            if (hours==1){
//                changedHour=13;
//            }
//            else if (hours==2){
//                changedHour=14;
//            }
//            else if (hours==3){
//                changedHour=15;
//            }
//            else if (hours==4){
//                changedHour=16;
//            }
//            else if(hours==5){
//                changedHour=17;
//            }
//            else if (hours==6){
//                changedHour=18;
//            }
//            else if(hours==7){
//                changedHour=19;
//            }
//            else if(hours==8){
//                changedHour=20;
//            }
//            else if(hours==9){
//                changedHour=21;
//            }
//            else if(hours==10){
//                changedHour=22;
//            }
//            else if(hours==11){
//                changedHour=23;
//            }
//            else{
//                changedHour=24;
//            }
//
//        }
//        System.out.println(changedHour + ":"+ minutes + ":" + seconds);
//    }
    public static String timeConversion() {
        String s="10:59:59Pm";
        String portion = s.substring(0,8);
        String[] times = portion.split(":");
        if(s.charAt(8)=='P'){

            if(times[0].matches("12")){
                return times[0] + ":" + times[1] + ":" + times[2];
            }
            times[0] = String.valueOf(Integer.valueOf(times[0]) + 12);
            return times[0] + ":" + times[1] + ":" + times[2];
        }else{
            if(times[0].matches("12")){
                times[0]= "00";
                return times[0] + ":" + times[1] + ":" + times[2];
            }
            return s.substring(0,8);
        }
    }
}
