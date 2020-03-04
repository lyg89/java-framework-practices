package singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LoadBalancer {

    private static LoadBalancer loadBalancer = null;

    private List<String> serverList = null;

    private LoadBalancer() {
        serverList = new ArrayList();
    }

    public static LoadBalancer getInstence() {
        if (loadBalancer == null) {
            loadBalancer = new LoadBalancer();
        }
        return loadBalancer;
    }

    public void addServer(String server) {
        this.serverList.add(server);
    }

    public String getServer() {
        Random random = new Random();
        int i = random.nextInt(serverList.size());
        return serverList.get(i);
    }
}


class Client {
    public static void main(String args[]) {
        LoadBalancer loadBalancer1 = LoadBalancer.getInstence();
        LoadBalancer loadBalancer2 = LoadBalancer.getInstence();
        LoadBalancer loadBalancer3 = LoadBalancer.getInstence();
        LoadBalancer loadBalancer4 = LoadBalancer.getInstence();

        if (loadBalancer1 == loadBalancer2 && loadBalancer2 == loadBalancer3 && loadBalancer3 == loadBalancer4) {
            System.out.println("服务器负载均衡器具有唯一性！");
        }

        loadBalancer1.addServer("Server 1");
        loadBalancer1.addServer("Server 2");
        loadBalancer1.addServer("Server 3");
        loadBalancer1.addServer("Server 4");

        for (int i=0; i < 10; i++){
            String server = loadBalancer1.getServer();
            System.out.println("分发请求至服务器：" + server);
        }
    }
}
