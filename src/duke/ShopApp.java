package duke;

public class ShopApp {
    public static void main(String[] args) {
        Customer newCustomer = new Customer();
        newCustomer.name = "Pinky";
        int measurement = 3;

        switch (measurement) {
            case 1, 2, 3:
                newCustomer.size = "S";
                break;
            case 7, 8, 9:
                newCustomer.size = "L";
                break;
            default:
                newCustomer.size = "M";

        }


        Double tax = .2;

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        Clothing item3 = new Clothing();
        Clothing item4 = new Clothing();

        item1.description = "Blue Jacket";
        item1.price = 20.9;
        item1.size = "M";

        item2.description = "Orange T-shirt";
        item2.price = 10.5;
        item2.size = "S";

        item3.description = "Green Scarf";
        item3.price = 5.0;
        item3.size = "S";

        item4.description = "Blue T-Shirt";
        item4.price = 10.5;
        item4.size = "S";

        Clothing[] items = {item1, item2, item3, item4};

        Double totalItem1;
//        Double totalItem2 = item2.price * (1+tax);
        Double total = 0.0;
        String detailsItem;

        for (Clothing item : items) {
           if (item.size.equals(newCustomer.size)) {
               System.out.println(item.price);
               item.price = item.price * (1 + tax);
               System.out.println(item.price);
               if (total + item.price < 15) {
                   total += item.price;
                   break;
               }
           }
            System.out.println(total);



            System.out.println(item.description+ " costs $"+item.price +" with tax and is size " + item.size);
        }


//       System.out.println("Item1 is a "+detailsItem +" that costs $"+total +" with tax.");
//       System.out.println("Item2 is a "+item2.description +" that costs $"+total +".");
//       System.out.println(newCustomer.name +" is size "+newCustomer.size
//       );
        System.out.println("Total =" + total);
    }

}





