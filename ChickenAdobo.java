public class ChickenAdobo {
    public static void main(String[] args) {
        int a = 20, b = 50;
        int result;

        result = a + b;
        System.out.println(result + (result % 2 == 0 ? " is Even" : " is Odd"));

        result = a - b;
        System.out.println(result + (result % 2 == 0 ? " is Even" : " is Odd"));

        result = a * b;
        System.out.println(result + (result % 2 == 0 ? " is Even" : " is Odd"));

        result = a / b;
        System.out.println(result + (result % 2 == 0 ? " is Even" : " is Odd"));

        System.out.println("Congrats!");
    }
}
