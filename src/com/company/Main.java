package com.company;
//In Fibonacci series, the next number is the sum of the previous two numbers
public class Main {

    public static void main(String[] args) {
	 //without recursion
        int n1 = 0, n2 = 1, n3, i, count = 10;

        System.out.print(n1 + " " + n2);// printing 0 and 1

        for (i = 2; i < count; ++i) //loop starts from 2 because 0 and 1 are already printed
        {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }

        int productValue = getProduct(5,2);
        System.out.println(" Product is " + productValue);

        int sumValue = getSum(productValue);
        System.out.println(" Sum is " + sumValue);


    }

    public static int getProduct(int n, int c){

        int product = 1, n1 = n -1, n2 = n - c, sum = 0, n3 , i, count = n ;
        product = n1 * n2;
        sum = sum + product;
        System.out.println(" Product for " + n1 + " and " + n2 + " is: " + product);

        n--;
        return product;
    }

    public static int getSum (int prod){
        int totalSum = 0 + prod;
        return totalSum;
    }
}
