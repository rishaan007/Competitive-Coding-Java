import java.util.*;
public class Count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,p,up=0,low=0,v=0,ch;
        String str;
        char chr;
        System.out.println("Enter a String");
        str=sc.nextLine();
        p=str.length();
        System.out.println("Enter 1 to count uppercase characters ");
        System.out.println("Enter 2 to count lowercase characters ");
        System.out.println("Enter 3 to count the vowels ");
        System.out.println("Enter your choice");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                for(i=0;i<p;i++)
                {
                chr=(str.charAt(i));
                if(Character.isUpperCase(chr))
                up = up + 1;
            }
            System.out.println("The number of uppercase characters= " + up);
            break;
            case 2:
            for(i=0;i<p;i++)
            {
             chr=(str.charAt(i));
             if(Character.isLowerCase(chr))
             low = low + 1;
            }
            System.out.println("The number of lowercase characters=" +low);
            break;
            case 3:
                for(i=0;i<p;i++)
                {
                    chr=(str.charAt(i));
                    if((chr=='A')||(chr=='E')||(chr=='I')||(chr=='O')||(chr=='U')||(chr=='a')||(chr=='e')||(chr=='i')||(chr=='o')||(chr=='u'))
                    v=v+1;
                }
                System.out.println("The total no. of vowels=" +v);
                break;
                default:
                    System.out.println("Wrong Choice!!!");
        }
    }
}