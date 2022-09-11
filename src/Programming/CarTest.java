package Programming;

import java.util.Arrays;

public class CarTest {
    public static void main(String[] args) {
        Car car=new Car();
        Car car1 =new Car("Blue",12000.0,25000.0);
        Car car2 =new Car("Red",19000.0,21000.0);
        Car car3 =new Car("Red",17000.0,29000.0);
        Car car4 =new Car("Blue",12000.0,25000.0);
        Car[] vehicles= new Car[4];
        vehicles[0]=car1;
        vehicles[1]= car2;
        vehicles[2]=car3;
        vehicles[3]=car4;
        System.out.println(Arrays.toString(vehicles));
        double sum=0;
            for (int i = 0; i < vehicles.length; i++) {
                if(vehicles[i].getColor().equals("Red")){
                     sum += vehicles[i].getPrice();
                }
            }
        System.out.println(sum);
        System.out.println( car1.equals(car4));


        }



    }

