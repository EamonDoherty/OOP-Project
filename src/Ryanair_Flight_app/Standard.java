
package Ryanair_Flight_app;

/**
 * Ryanair Ticket App
 * Standard.java
 * Date 15/11/17
 *@author Wojtek Hordyniec(x16514553) , Conor Howard(x16305736) , Eamon Doherty(X16470876)
 */

//Wojtek Hordyniec & Conor Howard done the class. I made up the first draft and then Conor edited it and tidied it up.

//this is a child class inherting from Ticket.java
public class Standard extends Ticket{
 
    
    public Standard(){
        super();
    }
    
    public Standard(int seatPrice){
        super(seatPrice);
    }
    
    public void compute(){
        this.seatPrice = 5;
    }
    
    
    
}
