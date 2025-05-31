package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class MAP {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        String employer;
        String loc;
        Float CTC;
        String profile;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Detils accordingly : ");
        System.out.print("EMPLOYER : ");
        employer = sc.nextLine();
        System.out.println();
        System.out.print("Location: ");
        loc = sc.nextLine();
        System.out.println();
        System.out.print("CTC offered : ");
        CTC = sc.nextFloat();
        sc.nextLine();
        System.out.print("Profile : ");
        profile = sc.nextLine();

        map.put("EMPLOYER ", employer);
        map.put("LOCATION ", loc);
        map.put("CTC OFFERED ", String.valueOf(CTC));
        map.put("PROFILE ", profile);

        System.out.println("Here is Date you need about the Employer : ");

        for (Map.Entry<String,String> entry : map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
