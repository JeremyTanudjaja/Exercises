package Coffee_Module;

import java.util.Scanner;

public class Payment {

    Scanner sc;
    public Payment(){
        sc = new Scanner(System.in);
    }

    public void processPayment(float price){
        while(price > 0) {
            float payment = 0f;
            System.out.println("You need to pay: $" + price);

            System.out.println("Input Quarter ($ 0.25)");
            int quarter_input = sc.nextInt();

            System.out.println("Input Dime ($ 0.10)");
            int dime_input = sc.nextInt();

            System.out.println("Input Nickel ($ 0.05)");
            int nickel_input = sc.nextInt();

            System.out.println("Input Penny ($ 0.01)");
            int penny_input = sc.nextInt();

            payment = (0.25f * quarter_input) + (0.10f * dime_input) +
                    (0.05f * nickel_input) + (0.01f * penny_input);
            price = price - payment;
        }

        if(price < 0){
            price = price * -1;

            //System.out.println(price);

            int kembali_quarter = (int) (price/0.25);
            System.out.println("Kembali Quarter: " + kembali_quarter);
            price = price -kembali_quarter * 0.25f;

            int kembali_dime = (int) (price/0.1);
            System.out.println("Kembali Dime: " + kembali_dime);
            price = price - kembali_dime * 0.1f;

            int kembali_nickel = (int) (price/0.05);
            System.out.println("Kembali Nickel: " + kembali_nickel);
            price = price -kembali_nickel * 0.05f;

            int kembali_penny = (int) (price/0.01);
            System.out.println("Kembali Penny: " + kembali_penny);
            price = price - kembali_penny * 0.01f;
        }
        System.out.println("payment system done");
    }

}
