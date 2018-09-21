package Ryanair_Flight_app;

/**
 * Ryanair Ticket App
 * FirstClass.java
 * Date 15/11/17
 * @author Wojtek Hordyniec(x16514553) , Conor Howard(x16305736) , Eamon Doherty(X16470876)
 */


//Our instaniable class for creating tickets for First Class tickets.

//Wojtek Hordyniec & Conor Howard done the class. I made up the first draft and then Conor edited it and tidied it up.


//this is a child class inherting from Ticket.java
public class FirstClass extends Ticket{
    public FirstClass(){
        super();
    }
    
    public FirstClass(int seatPrice){
        super(seatPrice);
    }
    
    public void compute(){
        this.seatPrice = 200;
    }
    
     
}   

