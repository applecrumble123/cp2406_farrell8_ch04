public class FormLetterWriting
{
    public static void main (String[] args)
    {
        String last_Name = "John";
        String first_Name =  "Tan";
        displaySalutation(last_Name);
        displaySalutation(last_Name, first_Name);

        FormLetterWriting test = new FormLetterWriting();
        test.displaySalutation(last_Name);
        test.displaySalutation(last_Name,first_Name);

    }
    private static void displaySalutation(String last_Name)
    {
        System.out.println("Dear Mr. or Ms. " + last_Name);
    }

    private static void displaySalutation(String last_Name, String first_Name)
    {
        System.out.println("Dear " + first_Name + " " + last_Name + ", Thank you for your recent order.");
    }
}
