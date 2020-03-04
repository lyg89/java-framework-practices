package singleton;

public class LazySingleton {

    /**
     * volatile ?
     */
    private volatile static LazySingleton instance = null;

    private LazySingleton() {
    }

    /**
     * Double-Check Locking--双重检查锁定
     * http://blog.csdn.net/kufeiyun/article/details/6166673
     * @return
     */
    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }

        }
        return instance;
    }
}
