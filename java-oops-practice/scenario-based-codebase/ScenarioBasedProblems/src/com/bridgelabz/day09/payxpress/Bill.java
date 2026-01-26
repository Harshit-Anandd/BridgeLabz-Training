package com.bridgelabz.day09.payxpress;
import java.time.LocalDate;

// 2. Base Class: Bill
public abstract class Bill implements IPayable {
    protected String billType;
    protected double amount;
    protected LocalDate dueDate;
    // Encapsulation: Payment status is private. 
    // It can ONLY be changed via the pay() method, not directly.
    private boolean isPaid;

    public Bill(String type, double amount, String dueDateStr) {
        this.billType = type;
        this.amount = amount;
        this.dueDate = LocalDate.parse(dueDateStr); // Format: YYYY-MM-DD
        this.isPaid = false;
    }

    // Helper to calculate total with late fees
    // Operator: Base + Penalty
    public double getAmountDue() {
        if (LocalDate.now().isAfter(dueDate) && !isPaid) {
            double penalty = 100.0; // Flat late fee
            return amount + penalty;
        }
        return amount;
    }

    public boolean isBillPaid() {
        return isPaid;
    }

    @Override
    public void pay(double amountPaid) {
        if (isPaid) {
            System.out.println(billType + " is already paid.");
            return;
        }

        double totalDue = getAmountDue();
        
        if (amountPaid >= totalDue) {
            this.isPaid = true;
            System.out.println("Payment Successful for " + billType);
            System.out.println("Amount Paid: Rs." + amountPaid);
            
            // Check if user overpaid (simple operator logic)
            if (amountPaid > totalDue) {
                System.out.println("   Change/Credit: Rs." + (amountPaid - totalDue));
            }
        } else {
            System.out.println("Payment Failed. Insufficient Amount.");
            System.out.println("Required: Rs." + totalDue);
        }
    }
}