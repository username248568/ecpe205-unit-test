package com.ecpe205;

public class Calculator {
    public double power( double a, double b ) {
        double pow = 1;
        for(int i=1;i<=b;i++){
            pow = pow*a;
        }
        return pow;
    }
    public double factorial(double value) {
        int fact;
        if(value>=0){
        fact=1;
        for(int i=1;i<=value;i++){
            fact=fact*i;
        }

        return fact;

        }
        else{
        fact=-1;
        for(int i=-1;i>=value;i--){
           fact=fact*i;
        }
        if (fact>0) {
            fact = fact * -1;
        }
        return fact;
        }
    }
    public boolean Palindrome (String word) {
        int i = 0, j = word.length() - 1;

        // While there are characters to compare
        while (i < j) {

            // If there is a mismatch
            if (word.charAt(i) != word.charAt(j))
                return false;

            i++;
            j--;
        }

        return  true;
    }

    public int[] Sort(int[] arr) {
        int temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }


    //create a method that computes base x power of y
    //use parameterizedTest methodsource - 5 sets to test

    //create a method that computes for the factorial of a value
    //use parameterizedTest- 5 values to test

    //create a method that checks if a given string is a palindrome
    //use parameterizedTest - 5 values to test

    //create a method that accepts an array of integer values, the method then sorts the value in ascending order
    //** you may choose whatever sort data structure (bubble sort, shell sort,...)
    //use parameterizedTest methodSource
}
