package duke;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Customer {
        private String name;
        private String size;
        private Clothing [] items;

        public Clothing[] addItems(Clothing [] items){
                return this.items = items;
        }

        public Double getTotalClothingCost(Clothing [] items) {
                double total = 0.0;
                for (Clothing item : items) {

                        if (item.getSize().equals(this.size)) {

                                System.out.println(item.getPrice());
                                //item.price = item.price * (1 + tax);
                                //System.out.println(item.price);
                                if (total + item.getPrice() < 35) {
                                        total += item.getPrice();
                                }
                        }
                }
                System.out.println(total);
                return total;

        }


        public Clothing[] getItems() {
                return items;
        }

        public void setItems(Clothing[] items) {
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
