/**
 * @description:
 * @author: liyaguang
 * @create: 2019-02-12 14:28
 **/
public class StringConcat {
    public static void main(String[] args) {
        //String myStr1 = new String("abc");
        String myStr1 = new String("a") + new String("b") + new String("c");
        String myStr = "a" + "b" + "c";
        myStr1.intern();
        String myStr2 = "abc";
        String myStr3 = "abc";

        System.out.println(myStr == myStr1);
        System.out.println(myStr == myStr2);
        //System.out.println(myStr3 == myStr2);
        //System.out.println("My String:" + myStr);

        //String s1 = new String("12");
        //s1.intern();
        //String s4 = "12";
        //System.out.println(s1 == s4);

        //String s = new String("1");
        //s.intern();
        //String s2 = "1";
        //System.out.println(s == s2);
        //
        //String s3 = new String("1") + new String("1");
        //String s4 = "11";
        //System.out.println(s3 == s4);
    }
}
