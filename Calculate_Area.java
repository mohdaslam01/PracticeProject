
package calculate_area;
import java.lang.*;
import java.util.*;

public class Calculate_Area {

    public static void main(String[] args) {
        while(true){
            System.out.println("Enter (1) if you have base and height else enter (2) if you have a, b, c sides values");
            Scanner sc = new Scanner(System.in);
            int _switch = sc.nextInt();
            switch(_switch){
                case(1) -> {
                    float area, ht, base;
                    ht=sc.nextFloat();
                    base=sc.nextFloat();
                    area =(float)1/2*(ht*base);
                    System.out.println("Area of triangle is \t " +area);
                    
                }
                case(2) -> {
                    float a, b, c, S, area; 
                    a=sc.nextFloat();
                    b=sc.nextFloat();
                    c=sc.nextFloat();
                    S=(a+b+c)/2;
                    area = S*(S-a)*(S-b)*(S-c);
                    area = (float)Math.sqrt(area);
                    System.out.println("Area of triangle is \t" +area);                    
                    }
                default ->{
                    System.exit(_switch);
                }
            }            
        }
    }
    
}
