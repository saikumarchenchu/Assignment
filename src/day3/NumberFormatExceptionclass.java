package day3;

public class NumberFormatExceptionclass {

    public static void main(String args[]) {
        String s = "abc";
        try {

            Integer.parseInt(s);

        }
        catch (NumberFormatException e)
        {
            System.out.println(e);

        }
        System.out.println("rest of the code...");
    }
}