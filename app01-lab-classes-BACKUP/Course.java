
/**
 * Write a description of class Course here.
 *
 * @author Joshua Potts
 * @version 04.10.20
 */
public class Course
{
    // the course name
    public String course;
    // the course code
    public String code;

    /**
     * Constructor for objects of class Course
     */
    public Course(String course)
    {
        // initialise instance variables
        this.course = course;
       
    }
   
    
    public String getCourse()
    {
        return course;
        

    }
    
}  