public class caculatorTest {

    public static int countPrimes(int n) {
        int count = 0;
        if(n>1){
            count ++;
            System.out.println(2);
        }
        for (int i=3; i<n; i=i+2){

            boolean flag = true;
            for(int j=1; j<i; j=j+2){
                if(i % j == 0 ){
                    flag=false;
                }
            }
            if (flag){
                System.out.println(i);
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int i = countPrimes(10);
        System.out.println("执行完成");
        System.out.println(i);
    }
}
