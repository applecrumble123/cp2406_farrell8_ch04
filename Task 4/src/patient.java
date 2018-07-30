public class patient
{
    private int ID_Number;
    private int age;

    public patient()
    {
        ID_Number = 0;
        age = 0;
        BloodData bloodData = new BloodData();
        System.out.println(bloodData);
    }

    public patient(int ID_Number, int age)
    {
        this.ID_Number = ID_Number;
        this.age = age;
    }

    public int getID_Number()
    {
        return ID_Number;
    }

    public int getAge()
    {
        return age;
    }
}
