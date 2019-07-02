public class Main {
    public static void main(String[] args) {
        String name = "Вячеслав";

        try {
            if(args[0].equals(name)) {
                System.out.println("Привет, Вячеслав");
            } else {
                System.out.println("Нет такого имени");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}