package day3;

public class ArrayIndexOutOfBoundsExceptionclass {
    public static void main(String args[]) {
        int a[] = new int[5];
        try {
            //code that may raise exception
            a[10] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } finally {
            System.out.println("In finally block");
        }
    }
}
