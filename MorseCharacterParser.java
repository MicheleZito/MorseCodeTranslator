package morsetranslator;

public class MorseCharacterParser
{
    private int currentIndex;
    private Boolean end;
    private String characterToParse;
    
    public MorseCharacterParser(String charact)
    {
        this.currentIndex = 0;
        this.end = false;
        this.characterToParse = charact;
    }
    
    public Boolean isEnd()
    {
        return this.end;
    }
    
    public char getCurrentMorseElement()
    {
        char ret = ' ';
        int temp = this.currentIndex;
        if(!this.end)
        {
            if((temp + 1) == this.characterToParse.length())
            {
                this.end = true;
                ret = this.characterToParse.charAt(currentIndex);
                this.currentIndex++;
            }
            else
            {
                ret = this.characterToParse.charAt(currentIndex);
                this.currentIndex++;
            }
        }
        
        return ret;
    }
}
