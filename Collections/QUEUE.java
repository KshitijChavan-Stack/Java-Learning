package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QUEUE {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Anni");
        queue.add("abraham");

        queue.poll();// to delete first added element
        queue.add("Anil");

        boolean found = false;
        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
        }
        for (String element : queue){
            if (element.startsWith("A")){
                System.out.println("elements found = "+element);
                found = true;
            }
        }
        if(!found){
            System.out.println("No such element exist...");
        }

//
//        System.out.println(queue.peek()); here we can also use .element()
//        System.out.println(queue.contains("abraham"));
        // to clear all elements from the queue we use .clear()



    }
}
