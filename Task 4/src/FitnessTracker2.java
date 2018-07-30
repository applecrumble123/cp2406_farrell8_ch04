import java.util.*;
public class FitnessTracker2
{
    private String activity;
    private int minutes;
    private Calendar date;

    public FitnessTracker2()
    {
        this("running",0,Calendar.getInstance());
        //no parameter, it calls the second constructor
        //once it calls the 2nd constructor, it forces the value into the parameter
        //1st constructor
    }

    public FitnessTracker2(String activity, int minutes, Calendar date)
    {
        this.activity = activity;
        this.minutes = minutes;
        this.date = date;
        date.set(2018,1,1);
        //2nd constructor
    }

    public String getActivity()
    {
        return activity;
    }
    public int getMinutes()
    {
        return minutes;
    }

    public String getDate()
    {

        return date.get(Calendar.DAY_OF_MONTH) + "/" + date.get(Calendar.MONTH) + "/" + date.get(Calendar.YEAR);

    }

    public String toString()
    {
        return getActivity() + "\n" + getMinutes() + "\n" + getDate();
    }

}


