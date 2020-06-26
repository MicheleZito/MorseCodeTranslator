package morsetranslator;

public class Translator
{
    private MorseTree alphabet;
    
    public Translator()
    {
        this.alphabet = new MorseTree();
    }
    
    public void translate(String message)
    {
        String[] parts = message.split(" ");
        
        String translatedMessage = "";
        
        for(String i : parts)
        {
            String temp = this.alphabet.search(i);
            if(!temp.equals("Root") && !temp.equals("void"))
            {
                translatedMessage += temp;
            }
            else
                translatedMessage += " ";
            
        }
        
        System.out.println("The translated message is:");
        System.out.println(translatedMessage);
    }
}
