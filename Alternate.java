//lab1
import java.util.*;
public class Alternate {
    public static void main(String[] args){
       
       Name n = new Name();
        n.alternateCase();   
    }
}
 class Name{
    private String input;
    public Name(){ 
        try( Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a sentence");
            this.input = sc.nextLine();
            
        }
        catch(Exception e){
            System.out.println("Error"+ e.getMessage());
        }
       
    }
    public void alternateCase(){
        StringBuilder converted =  new StringBuilder();
        for( char c: input.toCharArray()){
            if (Character.isUpperCase(c)){
                converted.append(Character.toLowerCase(c));
            }
            else if ( Character.isLowerCase(c)){
                converted.append(Character.toUpperCase(c));
            }
            else{
                converted.append(c);
                }}
            

        System.out.println("Case converted string is: "+converted.toString());
            }}
        