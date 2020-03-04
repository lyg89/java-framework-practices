import java.time.LocalDate;

/**
 * @description:
 * @author: liyaguang
 * @create: 2019-07-28 11:03
 **/
public class MathTest {

    public static void main(String[] args) {

        //LocalDate localDate1 = LocalDate.of(2019, 7, 28);
        //System.out.println(localDate1.getDayOfWeek().getValue());
        //System.out.println(Math.round(9.997));

        MathTest mathTest = new MathTest("ooo");
        System.out.println(mathTest.id);
        System.out.println(mathTest.name);
        System.out.println(mathTest.isStudent);
    }


    private int id;
    private String name;
    private boolean isStudent;

    public MathTest(String other){
        System.out.println(other);
    }
}
