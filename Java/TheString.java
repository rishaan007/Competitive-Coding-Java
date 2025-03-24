class TheString
{
    String str;
    int len;
    int wordcount;
    int cons;

    TheString()
    {
        str = "";
        wordcount = 0;
        cons = 0;
    }

    TheString(String ds)
    {
        str = ds;
        len = str.length();
        wordcount = 0;
        cons = 0;
    }

    void countFreq()
    {
        char ch;
        str = str.toLowerCase();
        
        // Splitting the string by spaces to count words
        String[] words = str.trim().split("\\s+");
        wordcount = words.length;

        for(int i = 0; i < len; i++)
        {
            ch = str.charAt(i);

            // Checking if the character is a consonant
            if((ch >= 'a' && ch <= 'z') && !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'))
            {
                cons++;
            }
        }
    }

    void Display()
    {
        System.out.println("ORIGINAL STRING: " + str);
        System.out.println("WORD COUNT: " + wordcount);
        System.out.println("CONSONANTS: " + cons);
    }

    public static void main(String args[])
    {
        TheString obj = new TheString("India is my country");
        obj.countFreq();
        obj.Display();
    }
}
