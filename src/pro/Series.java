package pro;
import java.util.Scanner;

public class Series {
    // Function to return sum of
    // 1/1 + 1/2 + 1/3 + ..+ 1/n
        static double sum(int n)
        {
            double i, s = 0.0;
            for (i = 1; i <= n; i++)
                s = s + 1/i;
            return s;
        }

        public static void main(String args[])
        {
           // Scanner ob=new Scanner();
            int n=7;
            System.out.printf("Sum is %f", sum(n));

        }
    }

