package Functional_prog;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Func_interface {

    public static void main(String[] args) {
          //A functional interface is an interface that has exactly one abstract method.
           Function<Integer, Integer> square = x -> (int) Math.pow(x,2);
        System.out.println(square.apply(25));

        Predicate<Integer> checkEven = x -> x % 2 == 0;
        System.out.println(checkEven.test(22)); // This only returns boolean value

        List<String> Names = Arrays.asList("Kshitij", "Amol", "Raj","Karan");

        Predicate<String> StartwithK = s -> s.startsWith("K");
        for (String name : Names){
            if (StartwithK.test(name)){
                System.out.println(name);
            }
        }
    }
}
