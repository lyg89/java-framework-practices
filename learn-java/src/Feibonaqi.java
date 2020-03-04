import java.util.stream.Stream;

/**
 * @description:
 * @author: liyaguang
 * @create: 2018-10-15 14:40
 **/
public class Feibonaqi {

    public static void main(String[] args) {
        Stream.iterate(new int[]{0, 1},
                t -> new int[]{t[1], t[0] + t[1]})
                .limit(49)
                .map(t -> t[0])
                .forEach(System.out::println);
    }
}
