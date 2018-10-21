public class Car {

     private static int idAll;

     private int id;
     private String carBrand;
     private String model;
     private int year;
     private String colour;
     private int price;
     private int registrationNumber;

     public Car() {

     }

     public Car(String carBrand, String model, int year, String colour, int price, int registrationNumber) {
          this.carBrand = carBrand;
          this.model = model;
          this.year = year;
          this.colour = colour;
          this.price = price;
          this.registrationNumber = registrationNumber;
          this.id = ++idAll;
     }

     public String getCarBrand() {
          return carBrand;
     }

     public String getModel() {
          return model;
     }

     public int getYear() {
          return year;
     }

     public int getPrice() {
          return price;
     }

     public int getId() {
          return id;
     }

     @Override
     public String toString() {
          return new String("\nid: " + getId() + "|" + getCarBrand()
                  + "-" + getModel()
                  + " year:" + getYear()
                  + " price:" + getPrice());
     }
}
