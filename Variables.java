import java.awt.*;
import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Variables {
    // Integer 4 bites
    public static void main(String[] args) {
        int herAge = 20;
        int myAge = herAge;

        System.out.println(myAge);
        //PRIMTIVE TYPES
        //INTEGERS

        long viewsCount = 3_123_456_789L; // too large use suffix L and use long
        float price = 10.29f; // use f as suffix
        char letter = 'A'; // single character
        boolean isEligible = false;

       //REFERNCE TYPES

        Date now = new Date(); // need to allocate memory

        System.out.println(now); // gives current date and time on my machine

       //primitive type v/s reference type

        //primitive
        byte x =1;
        byte y = x;
        x= 2;
        System.out.println(y);// y is not affected bcox both have diffenet memory loc

        //refernce
        Point p1 = new Point(1,1); // addr is stored in p1 of value
        Point p2 = p1; // here the addr is given to p2 not actull value so p1 and p2 are point to same
        p1.x =  2; // can be change from any one pointer

        System.out.println(p2); // change reflected

        //String are ref types

        String msg = new String("hello world");
        String msg1= "hello world";
        // can use any one
        System.out.println(msg1);

        // concatination
        String mssg = "hello" + "!!";
        System.out.println(mssg.endsWith("!!"));// return boolon value
        System.out.println(mssg.startsWith("!!")); // return false
        System.out.println(mssg.length());
        System.out.println(mssg.indexOf("h")); //return 0
        System.out.println(mssg.replace("!","#")); //target and replace are parameters
        // ! and # are argument
        System.out.println(mssg);// orginal sting dont change and string are immutable

        //escape sequences

        String name = "hello \"mosh\"";
        System.out.println(name);

        // save directory
        String ms1 = "c:\\windows\\...";// only one back slash
        // \n and \t new line and tab

        // Arrays

        int[] nums = new int[5];
        nums[0] = 1;
        nums[1] = 1;
        nums[2] = 1;
        System.out.println(Arrays.toString(nums));// give address

        // another way to initalize array
        //if we already knew the elements

        int[] nums1 = {2,3,90,21,6};
        System.out.println(Arrays.toString(nums1));

        // to sort
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));

        //Multidimentional array
        //two dimention
        int[][] nums2 = new int[2][3];
        nums2[0][0] = 1;
        System.out.println("to print multi dimentionsl array:"+ Arrays.deepToString(nums2));

        // anothr way to initalize

        int[][] num2 = { {1,2,3},{4,5,6} };
        System.out.println(Arrays.deepToString(num2));

        //constant

        final float PI = 3.14f;
        //pi=1; // cannot change to final variable


        //Arithmatic expressions

        //(+,-,*,/.%)

        int res = 10 +3;
        System.out.println(res);

        int ress = 10/3;
        System.out.println(ress);// divide in java of whole numbers is a whole num

        double re = (double)10/(double)3;
        System.out.println(re);// this will give decimal output

        int m = 1;
        int n = m++;

        System.out.println(m);// here m will print 2 as it get increment
        System.out.println(n);// here it will print 1 as it assign 1 and then incrmented

        int a = 1;
        int b = ++a;

        System.out.println(a); //here it will increment and print
        System.out.println(b); // but here the incremental value will be assign and print

        System.out.println();
        //order of operation

        //BODMAS rule

        int q = 10 + 3 * 2;
        System.out.println(q); // result q = 16

        //Casting

        //implicit casting
        // byte >> short >> int >> long >> float >> double
        short c = 1;
        int d =  c + 1;
        System.out.println(d);

        double e = 1.1;
        double f = e + 2;
        System.out.println(f);//3.1


        //EXPLICIT CASTING
        double r = 1.1;
        int s = (int)r + 2;
        System.out.println(s);// without decimal res = 3


        //WRAPER CLASSES
        String j = "222";
        int k = Integer.parseInt(j) + 2;
        System.out.println(k);

        String u = "1.1";
        double p = Double.parseDouble(u);
        System.out.println(p);


        //MATH CLASS

        int res11 = Math.round(1.1f);
        System.out.println(res11);

        int res22 = (int)Math.ceil(1.1);
        System.out.println(res22); // result 2 as the higher side

        int res33 = (int)Math.floor(1.1);
        System.out.println(res33); // result 1 as the lowest side

        long w = Math.round(Math.random()*100);
        System.out.println(w); // random num between 100 to 1 ...

        //formatting numbers

        // $123456
        NumberFormat currency= NumberFormat.getCurrencyInstance();

        String result= currency.format(123456.7891);
        System.out.println(result);

        String result1 = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result1);

        //READING INPUT

        Scanner sc = new Scanner(System.in);

        System.out.print("enter your name :");
        String name1 = sc.nextLine().trim(); // trim to use delete spaces
        System.out.println("your name is ="+ name1);

    }


}


