import java.util.Date;


/**
 * Write a description of class Ticket here.
 *
 * @author Joshua Potts
 * @version (a version number or a date)
 */
public class Ticket
{
    // instance variables - replace the example below with your own
    private Date dateTime;
    
    private String destination;
    
    private int price;
    
  
    /**
     * Constructor for objects of class Ticket
     * Sets destination and price and gets todays date.
     */
    public Ticket(String destination, int price)
    {
        // initialise instance variables
        this.destination = destination;
        this.price = price;
        
        dateTime = new Date();
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
        System.out.println("Ticket " + destination +
            ", Price " + price +
            ", Issued " + dateTime);
    }
}
