import java.util.Calendar;

public class TestFitnessTracker
{
    public static void main(String[] args)
    {
        FitnessTracker test1 = new FitnessTracker();
        System.out.println(test1);

        FitnessTracker test2 = new FitnessTracker("Swimming", 10, Calendar.getInstance());
        System.out.println(test2);

        FitnessTracker2 test3 = new FitnessTracker2();
        System.out.println(test3);




    }


}
