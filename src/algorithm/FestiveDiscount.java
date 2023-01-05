package algorithm;

import java.util.Scanner;

public class FestiveDiscount {

    public static void main(String[] args) {
        FestiveDiscount festiveDiscount = new FestiveDiscount();
        festiveDiscount.discount();
    }

    //write an alogorithm to calculate the discount if total bill amount is greater than 500 give 5% discount
    //on total bill amount

    public void discount(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your total bill amount to get discount : ");
        int totalBill = sc.nextInt();
        if (totalBill >= 500){
            int discountedAmount;
            discountedAmount = (totalBill*5)/100;
            totalBill = totalBill - discountedAmount;
            System.out.println("your discounted bill amount : "+totalBill);
        }else {
            System.out.println("your total bill is not greater than 500 \nyou are not eligible for discount");
        }
    }

    
}
