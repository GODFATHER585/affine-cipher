import java.util.*;
public class AffineCipher{

      public static void main(String[] args){
      
            Scanner in = new Scanner(System.in);
            
            System.out.println("Enter the plain text :  ");
            String text = in.next();
            
            System.out.println(" Key : ");
            int s = in.nextInt();
            
            String result = "  ";
            
            for( int i = 0; i<text.length(); i++)
            {
                  if(Character.isUpperCase(text.charAt(i)))
                  {
                        char ch = (char)(((int)text.charAt(i) + s - 65) % 26 + 65);
                        result = result + ch;
                  }
                  
                  else 
                  {
                        char ch = (char)(((int)text.charAt(i) + s - 97) % 26 + 97);
                        result = result + ch;
                  }
             }
             
             
             System.out.println("Text   :  " + text);
             System.out.println("Shift :  " + s);
             System.out.println("Cipher : " + result);
             System.out.println("the text has been encrypted !");
}
}                
             
             
             
             