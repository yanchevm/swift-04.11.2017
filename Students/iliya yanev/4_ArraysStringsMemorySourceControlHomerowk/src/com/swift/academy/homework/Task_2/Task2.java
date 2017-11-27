package com.swift.academy.homework.Task_2;

import com.swift.academy.homework.Task_0.Task0b_ReadArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2 {

    //Милен: Нямам забележки - БРАВО!
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = Task0b_ReadArray.readNumberFromConsole();
        while (size < 1) {
            System.out.print("Please enter a positive number: ");
            size = Task0b_ReadArray.readNumberFromConsole();
        }
        System.out.print("Enter numbers separated by whitespace: ");
        String input = sc.nextLine().trim();

        String[] numbersAsString = input.split(" ");
        int[] numbers = new int[size];

        // fill the array with n elements
        for (int i = 0; i < size; i++) {
            try {
                numbers[i] = Integer.parseInt(numbersAsString[i]);
            } catch (NumberFormatException e) {
                System.out.printf("%s is not an integer", numbersAsString[i]);
                System.out.println();
            }
        }
        int[] unsortedArray = Arrays.copyOf(numbers, numbers.length);
        // Created a method for each task
        // Task_2a PrintLargestNumber
        printLargestNumber(numbers);

        // Task_2b PrintSortedNumbers
        sortArray(numbers);
        System.out.print("Sorted Array: ");
        for (int i : numbers) {
            System.out.printf("%d ", i);
        }
        System.out.println();
        System.out.println("==============================");

        // Task_2c PrintClusterCount
        printClusterCount(numbers);

        //Task_2d PrintSplitIndex
        int splitIndex = findSplitIndex(unsortedArray);
        if (splitIndex == -1) {
            System.out.print("No index found.");
            System.out.println();
            System.out.println("==============================");
        } else {
            System.out.print("Split index: " + splitIndex);
            System.out.println();
            System.out.println("==============================");
        }

        //Task_2e_LongestIncreasingSubSequence
        printLongestIncreasingSubSequence(unsortedArray);

        //Task_2f_LargestSumOfKSubSequence
        printLargestSumOfKSubSequence(unsortedArray, 5);

        //Task_2g_LargestSumSubSequence
        printLargestSumSubSequence(unsortedArray);

        //Task_2h_PrintOddFrequencyNumber
        printOddFrequencyNumber(unsortedArray);

        //Task_2i_FindKInSorted
        int index = searchK(numbers, 4);
        if (index == -1) {
            System.out.print("No such value");
            System.out.println();
            System.out.println("==============================");
        }
        else {
            System.out.printf("Value is at index: %d", index);
            System.out.println();
            System.out.println("==============================");
        }
    }

    private static void printLargestNumber(int[] arr) {
        int largestNumber = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > largestNumber) {
                largestNumber = i;
            }
        }
        System.out.printf("Largest number: %d", largestNumber);
        System.out.println();
        System.out.println("==============================");
    }

    private static int[] sortArray(int[] arr) {
        // bubble sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    private static void printClusterCount(int[] arr) {
        int biggestClusterCount = 1;
        int currentCluster = 1;
        int currentNumber = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (currentNumber == arr[i]) {
                currentCluster++;
                if (currentCluster > biggestClusterCount) {
                    biggestClusterCount = currentCluster;
                }
            } else {
                currentNumber = arr[i];
                if (currentCluster > biggestClusterCount) {
                    biggestClusterCount = currentCluster;
                }
                currentCluster = 1;
            }
        }

        System.out.print("Biggest cluster count: " + biggestClusterCount);
        System.out.println();
        System.out.println("==============================");
    }

    private static int findSplitIndex(int[] arr) {
        int sum = 0;
        int sumLeft = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        for (int i = 0; i < arr.length; ++i) {
            sum -= arr[i];
            sumLeft += arr[i];
            if (sumLeft == sum) {
                return i;
            }
        }
        return -1;
    }

    private static void printLongestIncreasingSubSequence(int[] arr) {
        List<Integer> biggestSequence = new ArrayList<>();
        int previousNumber = arr[0];
        int startIndex = 0;
        int endIndex = 0;
        int biggestStartIndex = 0;
        int biggestEndIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (previousNumber < arr[i]) {
                endIndex++;
                if (biggestEndIndex - biggestStartIndex < endIndex - startIndex) {
                    biggestStartIndex = startIndex;
                    biggestEndIndex = endIndex;
                }
            } else {
                endIndex = i;
                if (biggestEndIndex - biggestStartIndex < endIndex - startIndex) {
                    biggestStartIndex = startIndex;
                    biggestEndIndex = endIndex;
                }
                startIndex = i;
            }
            previousNumber = arr[i];
        }
        for (int i = biggestStartIndex; i < biggestEndIndex; i++) {
            biggestSequence.add(arr[i]);
        }
        System.out.print("Biggest sequence: ");
        for (int i : biggestSequence) {
            System.out.printf("%d ", i);
        }
        System.out.println();
        System.out.println("==============================");
    }

    private static void printLargestSumOfKSubSequence(int[] arr, int k) {
        int startIndex = 0;
        int largestSumStartIndex = 0;
        int sum = 0;
        int largestSum = 0;
        for (int i = 0; i < arr.length - k; i++) {
            for (int j = startIndex; j < startIndex + k; j++) {
                sum += arr[j];
            }
            if (sum > largestSum) {
                largestSum = sum;
                largestSumStartIndex = startIndex;
            }
            sum = 0;
            startIndex++;
        }
        System.out.printf("Largest sum of %d elements : ", k);
        for (int i = largestSumStartIndex; i < largestSumStartIndex + k; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("==============================");
    }

    private static void printLargestSumSubSequence(int[] arr) {
        int currentMaxSum = Integer.MIN_VALUE;
        int previousMaxSum = 0;
        int startIndex = 0;
        int endIndex = 0;
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            previousMaxSum += arr[i];
            if (currentMaxSum < previousMaxSum) {
                currentMaxSum = previousMaxSum;
                startIndex = temp;
                endIndex = i;
            }
            if (previousMaxSum < 0) {
                previousMaxSum = 0;
                temp = i + 1;
            }
        }

        System.out.print("Largest sum sub-sequence: ");
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.printf(" %d", arr[i]);
        }
        System.out.println();
        System.out.println("==============================");
    }

    private static void printOddFrequencyNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                System.out.printf("Odd number is : %d", arr[i]);
                System.out.println();
                System.out.println("==============================");
                break;
            }
        }
    }

    private static int searchK(int[] arr, int value) {
        //binary search implementation
        int lowIndex = 0;
        int highIndex = arr.length - 1;
        while (lowIndex <= highIndex) {
            int midIndex = lowIndex + (highIndex - lowIndex) / 2;
            if (value < arr[midIndex]) {
                highIndex = midIndex - 1;
            } else if (value > arr[midIndex]) {
                lowIndex = midIndex + 1;
            } else {
                return midIndex;
            }
        }
        return -1;
    }
}