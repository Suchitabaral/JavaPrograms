import java.util.*;


public class sum {
    public static void main(String[] args){
        EvenDigits ed=new EvenDigits();
       if( ed.getData()){
        ed.squareSum();
       }
    }
}
class EvenDigits{

 private int num;

    public  boolean getData(){
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers");
        if (sc.hasNextInt()) { // Check if input is a valid integer
            num = sc.nextInt();
            return true; // Valid input, proceed
        } else {
            System.out.println("Invalid input. Please enter an integer.");
            return false; // Invalid input, do not proceed
        }
    }

    
  
   
    public  void squareSum(){
        int sum=0;
        int temp = Math.abs(num);
     while (temp != 0) {
        int digit = temp % 10; // Extract the last digit
        if (digit % 2 == 0) { // Check if the digit is even
            sum += digit * digit; // Add the square of the digit to the sum
        }
        temp = temp / 10; // Remove the last digit
    }
   
        

        // Display the result
        System.out.println("The sum of the squares of even digits is: " + sum);
    }}
