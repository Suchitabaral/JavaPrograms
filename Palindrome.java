import java.util.*;
class Palindrome{
    public static void main(String[] args){
        Check ch = new Check();
        ch.getData();
        ch.CheckPalindrome();
    }
}
class Check{
    
 public void getData(){
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
      number=sc.nextInt();
       sc.close();
 }
 int rev=0;
      int  ext, org,number;
public void CheckPalindrome(){
    
    org=number;
    while(number!=0){
        ext=number%10;
        rev=rev*10+ext;
        number=number/10;
    }
    if(org==rev){
        System.out.println("The entered number is a Palindrome");
    }
else{
    System.out.println("The entered number is not a Palindrome");
}

    

}

}