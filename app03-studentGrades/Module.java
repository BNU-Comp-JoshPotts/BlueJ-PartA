
/**
 * Write a description of class Module here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Module
{
    // instance variables - replace the example below with your own
    private String module;
    
    private String moduleCode;
    
    private int score;
    
    private String grade;

    /**
     * Constructor for objects of class Module
     */
    public Module(String module, String moduleCode)
    {
        // initialise instance variables
        this.module = module;
        this.moduleCode = moduleCode;
        
    }
    
    public String getModule()
    {
        return module;
    }
    
    public void setGrade(int score)
    {
        if((score >= 0) && (score < 40))
        { 
            grade = "F";
        }
        if ((score >= 40) && (score < 50))
        {
            grade = "D";
        }
        if((score >= 50) && (score < 60))
        { 
            grade = "C";
        }
        if((score >= 60) && (score < 70))
        {
            grade = "B";
        }
        if((score >= 70) && (score <101))
        {
            grade = "A";
        }
        this.score = score;
        return;
    }
   

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void print()
    {
        // put your code here
        System.out.println("Module: " + module + ", Code: " + moduleCode +
                            ", Score: " + score + ", Grade: " + grade);
    }
}
