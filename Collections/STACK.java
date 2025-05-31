package Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Stream;

public class STACK {
    public static void main(String[] args) {
 //     REVERSE THE LIST USING STACK
        List<String> list = new LinkedList<>();

        list.add("honda");
        list.add("Porche");
        list.add("BMW");

        System.out.println(list);

        Stack<String> stack = new Stack<>();

        while (list.size() > 0){
            stack.push(list.remove(0));
        }

        while (stack.size() > 0){
            list.add(stack.pop());
        }

        System.out.println(list);


        // USE OF JAVA STREAM API

        stack.push("mercidies");
        stack.push( "chevrolet");

        Stream stream = stack.stream();

        stream.forEach((ele) -> {
            System.out.println(ele);
        });


    }
}
