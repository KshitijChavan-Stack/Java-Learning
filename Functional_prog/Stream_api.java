package Functional_prog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_api {

    public static void main(String[] args) {

        List<String> Members = Arrays.asList("Kshitij", "Amol", "Komal","Shruti");

        List<String> newMembers = new ArrayList<>();

        System.out.println("orignal List : "+Members);
        newMembers = Members.stream()
                .filter(user -> !user.startsWith("K"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("This the List of New Members whos Names dont Start with K : "+ newMembers);

    }

}
