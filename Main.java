  
public class Main{
    public static void main(String[] args){
        ForLoop f= new ForLoop();
        f.forloop();
        WhileLoop w=new WhileLoop();
        w.whileloop();
        DoWhileLoop d=new DoWhileLoop();
        d.doWhileLoop();
    }}
class ForLoop {
    public void forloop(){
    for(int i=1;i<=100;i++)
    {
        if(i%2==0){
            System.out.println(i);
        }
    }
    }
}
class WhileLoop {
    public void whileloop(){
      int i=1;
      while(i<=100)
      {
        if(i%2==0){
            System.out.println(i);
        }
        i++;
      }
   
    }
}
class DoWhileLoop{
    public void doWhileLoop(){
        int i=1;
        do{
            if(i%2==0){
                System.out.println(i);

            }
            i++;
        } 
        while(i<=100); 
}}

