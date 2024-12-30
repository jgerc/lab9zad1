public class Main {
    public static void main(String[] args) {
        NullPointerDemo demo = new NullPointerDemo();

        try {
            demo.generateNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("An exception occurred NullPointerException: " + e);

            e.printStackTrace();
        }
    }
}
