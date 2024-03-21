public class TestString {
    public static void main(String[] args) {
        string("Привет", "пока");
    }

    public static void string(String s1, String s2) {
        if (s1.equals(s2)) {
            System.out.println("Строки идентичны");
        } else System.out.println("Строки неидентичны");
    }

}
