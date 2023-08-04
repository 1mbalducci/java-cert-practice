package duke;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Customer {
        private String name;
        private String size;
        private ArrayList< Clothing>items;
        private double total=0.0;

        public double averagePriceItems;

        public Customer(){};

        public Customer(String name,  int size) {
                this.name = name;
                this.size = setSize(size);
        }

        public Customer(String name,  String size) {
                this.name = name;
                this.size = size;
        }

        public ArrayList< Clothing> addItems(ArrayList<Clothing> items) {
                ArrayList <Clothing> itemsPurchased= new ArrayList<>();
                for (Clothing  item:items) {
                        if ( item.getSize().equals(this.size)){
                                itemsPurchased.add(item);
                        }
                }
                return this.items=itemsPurchased;
        }

        public Double getTotalClothingCost() {
                for (Clothing totalItem : items) {
                                //System.out.println(totalItem.getPrice());
                                if (this.total + totalItem.getPrice() < 35) {
                                        total += totalItem.getPrice();
                                }
                        }

                                return total;
                }
        public double averagePrice(ArrayList<Clothing> selections){
                double itemsTotalPrice=0;
                int numberOfItems=selections.size();
                double average=0;
                for (Clothing item:selections) {
                      if (item.getSize().equals("S") ){
                           itemsTotalPrice+=item.getPrice();
                      }
                }
                try {average= itemsTotalPrice/numberOfItems;}

                catch (ArithmeticException error2) {
                        System.out.println("Arithmetic");
                }
                catch (Exception error3) {
                        System.out.println("Yo There's an exception here! Don't cry");
                }
               // average = itemsTotalPrice/numberOfItems;
                return averagePriceItems=average;
        }

        public double getAveragePriceItems() {
                return averagePriceItems;
        }

        public void setAveragePriceItems(double averagePriceItems) {
                this.averagePriceItems = averagePriceItems;
        }

        public double getTotal() {
                return total;
        }

        public void setTotal(double total) {
                this.total = total;
        }

        public ArrayList<Clothing> getItems() {
                return items;
        }

        public void setItems(ArrayList<Clothing> items) {
                this.items = items;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getSize() {
                return size;
        }

        public void setSize(String size) {
                this.size = size;
        }
        public String setSize(int measurement) {
                switch (measurement) {
                        case 1, 2, 3:
                                setSize("S");
                                break;
                        case 7, 8, 9:
                                setSize("L");
                                break;
                        default:
                                this.size = "M";
                }
        return this.size;
        }

}
