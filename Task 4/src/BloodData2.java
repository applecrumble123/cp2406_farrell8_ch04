public class BloodData2
{
    private String bloodType;
    private char RhFactor;

    public BloodData2()
    {
        this("O",'+');
    }

    public BloodData2(String bloodType, char RhFactor)
    {
        this.bloodType = bloodType;
        this.RhFactor = RhFactor;
    }


    public String getBloodType()
    {
        return bloodType;
    }

    public char getRhFactor()
    {
        return RhFactor;
    }

    public String toString()
    {
        return getBloodType() + "\n" + getRhFactor();
    }
}
