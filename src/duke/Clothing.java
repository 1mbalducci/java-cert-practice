package duke;

public class Clothing {
    public String description;
    public Double price;
    public String size= "M";

    public final Double minPrice = 10.00;
    public final double taxRate =.20;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price*(1+taxRate);
    }

    public void setPrice(Double price) {
        if (price < minPrice) {
            this.price= this.minPrice;
        } else {
            this.price = price;
        }
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
