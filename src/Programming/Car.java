package Programming;

import java.util.Objects;

public class Car {
     private String color;
     private  double weight;
     private double price;

     public Car(){
         this.color="Blue";
         this.weight=555;
         this.price= 12000;
     }
     public Car(String color,double weight,double price){
         this.color=color;
         this.weight=weight;
         this.price=price;

     }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString(){
         return "Color: " +this.color + " " + "Weight: " + this.weight + " " + "Price: " + this.price;
     }

    @Override
    public boolean equals(Object obj) {
         Car c = (Car)obj;
         if(!c.getColor().equals(this.getColor()))
             return false;
         if(c.getWeight()!=this.getWeight())
             return false;
         if(c.getPrice()!=this.getPrice())
             return false;
         return true;
    }


//    @Override123
//    public int hashCode() {
//        return Objects.hash(getColor(), getWeight(), getPrice());
//    }
}
