
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
    
    public Module module;
    public Module module2;
    public Module module3;
    public Module module4;
    
    
    private int total;
    private int average;
    private String finalGrade;
    

    /**
     * Constructor for objects of class Course
     */
    public Course(String course, String code)
    {
        // initialise instance variables
        this.course = course;
        this.code = code;
       
        
       
    }
    
    public void addModule1 (Module module)
    {
        this.module = module;
    }
        
    public void addModule2 (Module module2)
    {
        this.module2 = module2;
    }
    
    public void addModule3 (Module module3)
    {
        this.module3 = module3;
    }
        
    public void addModule4 (Module module4)
    {
        this.module4 = module4;
    }
    
    public void calculateFinal(int score1, int score2, int score3, int score4)
    {
        total = score1 + score2 + score3 + score4;
        average = total / 4;
        
    }
    
    public int getAverage()
    {
        return average;
    }
    
    public void setFinal(int average)
    {
        if((average >= 0) && (average < 40))
        { 
            finalGrade = "F";
        }
        if ((average >= 40) && (average < 50))
        {
            finalGrade = "D";
        }
        if((average >= 50) && (average < 60))
        { 
            finalGrade = "C";
        }
        if((average >= 60) && (average < 70))
        {
            finalGrade = "B";
        }
        if((average >= 70) && (average <101))
        {
            finalGrade = "A";
        }
        this.finalGrade = finalGrade;
        return;
    }
        
  
  
   
    
    public void print()
    {
        System.out.println("Course: " + course + ", Code: " + code + ", Average Grade: "
                            + finalGrade);
        module.print();
        module2.print();
        module3.print();
        module4.print();
        
        
        
        

    }
    
}  