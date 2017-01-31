import java.util.Scanner;

public class Reservation
 {

 int ticketID;
 String name;
 String source;
 String destination;

 Reservation()  
 {
  ticketID = 20;
  name ="Yshu";
  source = "Bangalore";
  destination = "Hyderabad";
 }


public void showTicket ()  
{
         System.out.println("The Ticket ID is "+ ticketID);
         System.out.println("The Passenger Name is "+ name);
         System.out.println("The Sourse is" + source);
         System.out.println("The Destination is" + destination);
           
}

public static void main(String args[]) 
    {
   Reservation g = new Reservation();
   g.showTicket();
      }
 }
