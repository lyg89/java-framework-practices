public class StringTest {

    public static void main(String[] args){
        String testString1 = "GO Travel";
        String testString2 = new String("GO Travel");
        String testString3 = "GO" + " Travel";
        System.out.println(testString1 == testString2);
        System.out.println(testString1 == testString3);
        System.out.println(testString2 == testString3);

        System.out.println(testString1.equals(testString2));
        System.out.println(testString1.equals(testString3));
        System.out.println(testString2.equals(testString3));
    }
}
