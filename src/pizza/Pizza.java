package pizza;

public class Pizza {


    public String size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping){
        this.size= size;
        this.numberOfCheeseTopping= numberOfCheeseTopping;
        this.numberOfPepperoniTopping= numberOfPepperoniTopping;
    }


    public int calcCost(){
        int baseValue= switch (size){
            case "small" -> 10;
            case "medium" -> 12;
            case "large" -> 14;
            default -> 0;
        };
        return baseValue + 2 * (numberOfPepperoniTopping + numberOfCheeseTopping);

    }


    public String toString(){
        return "Your " + size + " pizza with " + numberOfCheeseTopping + " cheese toppings and " +
                numberOfPepperoniTopping + " pepperoni toppings costs a total of " +calcCost();
    }

}
