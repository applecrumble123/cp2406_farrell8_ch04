import java.util.Calendar;
public class FitnessTracker
{
    private String activity;
    private int minutes;
    private Calendar date;


    public FitnessTracker()
    {
        activity = "running";
        minutes = 0;
        date = Calendar.getInstance();
        date.set(2018,1,1);
        //don't have parameter, it calls this method
        // got parameter, it calls the constructor below
        // 1st constructor
    }

    public FitnessTracker(String activity, int minutes, Calendar date)
    {
        this.activity = activity;
        this.minutes = minutes;
        this.date = date;
        //2nd constructor
        //if there are 3 parameters, it will take the 3 instances in the main
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

