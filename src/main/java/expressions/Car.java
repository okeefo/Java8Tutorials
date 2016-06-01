package expressions;

/**
 * User: Keith Pyle
 * Date: 01/06/2016
 * Time: 14:20
 */
public class Car {

   private String make;
   private double price;

   public Car(String make, double price) {
      this.make = make;
      this.price = price;
   }

   public String getMake() {
      return make;
   }

   public double getPrice() {
      return price;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) {
         return true;
      }
      if (!(o instanceof Car)) {
         return false;
      }

      Car car = (Car) o;

      return Double.compare(car.getPrice(), getPrice()) == 0 && (getMake() != null ? getMake().equals(car.getMake()) : car.getMake() == null);

   }

   @Override
   public int hashCode() {
      int result;
      long temp;
      result = getMake() != null ? getMake().hashCode() : 0;
      temp = Double.doubleToLongBits(getPrice());
      result = 31 * result + (int) (temp ^ (temp >>> 32));
      return result;
   }
}
