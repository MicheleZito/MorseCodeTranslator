package morsetranslator;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MorseTranslator
{
    public static boolean isStringOnlyMorse(String str) 
    {   
                 Boolean result = str != null && !str.equals("");
        
                 String specials;
                 specials = "@òçà°#èé[{+*]{ù§`<>«»_:·,;!¹\"²£³$¼⅛%½⅜&¬⅝¡˝~/⅞(™±=˛?'¿ì^€¢";
                 String numbers = "0123456789";
                 String alpha = "qwertyuiopasdfghjklzxcvbnm";
                 String alphaUpper = alpha.toUpperCase();
                 
                 for(int i = 0; i < specials.length(); i++)
                 {
                     if(str.indexOf(specials.charAt(i)) != -1)
                     {
                         return false;
                     }
                 }
                 
                 for(int i = 0; i < numbers.length(); i++)
                 {
                     if(str.indexOf(numbers.charAt(i)) != -1)
                     {
                         return false;
                     }
                 }
                 
                 for(int i = 0; i < alphaUpper.length(); i++)
                 {
                     if(str.indexOf(alphaUpper.charAt(i)) != -1)
                     {
                        return false;
                     }
                 }
                 
                 for(int i = 0; i < alpha.length(); i++)
                 {
                     if(str.indexOf(alpha.charAt(i)) != -1)
                     {
                        return false;
                     }
                 }
                 
                 return result;
    } 
    
    public static void main(String[] args)
    {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        
        while(!isStringOnlyMorse(s))
        {
            System.out.println("Insert morse string to decode. Insert only morse characters.");
            try
            {
                s = br.readLine();
            }
            catch (IOException ex)
            {
                Logger.getLogger(MorseTranslator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        Translator tran = new Translator();
        tran.translate(s);
        
    }
    
}
