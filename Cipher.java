
/**
 * Write a description of class Cipher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cipher
{
    private String input = "";
    public Cipher(String input)
    {
        this.input = input;
    }
    String encrypt()
    {
       String s = "";
       int len = input.length();
       for(int i = 0; i < len; i++)
       { 
           char character = input.charAt(i);
           int ascii1 = (int) character;
           int ascii2 = ascii1 + 1;
           char newcharacter = (char)ascii2;
           if (ascii2 < (int)('z') + 1)
           {
               if (newcharacter == '[')
               {
                   s += 'A';
               }
               else
               {
                   s += newcharacter;
               }
           }
           if (ascii2 == (int)('z'))
           {
               s+= 'a';
           }
           
       }
       String newstring = s.substring(1,s.length()) + s.substring(0,1);
       return newstring;
    }   
}
