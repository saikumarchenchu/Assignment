package day3;

public class NullPointerExceptionclass {

    public static void main(String args[]) {
        String name = null;
        try {

            name.length();

        } catch (NullPointerException e) {
            System.out.println(e);
        }
        System.out.println("rest of the code...");
    }
}