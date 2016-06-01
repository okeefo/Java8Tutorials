package expressions;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;

/**
 * User: Keith Pyle
 * Date: 01/06/2016
 * Time: 14:38
 */
public class ElementUtilsTest {

   @Test
   public void betterEntry_String() {

      String strLong = "looooooong";
      String strShort = "short";

      String actual = ElementUtils.betterElement(strLong, strShort, (s1, s2) -> s1.length() > s2.length());

      Assert.assertEquals(actual, strLong);


   }

   @Test
   public void betterEntry_Car() {

      Car cheapCar = new Car("Robin Relient", 00.50);
      Car keefsCar = new Car("Porsche 911", 150.00);

      Car actualCar = ElementUtils.betterElement(cheapCar, keefsCar, (c1, c2) -> c1.getPrice() > c2.getPrice());
      Assert.assertEquals(actualCar, keefsCar);
   }

   @Test
   public void betterEntry_Employee() {

      Employee employeeHeathers = new Employee("Heathers", new BigDecimal("2000.00"));
      Employee employeeKeef = new Employee("keef", new BigDecimal("1500.00"));


      Object actualEmployee = ElementUtils.betterElement(employeeKeef, employeeHeathers, (e1, e2) -> e1.getSalary().compareTo(e2.getSalary()) > 0);
      Assert.assertEquals(actualEmployee, employeeHeathers);

   }
}
