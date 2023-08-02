package duke;

public class ShopApp {
    public static void main(String[] args) {
        Customer newCustomer = new Customer();
        newCustomer.setName("Pinky");
        newCustomer.setSize(5);

        System.out.println(newCustomer.getName() + "is size " + newCustomer.getSize());

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
        item3.size = "L";

        item4.description = "Blue T-Shirt";
        item4.price = 10.5;
        item4.size = "M";

        Clothing[] items = {item1, item2, item3, item4};

        Double totalItem1;
//        Double totalItem2 = item2.price * (1+tax);
        Double total = 0.0;
        String detailsItem;

        newCustomer.addItems(items);
        newCustomer.getTotalClothingCost(newCustomer.getItems());


        //System.out.println(item.getDescription()+ " costs $"+item.getPrice() +" with tax and is size " + item.getSize());
    }
}


//       System.out.println("Item1 is a "+detailsItem +" that costs $"+total +" with tax.");
//       System.out.println("Item2 is a "+item2.description +" that costs $"+total +".");
//       System.out.println(newCustomer.name +" is size "+newCustomer.size
//       );
        //System.out.println("Total =" + total);






