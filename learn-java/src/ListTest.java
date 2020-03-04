import java.util.*;

public class ListTest {

    public static void main(String[] args) {
        Integer[] arr = {25, 5, 10, 15, 20, 10, 15, 25};
        //List initList = Arrays.asList(arr);

        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(arr));
        //Set<Integer> set = new TreeSet<>(Arrays.asList(arr));
        System.out.println(set);

    }
}
