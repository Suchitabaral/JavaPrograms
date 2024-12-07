import java.util.*;
public class OddDigit {
    public static void main(String[] args){
        Count c=new Count();
        c.setData();
        double res =c.CountOddDigit();
        System.out.println("Total odd digits="+res);
    }
}
class Count{
    private int num;
    public void setData(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();
        sc.close();
       
    }
    public int CountOddDigit(){
        int Count=0;
        while(num!=0){
            int ext=num%10;
            if(ext%2!=0){
                Count++;
            }
            num=num/10;
        }
        return(Count);
        
    }
    
} 