public class extendsTest {
    public static void main(String[] args) {
        B a = new B();

        System.out.println("第二次");
        B a2 = new B();
    }
}

class A {
    static {
        System.out.println("A-static");
    }

    {
        System.out.println("A非静态语句块");
    }

    public A() {
        System.out.println("A-构造");
    }
}

class B extends A {
    static {
        System.out.println("B-static");
    }

    {
        System.out.println("B非静态语句块");
    }

    public B() {
        System.out.println("B-构造");
    }
}
