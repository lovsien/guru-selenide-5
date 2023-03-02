public class Main {

    public static void main(String[] args) {
        arithmetic();
        logic();
        overflow();
    }

    public static void arithmetic() {
        int a = 40;
        double b = 15;
        int c;
        double d;

        System.out.println("Arithmetic operations:");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println("a++ = " + (a++));
        System.out.println("--b = " + (--b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("");

        System.out.println("a = " + a + ", b = " + b);
        c = (int) (a / b);
        System.out.println("(int) a / b = " + c);

        d = a / b;
        System.out.println("(double) a / b = " + d);
        System.out.println("");
    }

    public static void logic() {
        boolean a = true;
        boolean b = false;

        System.out.println("Logic operations:");

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a && b = " + (a && b));
        System.out.println("a || b = " + (a || b));
        System.out.println("!(a && b) = " + !(a && b));
        System.out.println("!a || b = " + !(a || b));
        System.out.println("");
    }

    public static void overflow() {
        byte byteValue = 127;
        short shortValue = 32767;
        int intValue = 2_147_483_647;
        long longValue = 9_223_372_036_854_775_807L;
        System.out.println("Переполнения");
        System.out.println("Переполнение byte: " + (++byteValue));
        System.out.println("Переполнение short: " + (++shortValue));
        System.out.println("Переполнение int: " + (++intValue));
        System.out.println("Переполнение long: " + (++longValue));
        System.out.println("");
    }
}
