package pack;

public class Main {
    public static void main(String[] args) {
        Animal ani = new Animal("Kot", 3, true );
        Animal ani1 = new Animal("Dog ",3, true);
        Animal an12 = ani;
        System.out.println(ani.toString());
        System.out.println(ani1.toString());
        System.out.println(ani.equals(ani1));
        System.out.println(ani.hashCode());

    }
}
