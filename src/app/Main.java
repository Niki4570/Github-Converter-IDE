package app;

public class Main {
    public static void main(String[] args) {
        KgToLbs(7);
        LbsToKg(5);
    }
    static void KgToLbs(int kg){
        System.out.println(kg * 2.205);
    }
    static void LbsToKg(int lbs){
        System.out.println(lbs * 2.205);
    }
}