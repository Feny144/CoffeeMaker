package Training;

public class Passbyvalue {
    public static void main(String[] args){
        int a=1000;
        System.out.println(a);

       int b;
       b=a;
       System.out.println(b);
       b=2000;
        System.out.println(b);
        System.out.println(a);
    }


//    public static void main(String[] args){
//        int x=5;
//        changeValue(x);
//        System.out.println(x);
//    }
//    public static void changeValue(int num){
//        num=10;
//    }
}
