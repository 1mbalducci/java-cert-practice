package duke;

import java.util.ArrayList;
import java.util.List;

public class Customer {
        String name;
        String size;
        ArrayList<String> choices;


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
                                this.size = "S";
                                break;
                        case 7, 8, 9:
                                this.size = "L";
                                break;
                        default:
                                this.size = "M";
                }

        }
        public ArrayList<String> getChoices() {
                return choices;
        }

        public void setChoices(ArrayList<String> choices) {
                this.choices = choices;
        }
}
