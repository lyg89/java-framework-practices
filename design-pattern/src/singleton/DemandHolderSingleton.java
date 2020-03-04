package singleton;

public class DemandHolderSingleton {

    private DemandHolderSingleton() {
    }

    static class HolderClass {
        private final static DemandHolderSingleton dh = new DemandHolderSingleton();
    }

    public static DemandHolderSingleton getInstance() {
        return HolderClass.dh;
    }

    public static void main(String[] args) {
        DemandHolderSingleton s1, s2;
        s1 = DemandHolderSingleton.getInstance();
        s2 = DemandHolderSingleton.getInstance();
        System.out.println(s1 == s2);
    }
}