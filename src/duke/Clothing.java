package duke;

public class Clothing {
    public String description;
    public Double price;
    public String size= "M";

    public static final Double MIN_PRICE = 10.00;
    public static final double TAX_RATE =.20;

    public Clothing(){};

    public Clothing(String description, Double price, String size) {
        this.description = description;
        this.price = price;
        this.size = size;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price*(1+TAX_RATE);
    }

    public void setPrice(Double price) {
        if (price < MIN_PRICE) {
            this.price= this.MIN_PRICE;
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
    @Override
    public String toString() {
        return "Clothing item= " + description +
                ", price=" + price +
                ", size=" + size ;
    }
}
