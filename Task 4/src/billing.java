public class billing
{
    public static void main(String[] args)
    {
       double price_Of_One_Book = 5.00;
       int quantity = 5;
       int coupon = 2;
       double totalCost = computeBill(price_Of_One_Book);
       displayComputeBill(totalCost);

       double totalCost2 = computeBill(price_Of_One_Book, quantity);
       displayComputeBill2(totalCost2);

       double totalCost3 = computeBill(price_Of_One_Book, quantity, coupon);
       displayComputeBill3(totalCost3);

        billing test = new billing();
        test.displayComputeBill(totalCost);
        test.displayComputeBill2(totalCost2);
        test.displayComputeBill3(totalCost3);


    }
    private static double computeBill(double price_Of_One_Book)
    {
        return price_Of_One_Book + (price_Of_One_Book *0.08);
    }
    private static void displayComputeBill(double totalCost)
    {
        System.out.println("The cost of one book is $" + totalCost);
    }


    private static double computeBill(double price_Of_One_Book, double quantity)
    {
        return (price_Of_One_Book*quantity) + 0.08 *(price_Of_One_Book*quantity);
    }
    private static void displayComputeBill2(double totalCost2)
    {
        System.out.println("The total cost is $" + totalCost2);
    }


    private static double computeBill (double price_Of_One_Book, double quantity, double coupon)
    {
        return (price_Of_One_Book*quantity) - coupon + (0.08 *(price_Of_One_Book*quantity));
    }
    private static void displayComputeBill3(double totalCost3)
    {
        System.out.println("The total cost is $" + totalCost3);
    }
}
