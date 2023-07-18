package Training;

public class Passbyreference {
    String name;
    float mileage;
    int cost;
}
class demo {
    public static void main(String[] args) {
        Passbyreference a = new Passbyreference();
        a.name = "BMW";
        a.mileage = 5.5f;
        a.cost = 75;
        System.out.println(a.name);
        System.out.println(a.mileage);
        System.out.println(a.cost);

        Passbyreference b;
        b = a;
        System.out.println(b.name);
        System.out.println(b.mileage);
        System.out.println(b.cost);

        b.name = "TATA";
        b.mileage = 15.8f;
        b.cost = 11;
        System.out.println(b.name);
        System.out.println(b.mileage);
        System.out.println(b.cost);

        System.out.println(a.name);
        System.out.println(a.mileage);
        System.out.println(a.cost);

    }
}
//    public static void main(String[] args){
//        StringBuilder str = new StringBuilder("Hello");
//        changeValue(str);
//        System.out.println(str);
//    }
//    public static void changeValue(StringBuilder s){
//        s.append("World");
//    }


