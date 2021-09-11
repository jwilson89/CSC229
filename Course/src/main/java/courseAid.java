/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juliuswilson
 */
public class courseAid 

{
    
    // instance variables
    private String id;
    private String courseName;
    private int courseCode;
    
    public courseAid() 
    { this.id = "MAT"; 
      this.courseName = "Calculus 3"; 
      this.courseCode = 252;
    }
    
    public courseAid(String courseID, String courseName, int courseCode)
    {
        this.id = courseID;
        this.courseName = courseName;
        this.courseCode = courseCode;
        
    }
    
    
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
