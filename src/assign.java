import java.util.Scanner;

    public class DemoTranslation {
        public static void main(String[] args) {
            int x, y, z;
            String8 lab = new String8(2);
            System.out.println("Enter x");
            x = STDIN_SCANNER.nextInt();
            System.out.println("Enter y");
            y = STDIN_SCANNER.nextInt();
            System.out.println("Enter z");
            z = STDIN_SCANNER.nextInt();
            System.out.println("Enter the lab allocated for ACE training");
            lab.copyFrom(STDIN_SCANNER.next());
            if(lab.equals("L1")) {
                if(y < z) {
                    System.out.print("L2 has the minimal seating capacity");
                } else {
                    System.out.print("L3 has the minimal seating capacity");
                }
            } else if(lab.equals("L2")) {
                if(x < z) {
                    System.out.print("L1 has the minimal seating capacity");
                } else {
                    System.out.print("L3 has the minimal seating capacity");
                }
            } else if(x < y) {
                System.out.print("L1 has the minimal seating capacity");
            } else {
                System.out.print("L2 has the minimal seating capacity");
            }
        }

        public final static Scanner STDIN_SCANNER = new Scanner(System.in);
    }

