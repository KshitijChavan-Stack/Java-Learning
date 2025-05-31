package exception_Checks;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class user_DefinedExceptions {
//    public static void main(String[] args) {
//        try {
//            throw new MyException(5);
//        }catch (Exception e){
//            System.out.println(e);
//        }
//    }
//}
//class MyException extends Exception{
//    int a;
//    MyException(int b){
//        this.a=b;
//    }
//    public String toString(){
//        return("Exception number = "+a);
//    }

//    static void validateInput(int num) throws InvalidInputException{
//        if (num >= 100){
//            throw  new InvalidInputException("Exception");
//        }
//        System.out.println("Valid Input");
//    }
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter Your NUM = ");
//    int n = sc.nextInt();
//    try {
//        validateInput(n);
//    }catch (InvalidInputException e){
//        System.out.println("Caught Exception -- Input is Greater than 100");
//    }
//}
//}
//class InvalidInputException extends Exception{
//    InvalidInputException(String Ex_msg){
//        super(Ex_msg);
//    }

    static void convertDateFormat(String inputDate){
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
            Date date = sdf.parse(inputDate);
            SimpleDateFormat outputsdf = new SimpleDateFormat("yyyy-MM-dd");
            String outputDate = outputsdf.format(date);
            System.out.println("After changing date format to yyyy-MM-dd : "+outputDate);
        }catch (java.text.ParseException e){
            System.out.println("Some Error");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Date in dd/mm/yyyy format : ");
        String dt = sc.nextLine();

        convertDateFormat(dt);
    }
}
