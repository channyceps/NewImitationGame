
/**
 * Write a description of class Decipher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Deipher
{
    private String input = "";
    private String decrypted ="";
    public Deipher(String input)
    {
        this.input = input;
    }
    String decrypt()
    {
       String s = "";
       int len = input.length();
       for(int i = 0; i < len; i++)
       { 
           char character = input.charAt(i);
           int ascii1 = (int) character;
           int ascii2 = ascii1 - 1;
           char newcharacter = (char)ascii2;
           if (((ascii2 <= (int)('z') + 1) && (ascii2 >= 96)))
           {
               if (newcharacter == (char)96)
               {
                   s += 'z';
               }
               else
               {
                   s+= newcharacter;
               }
           }
           if (((ascii2 <= (int)('Z') +1) && (ascii2 >= (int)('A') -1)))
           {
               if (newcharacter == '@')
               {
                   s += 'Z';
               }
               else
               {
                   s+= newcharacter;
               }
           }
       }
       String newstring = s.substring(s.length()-1,s.length()) + s.substring(0,s.length()-1);
       return newstring;
    }   
}
