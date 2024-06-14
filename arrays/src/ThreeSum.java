package com.kar.practice.exercise.arrays.src;


//15. 3Sum

//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

//Notice that the solution set must not contain duplicate triplets.

//Example 1:
//
//Input: nums = [-1,0,1,2,-1,-4]
//Output: [[-1,-1,2],[-1,0,1]]
//Explanation:
//nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
//nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
//nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
//The distinct triplets are [-1,0,1] and [-1,-1,2].
//Notice that the order of the output and the order of the triplets does not matter.
//Example 2:
//
//Input: nums = [0,1,1]
//Output: []
//Explanation: The only possible triplet does not sum up to 0.
//Example 3:
//
//Input: nums = [0,0,0]
//Output: [[0,0,0]]
//Explanation: The only possible triplet sums up to 0.

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter no of element: ");
//        int length = sc.nextInt();
//        int[] inputArray = new int[length];
//        System.out.println("Enter the Elements of Array: ");
//        for (int i = 0; i < length; i++) {
//            inputArray[i] = sc.nextInt();
//        }
           int[] inputArray = {-1,0,1,2,-1,-4};


//        List<List<Integer>> threeSumNotOptimized = threeSumNotOptimized(inputArray);
        List<List<Integer>> threeSumOptimized = threeSumOptimized(inputArray);


        System.out.println(threeSumOptimized);
    }

    private static List<List<Integer>> threeSumOptimized(int[] nums) {
        int target = 0;
        Arrays.sort(nums);
        Set<List<Integer>> s = new HashSet<>();
        List<List<Integer>> output = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == target) {
                    s.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                } else if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        output.addAll(s);
        return output;
    }

    public static  List<List<Integer>> threeSumNotOptimized(int[] nums) {

        List<List<Integer>> outerList = new ArrayList<>();

        outerList.add(new ArrayList<>());

        for (int element : nums){
            int sizeOfEachElement = outerList.size();
            for (int i = 0; i < sizeOfEachElement; i++) {
                List<Integer> innerList = new ArrayList<>(outerList.get(i));
                innerList.add(element);
                outerList.add(innerList);
            }
        }

        List<List<Integer>> listWithSizeThree = new ArrayList<>();
        HashSet<List<Integer>> dup = new HashSet<>();

        for (List<Integer> list : outerList) {
            if (list.size() == 3 && list.get(0) + list.get(1) + list.get(2) == 0) {
                List<Integer> sortedList = new ArrayList<>(list);
                Collections.sort(sortedList);

                if (!dup.contains(sortedList)) {
                    dup.add(sortedList);
                    listWithSizeThree.add(sortedList);
                }
            }
        }
        return listWithSizeThree;
    }

}
