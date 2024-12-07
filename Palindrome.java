import java.util.*;
public class Palindrome {
    public static void main(String[] args){
  StringCheck c =new StringCheck();
  c.SetData();
  boolean res=c.isPalindrome();
  if(res==true){
    System.out.println("Input string is palindrome");
  }
  else{ System.out.println("Input string is not palindrome");}
 
    }
}
class StringCheck{
    private String str;
    public void SetData(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string");
        str= sc.nextLine();
        sc.close();
    }
    public boolean isPalindrome()
    {
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            char ext=str.charAt(i);
            rev=rev+ext;
        }
        if(rev.equalsIgnoreCase(str)){
            return(true);
        }
        else {return(false);}
    }
    
}
