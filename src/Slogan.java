//represents a single slogan string
public class Slogan
{
    private String phrase;
    private static int count = 0;

    //sets up a slogan and counts the number of instances created.
    public Slogan(String str)
    {
        phrase = str;
        count++;
    }//end of slogan single-arg constructor
    //returns the number of instances that have been created
    public static int getCount()
    {
        return count;
    }//end of count getter
    //returns the slogan as a string
    public String toString()
    {
        return phrase;
    }//end of toString

}//end of slogan
