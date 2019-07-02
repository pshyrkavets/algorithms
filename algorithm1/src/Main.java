public class Main {
    public static void main(String[] args) {
        int number;

        try {
            number = Integer.parseInt(args[0]);

            if(number > 7) {
                System.out.println("Привет");
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}