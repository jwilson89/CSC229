/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juliuswilson
 * 
 * 
 * September 7th, 2021
 */

// driver class containing a main method for program execution

public class Course {
    
    public static void main (String [] args) // main method
    {
        
        // declaring and instantiating three courseAid objects.
        courseAid collegeCourseOne = new courseAid(); // declaring and instantiating three courseAid objects.
        courseAid collegeCourseTwo = new courseAid("A32199", "Spanish", 995);
        courseAid collegeCourseThree = new courseAid("B52", "Linear Algebra", 3093);
        
        
        // setting the value of three different fields in three different objects.
        collegeCourseOne.setId("SDFl90");
        collegeCourseTwo.setCourseName("Vector Calculus");
        collegeCourseThree.setCourseCode(3444467);

        
       
      



        
    }
  
    
    
    
    
    
    
}
