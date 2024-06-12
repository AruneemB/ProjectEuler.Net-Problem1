import java.util.ArrayList;

public class MultiplesOf3Or5
{
    public static int sumMultiplesOf3Or5(int bound)
    {
        int sum = 0;
        for(int i = 0; i < bound; i++)
        {
            if(i % 3 == 0 || i % 5 == 0) sum += i;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        System.out.println(sumMultiplesOf3Or5(1000));
    }
}
