package duke;

import java.util.ArrayList;

public class ShopApp {
    public static void main(String[] args) {
        Customer newCustomer = new Customer();
        newCustomer.setName("Pinky");
        newCustomer.setSize(3);

        System.out.println(newCustomer.getName() + " is size " + newCustomer.getSize());

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        Clothing item3 = new Clothing();
        Clothing item4 = new Clothing();

        item1.setDescription("Blue Jacket");
        item1.setPrice(20.9);
        item1.setSize("L");

        item2.setDescription("Orange T-shirt");
        item2.price = 10.5;
        item2.size = "S";

        item3.description = "Green Scarf";
        item3.price = 5.0;
        item3.size = "S";

        item4.description = "Blue T-Shirt";
        item4.price = 10.5;
        item4.size = "M";

        ArrayList<Clothing> items= new ArrayList<Clothing>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);

        System.out.println(items);



        Double totalItem1;
//        Double totalItem2 = item2.price * (1+tax);
        Double total = 0.0;
        String detailsItem;

        newCustomer.addItems(items);



        for (Clothing item : newCustomer.getItems()) {
            System.out.println(item.getDescription() + " =" + item.getPrice() + " with tax and it's size is " + item.getSize());
        }

        newCustomer.getTotalClothingCost(newCustomer.getItems());
        System.out.println("Total Price for " + newCustomer.getName() + " was "+ newCustomer.getTotal());

    }
}


//       System.out.println("Item1 is a "+detailsItem +" that costs $"+total +" with tax.");
//       System.out.println("Item2 is a "+item2.description +" that costs $"+total +".");
//       System.out.println(newCustomer.name +" is size "+newCustomer.size
//       );
        //System.out.println("Total =" + total);






