package day2;

import java.util.*;
    public class Alphabet
    {
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            String input=sc.nextLine();
            String result="";
            for(int i=0;i<input.length();i++)
            {
                if(Character.isUpperCase(input.charAt(i)))
                {
                    result=result+Character.toLowerCase(input.charAt(i));
                }
                else
                {
                    result=result+Character.toUpperCase(input.charAt(i));
                }
            }

            System.out.println(result);
        }
    }

