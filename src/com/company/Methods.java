package com.company;

public class Methods {

    public static void main(String[] args) {
        sayNaimasNiJanjan();
    }

    static void sayNaimasNiJanjan() {
        System.out.println("Naimas ni Janjan Barangan");


        int numbers[] = {1, 31, 425, 2525, 262};
        int result = summation(numbers);
        System.out.println(result);
        numbers = new int[]{1, 31, 42, 25, 224};
        int result1 = product(numbers);
        System.out.println(result1);
    }

    static int summation(int numbers[]) {
        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        return sum;
    }

    static int product(int[] numbers) {
        int product = 1;
        for (int number : numbers) {
            product = product * number;
        }
        return product;
    }
}