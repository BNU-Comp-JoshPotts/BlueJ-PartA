
/**
 * Write a description of class Course here.
 *
 * @author Joshua Potts
 * @version 04.10.20
 */
public class Course
{
    // the course name
    private String course;
    // the course code
    private String code;

    /**
     * Constructor for objects of class Course
     */
    public Course(String course, String code)
    {
        // initialise instance variables
        this.course = course;
        this.code = code;
       
        
       
    }
   
    
    public void print()
    {
        System.out.println("Course: " + course + ", Code: " + code);
        
        
        

    }
    
}  