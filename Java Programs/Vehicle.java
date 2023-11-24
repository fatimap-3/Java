package sem2cosc1047lab;

import java.util.Date;
abstract class Vehicle { 
	public static void main(String[] args) {
    Car car1 = new Car("Red", new Date(), "Honda Civic", 180);
    Car car2 = new Car("Blue", new Date(), "Toyota Corolla", 200);
    Car car3 = new Car("Red", new Date(), "Honda Accord", 150);
    car1.steer();
    System.out.println("Car 1 driving instructions " + car1.howToDrive());
    System.out.println("car 1 equals car 2 " + car1.equals(car2));
    System.out.println("car 1 equals car 3 " + car1.equals(car3));
    System.out.println("car 1 compared to car 2 " + car1.compareTo(car2));
    System.out.println("car 1 compared to car 3 " + car1.compareTo(car3));
    System.out.println("car 2 compared to car 3 " + car2.compareTo(car3));
}
 private String color;
 private Date dateMade;
 public Vehicle(String color, Date dateMade) {
     this.color = color;
     this.dateMade = dateMade;
 }
 public String getColor() {
     return color;
 }
 public void setColor(String color) {
     this.color = color;
 }
 public Date getDateMade() {
     return dateMade;
 }
 public void setDateMade(Date dateMade) {
     this.dateMade = dateMade;
 }
 abstract void steer();
}
interface Drivable {
 String howToDrive();
}
class Car extends Vehicle implements Drivable, Comparable<Car> {
 private String model;
 private int speed;
 public Car(String color, Date dateMade, String model, int speed) {
     super(color, dateMade);
     this.model = model;
     this.speed = speed;
 }
 public String getModel() {
     return model;
 }

 public void setModel(String model) {
     this.model = model;
 }

 public int getSpeed() {
     return speed;
 }

 public void setSpeed(int speed) {
     this.speed = speed;
 }
 @Override
 public boolean equals(Object obj) {
     if (this == obj)
         return true;
     if (obj == null || getClass() != obj.getClass())
         return false;
     Car otherCar = (Car) obj;
     return model.equals(otherCar.model);
 }
 @Override
 void steer() {
     System.out.println("Turn the steering wheel");
 }
 @Override
 public String howToDrive() {
     return "Step on the gas pedal.";
 }
 @Override
 public int compareTo(Car otherCar) {
     return Integer.compare(speed, otherCar.speed);
 }
}


