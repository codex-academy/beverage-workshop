package beverages;

public class ColdBeverage extends Beverage {
    @Override
    public String drink() {
        return "drink a cold beverage";
    }

    public String dontSpill() {
        return "Don't spill your cold drink!";
    }
}
