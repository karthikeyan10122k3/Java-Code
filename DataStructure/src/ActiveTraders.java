package com.kar.practice.exercise.DataStructure.src;

import java.util.*;

public class ActiveTraders {
    public static void main(String[] args) {

        List<String> customers = Arrays.asList("Bigcorp", "Bigcorp", "Bigcorp","Acme",
                                                "Bigcorp","Zork","Zork","ABC",
                                                "Bigcorp","Bigcorp","Zork","Bigcorp",
                                                "Zork","Zork","Bigcorp","Acme",
                                                "Bigcorp","Acme","Bigcorp","Acme",
                                                "LittleCorp","Nadircorp");
        System.out.println(mostActive(customers));
    }
    public static List<String> mostActive(List<String> customers) {
        int customersSize = customers.size();
        TreeSet<String> individualCustomers = new TreeSet<>(customers);
        ArrayList<String> activeCustomers = new ArrayList<>();
        HashMap<String,Integer> customerCount = new HashMap<>();

        for(String customer: customers){
            if(customerCount.containsKey(customer)){
                customerCount.put(customer,customerCount.get(customer)+1);
            }
            else{
                customerCount.put(customer, 1);
            }
        }
        for (String customer : individualCustomers) {

            double percentage = ((double) customerCount.get(customer) / customersSize) * 100;

            if (percentage > 5) {
                activeCustomers.add(customer);
            }
        }

        return activeCustomers;
    }
}
