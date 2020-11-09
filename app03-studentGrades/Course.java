
/**
 * Write a description of class Course here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Course
{
    // instance variables - replace the example below with your own
    private String courseName;
    private String courseCode;
    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;
    
    private int markFinal;
    

    /**
     * Constructor for objects of class Course
     */
    public Course(String courseName, String courseCode)
    {
        // initialise instance variables
        this.courseName = courseName;
        this.courseCode = courseCode;
        
        module1 = new Module("Programming Concepts", "CO452");
        module2 = new Module("Game Design", "CO459");
        module3 = new Module("Computer Architectures", "C0450");
        module4 = new Module("3D Modelling", "CO461");
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addMark(int mark, int moduleNum)
    {
        // put your code here
        if(moduleNum == 1)
        {
            module1.setMark(mark);
        }
        if(moduleNum == 2)
        {
            module2.setMark(mark);
        }
        if(moduleNum == 3)
        {
            module3.setMark(mark);
        }
        if(moduleNum == 4)
        {
            module4.setMark(mark);
        }
    }
    
    public void print()
    {
        System.out.println("Course: " + courseCode + " - " + courseName);
    }
    
    public Grades convertToGrade(int mark)
    {
        if((mark >= 0) && (mark < 40))
        { 
            return Grades.F;
        }
        if ((mark >= 40) && (mark < 50))
        {
            return Grades.D;
        }
        if((mark >= 50) && (mark < 60))
        { 
            return Grades.C;
        }
        if((mark >= 60) && (mark < 70))
        {
            return Grades.B;
        }
        if((mark >= 70) && (mark <101))
        {
            return Grades.A;
        }
        
        return Grades.Unknown;
    }
}
