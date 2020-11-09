
/**
 * Write a description of class Module here.
 *
 * @author (Joshua Potts)
 * @version (a version number or a date)
 */
public class Module
{
    // instance variables - replace the example below with your own
    private String moduleName;
    private String moduleCode;
    private int mark;

    /**
     * Constructor for objects of class Module
     */
    public Module(String moduleName, String moduleCode)
    {
        // initialise instance variables
       this.moduleName = moduleName;
       this.moduleCode = moduleCode;
       mark = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setMark(int mark)
    {
        // put your code here
        if((mark >= 0) && (mark <=100))
        {
            this.mark = mark;
        }
        else
        {
            System.out.println("Invalid");
        }
    }
    
    public void print()
    {
        System.out.println("Module: " + moduleCode + " " + moduleName + " Mark: " + mark);
    }
}
