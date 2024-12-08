import java.util.*;
public class Realroots {
    public static void main(String[] args){
        Quadratic  q = new Quadratic();

        q.setdata();
        q.displaydata();
    }
}
class Quadratic{
     double a,b,c;
    public void setdata(){
Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
         a=sc.nextDouble();
        System.out.println("Enter the value of b");
        b=sc.nextDouble();
        System.out.println("Enter the value of c");
         c=sc.nextDouble();
        sc.close();}
        
        public void displaydata(){
       
     double discriminant = ((b*b)-(4*a*c));
     
     if(discriminant>0){
        System.out.println("The roots are real and distinct");
      
        double r1= (-b+Math.sqrt( discriminant))/(2*a);
        double r2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        
        
        System.out.println("root one is:"+r1);
        System.out.println("root two  is:"+r2);
     }
     else if (discriminant==0){

       System.out.println("The roots are real and equal");
       double r=-b/(2*a);

       
       System.out.println("root one is:"+r);
       System.out.println("root two is:"+r);
     }
     else{
        System.out.println("The roots are imaginary");
     }
        }
    
    
    
    }
        