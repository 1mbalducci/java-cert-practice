package duke;

public class ShopApp {
    public static void main (String[] args) {
        Customer newCustomer = new Customer();
        newCustomer.name = "Pinky";
        int measurement= 3;

        switch (measurement){
            case 1,2,3:
                newCustomer.size= "S";
                break;
            case 7,8,9:
                newCustomer.size= "L";
                break;
            default:
                newCustomer.size = "M";

        }



        Double tax = .2;

        Clothing item1= new Clothing();
        Clothing item2= new Clothing();
        item1.description= "Blue Jacket";
        item1.price= 20.9;

        item2.description= "Orange T-shirt";
        item2.price= 10.5;
        item2.size= "S";

        Double totalItem1 = item1.price * (1+tax);
        Double totalItem2 = item2.price * (1+tax);

        System.out.println("Item1 is a "+ item1.description + " that costs $"+ totalItem1 + " with tax.");
        System.out.println("Item2 is a "+ item2.description + " that costs $"+ totalItem2+".");
       System.out.println(newCustomer.name + " is size "+newCustomer.size
       );
    }


}
