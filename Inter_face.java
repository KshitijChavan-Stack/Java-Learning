public class Inter_face {

    interface bunchMethods{
        public void showName();
        public void takeName(String Name);
    }

    public static class hardCode implements bunchMethods{
        String name;
        @Override
        public void takeName(String Name) {
            name = Name;
        }

        @Override
        public void showName() {
            System.out.println("Hey myself.. "+name);
        }
    }

    public static void main(String[] args) {
        hardCode hC = new hardCode();
        hC.takeName("Kshitij");
        hC.showName();
    }
}
