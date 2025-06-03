import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Use_regex {
    public static void main(String[] args) {

//        String findIN = "Hey it's my First Regex code";
//        Pattern pattern = Pattern.compile("Regex");
//        Matcher matcher = pattern.matcher(findIN);
//
//
//        if (matcher.find()){
//            String res = matcher.group();
//            System.out.println("Found Success : "+res);
//        }else
//            System.out.println("No Match found");

        String findIn = "chavankshitij124@gmail.com";

        Pattern pattern = Pattern.compile("^[a-zA-Z0-9.%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{3,6}$");
        // ^ indicates start of String and $ indicates end
        //[] this brackets are imp
        // and most imp + it means match 1 or more chars in string
        // {3,6} the .com .online or any other that specifises here !
        Matcher matcher = pattern.matcher(findIn);

        if (matcher.find()){
            String correctMail = matcher.group();
            System.out.println("No problem Sir its a Valid : "+correctMail);
        }else
            System.out.println("Sorry But its not Right !");

    }
}
