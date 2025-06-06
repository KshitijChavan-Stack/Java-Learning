package Functional_prog;

import java.util.function.Function;

public class Func_compostion {

    public static void main(String[] args) {

        Function<Integer,Integer> multiby2 =  x -> x * 2;// do this first and the second fun
        Function<Integer,Integer> add3 = y -> y + 3;

        Function<Integer,Integer> compound = multiby2.andThen(add3);

        System.out.println(compound.apply(22)); // it woks like (22 * 2) + 3;= 47


        // Real world use case

        Function<String,String> trim = s -> s.trim();
        Function<String,String> toUpper = s -> s.toUpperCase();
        Function<String,String> addprefix = s -> "Custumer : " + s;

        Function<String,String> pipeline = trim.andThen(toUpper).andThen(addprefix);

        System.out.println(pipeline.apply("   Kshitij     "));
    }

}
