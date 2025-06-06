package Functional_prog;

import java.util.function.Function;

public class High_orderfunc {

    static int modify(int x , Function<Integer,Integer> func){
        return  func.apply(x);
    }

    public static void main(String[] args) {
        Function<Integer,Integer> doubleNum = n -> n *2 ;
        int res = modify(5,doubleNum);
        System.out.println(res);

        System.out.println(modify(100, n-> n + 100));

    }
}
