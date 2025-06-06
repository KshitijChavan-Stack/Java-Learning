package Functional_prog;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class streamApi_miniProj {
    public static void main(String[] args) {

        Map<String,Integer> LTIemployees = new HashMap<>();
        LTIemployees.put("Kshitij",3);
        LTIemployees.put("Karan",4);
        LTIemployees.put("amol",2);
        LTIemployees.put("Amar",1);
        LTIemployees.put("Rohit",5);
        LTIemployees.put("Abhi",8);

        Map<String,Integer> LTI_MINDTREE_employees = LTIemployees.entrySet()
                .stream().peek(remove -> {
                   if (remove.getValue() <= 2){
                       System.out.println("Sorry to inform but, your Fired : "+remove.getKey()+ " bcoz your Experience is Low : "+remove.getValue());
                   }
                }).filter(emp -> emp.getValue() > 2).collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                ));


        System.out.println("--------------------------Welcome to the LTIMINDTREE ltd-------------------------");
        LTI_MINDTREE_employees.forEach((name,exp) -> {
            System.out.println("Welcome : "+name.toUpperCase()+" Good to see you Here !, Your a Valueable Asset with experience of : "+exp+" years");
        });

    }
}
