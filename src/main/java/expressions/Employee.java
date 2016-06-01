package expressions;

import java.math.BigDecimal;

/**
 * User: Keith Pyle
 * Date: 01/06/2016
 * Time: 14:21
 */
public class Employee {

   private String name;
   private BigDecimal Salary;

   public Employee(String name, BigDecimal salary) {
      this.name = name;
      Salary = salary;
   }

   public String getName() {
      return name;
   }

   public BigDecimal getSalary() {
      return Salary;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) {
         return true;
      }
      if (!(o instanceof Employee)) {
         return false;
      }

      Employee employee = (Employee) o;

      return getName() != null ? getName().equals(employee.getName()) : employee.getName() == null && (getSalary() != null ? getSalary().equals(employee.getSalary()) : employee.getSalary() == null);

   }

   @Override
   public int hashCode() {
      int result = getName() != null ? getName().hashCode() : 0;
      result = 31 * result + (getSalary() != null ? getSalary().hashCode() : 0);
      return result;
   }
}
