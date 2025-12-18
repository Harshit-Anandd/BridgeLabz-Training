// Program to calculate discounted fee after applying discount percentage
public class BasicFeeDiscount {
    public static void main(String[] args) {

        // Create fee and discount percent
        double fee = 125000;
        double discountPercent = 10;

        // Calculate discount
        double discount = (discountPercent / 100) * fee;

        // Calculate final fee
        double finalFee = fee - discount;

        // Display output
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}