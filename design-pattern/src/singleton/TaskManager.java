package singleton;

public class TaskManager {

    /**
     * 定义实例变量
     */
    private static TaskManager tm = null;

    /**
     * 私有化构造函数
     */
    private TaskManager(){}

    /**
     * 获取单例类实例的静态方法
     * @return 静态类实例
     */
    public static TaskManager getInstance(){
        if (tm == null){
            tm = new TaskManager();
        }
        return tm;
    }
}
