package basics;

public class Second_Day {

    public static void main(String[] args) {

        Second_Day sd = new Second_Day();
        sd.addition(5, 14);
        sd.addition(545l,345l);
        sd.subtraction(5.06f, 14.65f);
        sd.multiplication(56767, 142763);
        sd.division(5, 14);
        sd.modulus(2, 4);


    }

    public void addition(int x, int y) {
        int sum = x + y;
        System.out.println("Sum of two number 5 + 14 is : " + sum);
    }
    //Method Over loading
    public void addition(long x, long y) {
        long sum = x + y;
        System.out.println("Sum of two number 5 + 14 is : " + sum);
    }

    public void subtraction(float x, float y) {
        float sub = x - y;
        System.out.println("Sub of two number 5 - 14 is : " + sub);
    }

    public void multiplication(double x, double y) {
        double multi = x * y;
        System.out.println("Multiplication of two number 5 * 14 is : " + multi);
    }

    public void division(int x, int y) {
        int div = x / y;
        System.out.println("Division of two number 5/14 is : " + div);
    }

    public void modulus(int x, int y) {
        int mod = x % y;
        System.out.println("Modulus of two number 5 % 14 is : " + mod);
    }
}
