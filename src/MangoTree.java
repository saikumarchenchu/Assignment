import java.util.*;

    public class MangoTree {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int row=sc.nextInt();
            int col=sc.nextInt();
            int tree=sc.nextInt();
            int a[][]=new int[row][col];
            int k=1;
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    a[i][j]=k;
                    k++;
                }
            }
            boolean flag=false;
            for(int i=0;i<col;i++){
                if(a[0][i]==tree){
                    flag=true;
                }
            }
            for(int i=0;i<row;i++){
                if(a[i][0]==tree){
                    flag=true;
                }
            }
            for(int i=0;i<row;i++){
                if(a[i][col-1]==tree){
                    flag=true;
                }
            }
            if(flag==true){
                System.out.print("Yes");
            }
            else{
                System.out.print("No");
            }
        }
    }

