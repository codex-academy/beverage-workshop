package beverages;

public class HotBeverage extends Beverage  {

    @Override
    public String drink() {
        return "drink a hot beverage";
    }

    public String drinkSlowly() {
        return "Drink slow this is hot";
    }

}
