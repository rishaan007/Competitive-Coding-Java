import java.util.*;
class Capital
{
    String sent;
    int freq;
    Capital()
    {
        sent="";
        freq=0;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        sent=sc.nextLine();
    }
    boolean isCap (String w)
    {
    
      if(Character.isUpperCase(w.charAt(0)))
          return true;
        else
          return false;   
}
void display()//explanation
{
    //System.out.println("sentence="+sent);
      //String b=" "+sent;
      //char c;
      /*for(int i=0;i<b.length();i++)
      { 
         c=b.charAt(i);
         if (c==' ')
         { 
            if(Character.isUpperCase(b.charAt(i+1)) )
               freq++;
         }
      }*/
      //System.out.println("Freqency of title word="+freq);
      int count=0;
      while(isCap(sent))
      {
          count++;
      }
      
      for(int i=0;i<sent.length();i++)
      {
          if (sent.charAt(i)==' ')
          {
              sent=sent.substring(i,sent.length()-1);
              while(isCap(sent))
      {
          count++;
      }
          }
      }
      System.out.println(count);
}
public static void main(String args[])
{
  Capital obj=new Capital();
  obj.input();
  obj.display();
} 
}



    
    
