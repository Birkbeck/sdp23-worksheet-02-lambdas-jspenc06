import java.util.Arrays;
import java.util.Comparator;

public class Outline {
  public static void main(String... args) { // varargs alternative to String[]
    Integer[] intArray = {1,7,3,4,8,2};
    System.out.println(Arrays.asList(intArray));
    // Arrays.sort(intArray,.......)
    String[] cars = {"wowwww","Volvo", "BMW", "Ford", "Mazda","testtttttt"};
    Arrays.sort(cars,(s1,s2)->s1.length()-s2.length());
    System.out.println(Arrays.toString(cars));
    Arrays.sort(cars, Comparator.comparingInt(String::length));
    System.out.println(Arrays.toString(cars));

    Arrays.sort(cars,(s1,s2)->s1.length()-s2.length());
    System.out.println(Arrays.toString(cars));
    Arrays.sort(cars, Comparator.comparingInt(String::length).reversed());
    System.out.println(Arrays.toString(cars));

  } 
}
