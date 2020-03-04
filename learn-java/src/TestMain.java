import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMain {

//    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<Integer>();
//        for (int i = 0; i < 10; i++) {
//            list.add(i);
//        }
//        add(list);
//        for (Integer j : list) {
//            System.err.print(j + ",");
//            ;
//        }
//        System.err.println("");
//        System.err.println("*********************");
//        String a = "A";
//        append(a);
//        System.err.println(a);
//        int num = 5;
//        addNum(num);
//        System.err.println(num);
//    }

    public static void main(String[] args) {
        System.out.println ( 2.0-1.1 );
        System.out.println ( 2.0/0 );
        //System.out.println ( 2/0 );

        //List<String> list = new ArrayList<String>();
        //list.add("string1");
        //list.add("string3");
        //list.add("string2");
        //
        //
        //List<String> list2 = new ArrayList<>();
        //list2.add("string1");
        //list2.add("string1");
        //list2.add("string1");
        //list2.add("string2");
        //list.addAll(list2);
        //
        //Map<String, Integer> hashMap = new HashMap<>();
        //for (String string : list) {
        //    if (hashMap.get(string) != null) {
        //        Integer value = hashMap.get(string);
        //        hashMap.put(string, value + 1);
        //        System.out.println("the element:" + string + " is repeat");
        //    } else {
        //        hashMap.put(string, 1);
        //    }
        //}
    }

    static void add(List<Integer> list) {
        list.add(100);
    }

    static void append(String str) {
        str += "is a";
    }

    static void addNum(int a) {
        a = a + 10;
    }
}
