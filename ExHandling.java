//Lab 2
import java.util.*;
public class ExHandling {
    public static void main(String[] args){
        Handling h = new Handling();
        h.getdata();
        h.displaydata();
    }
}
class Handling{
     private double result,num1,num2;

    public void getdata(){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the value of num1 and num2");
     num1=sc.nextDouble();
      num2=sc.nextDouble();
    sc.close();}

     
    public void displaydata(){
         
        try {
            result = (num1) /( num2);

            System.out.println("Result: " + result);
        } catch (Exception e) {
            
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            
            System.out.println("Execution of the try-catch block is complete.");
        }

        System.out.println("Program continues...");
    }

    
}
