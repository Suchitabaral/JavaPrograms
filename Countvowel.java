import java.util.*;
public class Countvowel {
    public static void main(String[] args)
    { char ext;
        int count_vow=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = sc.nextLine();
       for (int i=0;i<str.length() ; i++){
         ext = str.charAt(i);
       
       if(Character.isLetter(ext)){
        if(ext=='a'||ext=='e'||ext=='i'||ext=='o'||ext=='u'||ext=='A'||ext=='E'||ext=='I'||ext=='O'||ext=='U')
        {
            count_vow++;
        } 
       
       }}
       System.out.println("Vowel count ="+count_vow);
       sc.close();
    }
    
}
