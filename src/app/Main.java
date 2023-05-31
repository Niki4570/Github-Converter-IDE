package app;

public class Main {
    public static void main(String[] args) {
        KgToLbs(8);
        LbsToKg(5);
    }
    static void KgToLbs(int kgs){
        System.out.println(kgs * 2.205);
    }
    static void LbsToKg(int lbs){
        System.out.println(lbs * 2.205);
    }
}