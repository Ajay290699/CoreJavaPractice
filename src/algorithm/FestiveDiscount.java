package algorithm;

import java.util.Scanner;

public class FestiveDiscount {

    public static void main(String[] args) {
        FestiveDiscount festiveDiscount = new FestiveDiscount();
        //festiveDiscount.discount();
        festiveDiscount.bankbalanceCheck();
    }

    //write an alogorithm to calculate the discount if total bill amount is greater than 500 give 5% discount
    //on total bill amount

    public void discount(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your total bill amount to get discount : ");
        int totalBill = sc.nextInt();
        if (totalBill >= 500) {
            int discountedAmount;
            discountedAmount = (totalBill * 5) / 100;
            totalBill = totalBill - discountedAmount;
            System.out.println("your discounted bill amount : " + totalBill);
        } else {
            System.out.println("your total bill is not greater than 500 \nyou are not eligible for discount");
        }
    }

    //Every quarter bank charges 50 tot it's customer for maintenance. this amount is auto-debited from account, if balance goes
    //below 100 send message account frozen
    //write an algorithm to display the calculated new bank account balance with appriopriate message

    public String bankbalanceCheck() {
        double charges = 50;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your account balance : ");
        double balance = sc.nextDouble();
        if (balance < 100) {
            System.out.println("your account has frozen due to low balance \nyour current balance : " + balance);
        } else {
            balance = balance - charges;
            System.out.println("your account balance after deducting charges is :" + balance);
        }
        return null;
    }
}
