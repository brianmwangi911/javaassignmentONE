import java.util.Scanner;

public class pricediscounts extends user {
    public pricediscounts(String username, String password) {
        super(username, password);
    }

    public static void main(String[] args) {
        String[] names, prices;
        Scanner pick;
        String  name;
        double price,amount = 0, discountamount = 0;
        int discount=0;
        names = new String[5];
        prices = new String[5];
        pick = new Scanner(System.in);

        pricediscounts user1 = new pricediscounts("","");
        boolean valid;

        System.out.println(" username and password please");
        if (pick.hasNextLine()){
            user1.username=pick.nextLine();
            user1.password=pick.nextLine();
            valid=true;
        }else {
            System.out.println("Correct input data ");
            valid=false;
        }


        for (int i = 0; i < 5; i++) {
            System.out.println("Enter item's name");
            names[i] = pick.next();
            System.out.println("Enter item's price");
            price = pick.nextDouble();
            prices[i] = String.valueOf(price);


            if (price > 4000 && price < 5001) {
                discount = 500;

            } else if (price > 3000 && price < 4001) {
                discount = 350;

            } else if (price > 2000 && price < 3001) {
                discount = 200;

            } else if (price > 1000 && price < 2001) {
                discount = 100;

            } else if (price > 0 && price < 1001) {
                discount = 50;

            } else {
                System.out.println("price does not exist");
            }



            price=price-discount;
            amount = amount + price;
            discountamount=discountamount + discount;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(names[i] + ": " + prices[i]);
        }
        System.out.println("Total amount: " + amount);
        System.out.println("Discounted amount: " + discountamount);
    }
}



