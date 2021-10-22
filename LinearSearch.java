/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class LinearSearch {
    
    public static int search(int arr[], int key)
    {
        int n = arr.length;
        // Todo 01: - complete the implementation of linear search and test your code  
         //         - provide asymptotic analysis of the developed solution
         
         for (int i = 0; i < n; i++)
         {
             if(arr[i] == key)
             {
                 return i;
             }
           
                 
             
              
         }
         
     return -1;
         
    }

    
        public static void main (String [] args)
         {
             
             
         }
    
}
