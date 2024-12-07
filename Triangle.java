// LAB:1
// To find the area of triangle.
import java.util.Scanner;

class Traingle{
    public static void main ( String args[])
    {
        Scanner sc= new Scanner(System.in);
        Area tr = new Area();
        System.out.println("Enter the sides of a triangle ");
        double a = sc.nextDouble();
        double b=sc.nextDouble();
        double c =sc.nextDouble();
        double area=tr.getArea(a,b,c);
        System.out.println("Area="+area);
       
        sc.close();
        
    }
}

class Area{
    public double getArea(double a,double b,double c){
       double s= (a+b+c)/2;
       double  area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
       return area;
    }
      
}
