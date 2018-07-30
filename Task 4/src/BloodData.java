public class BloodData
{
    private String bloodType;
    private char RhFactor;

    public BloodData()
    {
        bloodType = "O";
        RhFactor = '+';
    }

    public BloodData(String bloodType, char RhFactor)
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
