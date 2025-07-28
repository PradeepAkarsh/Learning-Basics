package Day_10th_OOpsConcept;

public class Interface_Example_3 implements Interface_Example_1_Travell,Interface_Example_2_Destination {
    public void jk() {
        System.out.println("Travelling to JK");
    }

    public void cities(String city) {
        System.out.println("Cities : "+city);
    }

    public static void main(String[] args) {
        Interface_Example_3 in = new Interface_Example_3();
        in.jk();
        in.cities("Delhi");
    }
}
