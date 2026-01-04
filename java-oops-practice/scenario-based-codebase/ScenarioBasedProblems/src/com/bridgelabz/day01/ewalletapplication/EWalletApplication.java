package com.bridgelabz.day01.ewalletapplication;

// --- Main Execution ---
public class EWalletApplication {
    public static void main(String[] args) {
        Wallet alice = new PersonalWallet("Alice", 1000);
        Wallet bobShop = new BusinessWallet("Bob's Tech Shop", 5000);

        System.out.println("--- Transaction 1: Alice buys item ($600) ---");
        // Should fail due to Personal Limit
        alice.transferTo(bobShop, 600); 

        System.out.println("\n--- Transaction 2: Alice buys item ($200) ---");
        // Should succeed
        alice.transferTo(bobShop, 200);

        System.out.println("\n--- Transaction 3: Bob pays supplier ($1000) ---");
        // Should succeed with tax deduction
        bobShop.transferTo(alice, 1000);

        System.out.println("\n--- Final Balances ---");
        System.out.println("Alice: $" + alice.getBalance());
        System.out.println("Bob:   $" + bobShop.getBalance());
    }
}