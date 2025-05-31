package exception_Checks;

public class sample_Except {
    public static void main(String[] args) {
        try {
            String name = null;
            System.out.println(name.length());
        }catch (Exception e){
            System.out.println("Can't determine length when its null");
        }

        try {
            int num = Integer.parseInt("Edurika");
            System.out.println(num);
        }catch (NumberFormatException e){
            System.out.println("Number format exception");
        }
        try {
            int[] numbers = new int[5];
            numbers[0] = 10;
            System.out.println(numbers[6]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of bound");
        }
    }
}
