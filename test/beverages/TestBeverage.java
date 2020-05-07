package beverages;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBeverage {

    @Test
    public void shouldBeAbleToCreateABeverage() {

        Beverage beverage = new Beverage();
        assertEquals("drink a beverage",beverage.drink());

    }

    @Test
    public void olwethuShouldBeAbleToDrinkABeverage() {

        Beverage beverage = new Beverage();
        Person olwethu = new Person();

        assertEquals("drink a beverage", olwethu.drinkBeverage(beverage));

    }

    @Test
    public void olwethuShouldBeAbleToDrinkAHotDrink() {

        //
        Beverage beverage = new HotBeverage();

        Person olwethu = new Person();

        assertEquals("drink a hot beverage", olwethu.drinkBeverage(beverage));

    }


    @Test
    public void olwethuShouldBeAbleToDrinkAColdDrink() {

        //
        Beverage beverage = new ColdBeverage();

//        System.out.println( beverage instanceof Object );
        System.out.println( beverage instanceof Beverage );
        System.out.println( beverage instanceof HotBeverage );
        System.out.println( beverage instanceof ColdBeverage );

//        HotBeverage hotBeverage = (HotBeverage)beverage;

        Person olwethu = new Person();

        assertEquals("drink a cold beverage", olwethu.drinkBeverage(beverage));

    }

    @Test
    public void shouldBeAbleToDrinkHotBeverageSlowly() {

        //
        Beverage beverage = new HotBeverage();
        HotBeverage hotBeverage = (HotBeverage) beverage;

        Person olwethu = new Person();
        assertEquals("drink a hot beverage", olwethu.drinkBeverage(beverage));
        assertEquals("Drink slow this is hot", hotBeverage.drinkSlowly());

    }

    @Test
    public void shouldNotSpillDrink() {

        //
        Beverage beverage = new ColdBeverage();
        ColdBeverage coldBeverage = (ColdBeverage) beverage;

        Person olwethu = new Person();
        assertEquals("drink a cold beverage", olwethu.drinkBeverage(beverage));
        assertEquals("Don't spill your cold drink!", coldBeverage.dontSpill());

    }

    @Test
    public void shouldBeAbleToDrinkFruitJuice() {

        //
        Beverage beverage = new FruitJuice();
        ColdBeverage coldBeverage = (ColdBeverage) beverage;

        System.out.println(beverage instanceof Beverage);

        if(beverage instanceof HotBeverage){
            HotBeverage hb = (HotBeverage)beverage;
        }

        if(beverage instanceof ColdBeverage) {
            ColdBeverage cb = (ColdBeverage)beverage;
        }

        if(beverage instanceof FruitJuice) {
            FruitJuice fj = (FruitJuice)beverage;
        }

        Person olwethu = new Person();
        assertEquals("Drinking a Fruit Juice so : Don't spill fruit juice is too precious.", olwethu.drinkBeverage(beverage));
        assertEquals("Don't spill fruit juice is too precious.", coldBeverage.dontSpill());

    }

}
