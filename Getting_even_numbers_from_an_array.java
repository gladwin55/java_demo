package main.java.decision;

import java.util.*;

public class Getting_even_numbers_from_an_array {
  public static void main(String[] args) {
    int[] arr = { 5, 6, 7, 8, 9 };

    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 != 0) {
        System.out.println(arr[i]);
        sum = sum + arr[i];
      }
    }
    System.out.println("sum of all odd numbers is " + sum);
  }
}