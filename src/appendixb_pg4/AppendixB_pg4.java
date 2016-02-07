
package appendixb_pg4;

import java.util.Scanner;

/**
 * @author Mark Bollinger
 */
public class AppendixB_pg4 {
        

    public static void main(String[] args) {
            Automobile markCar = new Automobile();
            Automobile henryCar = new Automobile();      
            markCar.Make = "nissan";
            markCar.Mileage = 150000;
            markCar.Model = "altima";
            markCar.Year = 2005;
            
            henryCar.Make = "ford";
            henryCar.Mileage = 15;
            henryCar.Model = "escape";
            henryCar.Year = 2010;
            
            markCar.increaseMileage(100);
            henryCar.increaseMileage(211);
            
            //System.out.println(markCar);
            //System.out.println(henryCar);
            System.out.println(markCar.setMileage(1000));
            System.out.println(henryCar.setMileage(1111));
      
        
    }
    public static class Automobile{
       public Automobile(){
           autoCount = autoCount + 1;
       }
          String type;
          String Make;
          String Model;
          int Year;
          int Mileage;
          static int autoCount = 0;
          
          public void increaseMileage(int mileage){
              Mileage = Mileage + mileage;
          }
          
         public String toString(){
            return Make + " " + Model + " " + Mileage;
        
        }
         
         public Automobile setMileage(int mileage){
             Mileage = mileage;
             return this;
         }
         
    }
}
