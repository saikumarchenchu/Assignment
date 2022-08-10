package day2;

import java.util.Scanner;

public class Statistics {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int a[]=new int[size];
        int count[] =new int[10];
        int sum=0;
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
            sum+=a[i];
            count[a[i]]++;//for tracking mode
        }

        System.out.println("mean :"+sum/size);
        if(size%2==0){
            int median=a[size/2]+a[(size/2)+1];
            System.out.println("median :"+median/2);
        }
        else
        {
            System.out.println("median "+a[size/2]);
        }

        int max=Integer.MIN_VALUE;
        for(int i=0;i<10;i++) {
            if (count[i] > max) {
                max = i;
            }
        }
        System.out.println("mode: "+max);

    }
}
