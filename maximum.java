import java.util.Scanner;

public class maximum {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int [] ar=new int[m];
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=sc.nextInt();
        }
        int res=ar[0];
        int profit=0;
        for(int i=0;i<ar.length;i++)
        {
            profit=Math.max(profit,ar[i]-res);
            res=Math.min(res,ar[i]);

            }

    System.out.println(profit);}}

