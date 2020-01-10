package badjava.createanddestroyobject.contructorwithtoomanyparams.hierarchicalbuilder;

import static badjava.createanddestroyobject.contructorwithtoomanyparams.hierarchicalbuilder.Pizza.Topping.*;
import static badjava.createanddestroyobject.contructorwithtoomanyparams.hierarchicalbuilder.NyPizza.Size.*;

public class PizzaTest {
    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(SMALL)
                .addTopping(SAUSAGE).addTopping(ONION).build();
        Calzone calzone = new Calzone.Builder()
                .addTopping(HAM).sauceInside().build();
        
        System.out.println(pizza);
        System.out.println(calzone);
    }
}
