
/**
 * Write a description of class ImitationGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ImitationGame
{
    public static void main(String args[])
    {
        Cipher nick = new Cipher("abyzABYZ");
        System.out.println(nick.encrypt());
        
        String decryptthis = nick.encrypt();
        Deipher chan = new Deipher(decryptthis);
        System.out.println(chan.decrypt());
    }
}
