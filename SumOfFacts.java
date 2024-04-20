import java.util.Scanner;

public class SumOfFacts {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        long N=sc.nextLong();
        long fact=1,sum=0;
        while(N!=0)
        {
            long rem=N%10;
            for(int i=1;i<=rem;i++)
            {
                fact=fact*i;
            }
            sum+=fact;
            fact=1;
            N/=10;
        }
        System.out.println(sum);
    }

}
