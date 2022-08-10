package day3;
import java.util.Scanner;
class CustomException extends  Exception {
    public CustomException() {

        System.out.println("Nominee not eligible");
    }
}


    public class CustomerExceptionclass {
        public static void main(String args[]) {
            int Age;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Age of nominee- ");
            Age = sc.nextInt();
            try {
                if (Age < 25)
                    throw new CustomException();
                else
                {
                    System.out.println("Nominee accepted ");
                }

            } catch (Exception e) {
            } finally {
                System.out.println("By election commission ");
            }
        }
    }



