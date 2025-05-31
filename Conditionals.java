public class Conditionals {
    //comaprison operators
    //logical operaors
    // contional statements
    // Loops

    public static void main(String[] args) {
        //COMPARISON OPERATORS

        int x = 1;
        int y = 1;
        System.out.println(x==y); // to check equality (==,<,>,=<,=>) boolen expression

        //LOGICAL OPERATOR
        int TEMP = 22;
        boolean is_Warm = TEMP>20 && TEMP<30; //(&&) is logical operator both should be true
        System.out.println(is_Warm);


        boolean has_HighIncome = true;
        boolean has_GoodCredit = false;
        boolean has_CrimnalRecord = false;
        boolean is_Eligible = (has_GoodCredit || has_HighIncome) && !has_CrimnalRecord ; // anyone of this need to true
                                                                    // ! operator makes false to true
        System.out.println(is_Eligible);

        //IF STATEMENTS

        int TEMPerature =  18;
        if (TEMPerature > 30){
            System.out.println("Its a hot day,Drink plenty of water");
        } else if (TEMPerature <= 30 && TEMPerature > 20) {
            System.out.println("Its a Nice Day..");
        }else {
            System.out.println("It's Cold");
        }

        //SIMPLYFING IF STATEMENT


        int income = 120_000;
        boolean hasHighIncome = (income>100_000);

        //TERNARAY OPERATOR

//        int income1 = 120_000;
//        String ClassName= "Economy";
//        if(income1>100_000)
//            ClassName = "First";

        int income1 = 120_000;
        String ClassName= income1 > 100_000 ? "First" : "Economy";

        System.out.println(ClassName);

        //SWITCH STATEMENTS


        String role = "Admin";
        if (role == "Admin")
            System.out.println("Your an Admin");
        else if(role == "moderator")
            System.out.println("your a moderator");
        else
            System.out.println("Your Guest");

        switch (role){
            case "Admin":
                System.out.println("your Admin");
                break;

            case "moderator":
                System.out.println("Your Moderator");
                break;

            default:
                System.out.println("your guest");
        }

        //        for (int i = 0; i < 5; i++)
//            System.out.println("Hello World " +i);
//
//
//        //WHILE LOOPS
//
//        int j = 0;
//        while (j <= 5) {
//            System.out.println("Heyyyy");
//        j++;
//
//        String input = "";
//        Scanner sc=new Scanner(System.in);
//        while (!input.equals("quit")){
//            System.out.println("Input: ");
//            input = sc.next().toLowerCase();
//            System.out.println(input);
//        }

        //DO WHILE LOOP

//        do {
//            System.out.println("Input: ");
//            input = sc.next().toLowerCase();
//            System.out.println(input);
//        }while (!input.equals("quit"));

        //FOR EACH

        String[] fruits = {"apple","banna","mango"};

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        for (String fruit : fruits)
            System.out.println(fruit);
    }


}
}
