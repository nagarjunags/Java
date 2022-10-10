import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class Ovels_con
{
    public static void main(String[] args)
    {
        char a;
        System.out.print("enter the letter");
        Scanner inp =new Scanner(System.in);
        a=inp.next().charAt(0);
        if(((a == 'a')||(a=='e')||(a=='i')||(a=='o')||(a=='u'))&& Character.isAlphabetic(a))
            System.out.println("it is ovel");
        else if(Character.isAlphabetic(a))
        {
            System.out.println("consonent");
        }
        else
        {
            System.out.println("Not alphabet");
        }    

    }
}