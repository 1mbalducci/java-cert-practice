package duke;

import java.util.ArrayList;

public class ShopApp {
    public static void main(String[] args) {
        Customer newCustomer = new Customer("Pinky",7);

        System.out.println(newCustomer.getName() + " is size " + newCustomer.getSize());
        System.out.println(Clothing.MIN_PRICE);
        Clothing item1 = new Clothing("Blue Jacket", 20.9, "L");
        Clothing item2 = new Clothing("Orange T-shirt",10.5,"S");
        Clothing item3 = new Clothing("Green Scarf",5.0, "S");
        Clothing item4 = new Clothing("Blue T-Shirt",10.5, "M");


        ArrayList<Clothing> items= new ArrayList<Clothing>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);

        System.out.println("Clothing array has " + items.size()+ "Items");
        int [] intArray= new int[5];
        intArray[0]= 1;
        System.out.println("IntArray 0 is " + intArray[0]);

        intArray[0]= 2;
        System.out.println("IntArray 0 is " + intArray[0]);
        Double totalItem1;
//        Double totalItem2 = item2.price * (1+tax);
        Double total = 0.0;
        String detailsItem;

        newCustomer.addItems(items);



        for (Clothing item : newCustomer.getItems()) {
            System.out.println(item.getDescription() + " =" + item.getPrice() + " with tax and it's size is " + item.getSize());
        }

        newCustomer.getTotalClothingCost();
        System.out.println("The total Price for " + newCustomer.getName() + " was "+ newCustomer.getTotal());

        //double itemsTotalPrice=0;
        int numberOfItems=0;
        int average=0;
        for (Clothing item:items) {
            if (item.getSize().equals("S")) {
                numberOfItems++;
                average += item.getPrice();
            }

            try {
                average = average / numberOfItems;
                System.out.println("The average price of items is " + average);
            } catch (ArithmeticException error2) {
                System.out.println("Arithmetic");
            } catch (Exception error3) {
                System.out.println("Yo There's an exception here! Don't cry");
            }
            // average = itemsTotalPrice/numberOfItems;
        }

    }
}


//       System.out.println("Item1 is a "+detailsItem +" that costs $"+total +" with tax.");
//       System.out.println("Item2 is a "+item2.description +" that costs $"+total +".");
//       System.out.println(newCustomer.name +" is size "+newCustomer.size
//       );
        //System.out.println("Total =" + total);






