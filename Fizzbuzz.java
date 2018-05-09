import java.util.Scanner;

public class Fizzbuzz {
        
    public static void main(String[] args) throws InterruptedException {
            
            Scanner  s= new Scanner(System.in);
              int input = s.nextInt();
                    
              for(int i = 1 ;i<input;i++)
              {
                   String s1 = "";
                   if(i%3==0)
                    s1 +="fizz";
                   if (i%5==0)
                     s1 +="buzz";
              Thread.sleep(200);
                                                                        
                  if(s1=="")
               System.out.println(i);
                  else
                 System.out.println(s1);
                                                                }
    }   
    
}
