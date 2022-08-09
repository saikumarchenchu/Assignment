import java.util.*;

    public class Sequence {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            ArrayList<Integer>al=new ArrayList<>();
            al.add(n);
            while(n!=1){
                if(n%2!=0){
                    n=(3*n)+1;
                    al.add(n);
                }
                else{
                    n=n/2;
                    al.add(n);
                }
            }
            for(int i=0;i<al.size();i++)
            {
                System.out.print(al.get(i)+" ");
            }
        }
    }

