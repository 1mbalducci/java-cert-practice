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

        public ArrayList< Clothing> addItems(ArrayList<Clothing> items) {
                ArrayList <Clothing> itemsPurchased= new ArrayList<>();
                for (Clothing  item:items) {
                        if ( item.getSize().equals(this.size)){
                                itemsPurchased.add(item);
                        }
                }
                return this.items=itemsPurchased;
        }

        public Double getTotalClothingCost(ArrayList<Clothing> itemsPurchased) {
                for (Clothing totalItem : items) {
                                //System.out.println(totalItem.getPrice());
                                if (this.total + totalItem.getPrice() < 35) {
                                        total += totalItem.getPrice();
                                }
                        }

                                return total;
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
        public void setSize(int measurement) {
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

        }

}
