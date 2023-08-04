package duke;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ShopApp {
    public static void main(String[] args) {
        Customer newCustomer = new Customer("Pinky",3);

        System.out.println(newCustomer.getName() + " is size " + newCustomer.getSize());
        Clothing item1 = new Clothing("Blue Jacket", 20.9, "S");
        Clothing item2 = new Clothing("Orange T-shirt",10.5,"S");
        Clothing item3 = new Clothing("Green Scarf",5.0, "S");
        Clothing item4 = new Clothing("Blue T-Shirt",10.5, "M");


        ArrayList<Clothing> items= new ArrayList<Clothing>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);

        System.out.println("Clothing array has " + items.size()+ " Items");

        newCustomer.addItems(items);



        for (Clothing item : newCustomer.getItems()) {
            System.out.println(item);
        }

        newCustomer.getTotalClothingCost();
        System.out.println("_______________________");
        System.out.println("The total Price for " + newCustomer.getName() + " was "+ newCustomer.getTotal());
        System.out.println("_______________________");

        int numberOfItems=0;
        double average=0;
        double totalCostOfItems=0;
        for (Clothing item:newCustomer.getItems()) {
                numberOfItems++;
                totalCostOfItems += item.getPrice();
            }

            try {
                average = (numberOfItems==0) ? average: totalCostOfItems/numberOfItems;
                // the above line prevents the need to the exception below
                System.out.println("Current # of items is " + numberOfItems);
                System.out.println("Current total Price " + totalCostOfItems);
                System.out.println("Current average price of items is " + average);
                System.out.println("_____________________");

            } catch (ArithmeticException error2) {
                System.out.println("Arithmetic");
            } catch (Exception error3) {
                System.out.println("Yo There's an exception here! Don't cry");
            }

        Collections.sort(newCustomer.getItems(), Collections.reverseOrder());
        for (Clothing item:newCustomer.getItems()) {
            System.out.println(item);
        }



    }
}


//       System.out.println("Item1 is a "+detailsItem +" that costs $"+total +" with tax.");
//       System.out.println("Item2 is a "+item2.description +" that costs $"+total +".");
//       System.out.println(newCustomer.name +" is size "+newCustomer.size
//       );
        //System.out.println("Total =" + total);






