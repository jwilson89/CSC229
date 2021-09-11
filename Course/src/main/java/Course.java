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



public class Course {
    
    public static void main (String [] args)
    {
        courseAid collegeCourseOne = new courseAid();
        courseAid collegeCourseTwo = new courseAid("A32199", "Spanish", 995);
        courseAid collegeCourseThree = new courseAid("B52", "Linear Algebra", 3093);
        
        collegeCourseOne.setId("SDFl90");
        collegeCourseTwo.setCourseName("Vector Calculus");
        collegeCourseThree.setCourseCode(3444467);

        
       System.out.println(collegeCourseOne.getId());
       System.out.println(collegeCourseTwo.getCourseName());
       System.out.println(collegeCourseThree.getCourseCode());
       
       
      



        
    }
  
    
    
    
    
    
    
}
