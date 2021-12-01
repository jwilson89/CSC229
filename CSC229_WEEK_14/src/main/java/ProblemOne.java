/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juliuswilson
 */

import java.util.*;
public class ProblemOne {
    public static void main(String [] args) {
        Stack s = new Stack();
        String line; // the string of characters to be checked
        Scanner scan = new Scanner(System.in);
        System.out.println("\nParenthesis Matching");
        System.out.println("Enter a parenthesized expression: ");
        line = scan.nextLine();
        for(int i = 0; s.empty() == false; i++){
            if ((line == ")") || (line == "("))
        {
            s.push(line);
                   System.out.println("\nParenthesis Matching");
 
        }
        
        else {
            s.peek();
            s.pop();
                    System.out.println("Enter a parenthesized expression: ");

        }
        }
        
        if (s.isEmpty()){
            System.out.println("Match!");
        }
        
        // loop to process the line one character at a time
        // print the results
        
    
        
    }
    
