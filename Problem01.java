/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {
    
    public static long getSumOfPrimes(int n){
    // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
    //          Test your solution
    //          Analyze its space and time  
    int sum = 0; 
    
    if(isPrime(n))
    {
       sum += getSumOfPrimes(n);
       
    }


    else
    {
        return -1;
    }

    return sum;

    
    
}

public static bool isPrime(long n)
{
    long arr[10];
    
    if( n % n != 0)
    {
     long sum += n;
    }
}
    
public static void main(String [] arg)
{
    x = getSumOfPrimes(1);
}

// the time complexity is n (log n)