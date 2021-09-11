/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juliuswilson
 */
public class courseAid  // name of the user defined class (or type)

{
    
    // instance variables -- private to maintain encapsulation
    private String id;
    private String courseName;
    private int courseCode;
    
    public courseAid()  // default constructor
    { this.id = "MAT"; 
      this.courseName = "Calculus 3"; 
      this.courseCode = 252;
    }
    
    public courseAid(String courseID, String courseName, int courseCode) // overloaded constructor with three arguments and three different possible
                                                                         // values to pass in.
    {
        this.id = courseID;
        this.courseName = courseName;
        this.courseCode = courseCode;
        
    }
    
    
    
    // Three Accessor methods - retrieving the value of 3 instance variables
    public String getId()
    {
        return this.id;
    }
    
    public String getCourseName()
    {
        return this.courseName;
    }
    
    public int getCourseCode()
    {
        return this.courseCode;
    }
    
    // Three Mutator methods - changing the value of 3 instance variables
    
    public void setId(String courseID)
    {
        this.id = courseID;
    }
    
    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }
    
    public void setCourseCode(int courseCode)
    {
        this.courseCode = courseCode;
    }


    
    
}
