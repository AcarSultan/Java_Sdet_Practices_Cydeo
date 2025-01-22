package candy;

public class CandyClients {

    public static void main(String[] args) {

        Candy candy1 = new Candy("snickers", 1, 15, false);
        System.out.println(candy1);

        Candy candy2 = new Candy("kitkat", 1, 0, true);
        System.out.println(candy2);

        candy1.setPrice(10);
        System.out.println(candy1.getPrice());
    }
}
