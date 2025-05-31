import MyPack.pack;
public class EX_Pack {
    public static void main(String[] args) {
        pack p1 = new pack() {
            @Override
            public void SayMeow() {
                System.out.println("Meowww....");
            }
        };
        p1.SayMeow();
    }
}
