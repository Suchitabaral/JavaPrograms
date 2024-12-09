//LAB2
// WAP to input n numbers and display in ascending order using array list.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ArrayListex {
    public static void main(String[] args){
        Ascending a = new Ascending();
        a.getdata();
        a.displaydata();
    }
}
class Ascending{
    int n,i;
    ArrayList<Integer> numbers = new ArrayList< >();
    Scanner sc = new Scanner(System.in); 

    public void getdata(){
    System.out.println("Enter the numbers ");
    n=sc.nextInt();
    System.out.println("Enter " + n + " numbers:");
        for(i=0;i<n;i++){
            numbers.add(sc.nextInt());

        }
      }
    
    public void displaydata(){
        
        

        
        Collections.sort(numbers);
        System.out.println("Numbers in ascending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
    }

