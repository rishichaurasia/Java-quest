import java.util.Scanner;
public class xpattern
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = scn.nextInt();
        pattern(n);
        scn.close();    
    }
    public static void pattern(int n)
    {
        for (int i = 1;i<=n;i++)
        {
            for (int j = 1; j<=n;j++)
            {
                if (i==j || i+j==n+1) 
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println("");
        }
        
    }
}