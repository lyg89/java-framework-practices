import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

/**
 * @description: this program uses reflection to print all features of a class
 * @author: liyaguang
 * @create: 2019-03-23 23:10
 **/
public class ReflectionTest {

    public static void main(String[] args) {
        String name;
        if (args.length > 0) {
            name = args[0];
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter class name (e.g. java.util.Date)：");
            name = scanner.next();
        }

        try {
            Class<?> aClass = Class.forName(name);
            String modifiers = Modifier.toString(aClass.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print("class " + name);

            Class<?> superclass = aClass.getSuperclass();
            if (superclass != null && superclass != Object.class) {
                System.out.print(" extends " + superclass.getName());
            }

            System.out.print("\n{\n");
            printConstructors(aClass);
            System.out.println();
            printMethods(aClass);
            System.out.println();
            printFields(aClass);
            System.out.println("}");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }

    private static void printConstructors(Class clazz) {

        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.print("    ");
            int modifiers = constructor.getModifiers();
            String strModifier = Modifier.toString(modifiers);
            if (strModifier.length() > 0) {
                System.out.print(strModifier + " ");
            }
            System.out.print(clazz.getName() + " (");

            Class[] parameterTypes = constructor.getParameterTypes();
            for (int i = 0; i < parameterTypes.length; i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.print(parameterTypes[i].getName());
            }
            System.out.println(");");
        }
    }

    private static void printMethods(Class clazz) {
        for (Method method : clazz.getMethods()) {
            System.out.print("    ");
            int modifiers = method.getModifiers();
            String strModifier = Modifier.toString(modifiers);
            if (strModifier.length() > 0) {
                System.out.print(strModifier + " ");
            }

            Class<?> returnType = method.getReturnType();
            System.out.print(returnType.getName() + " " + method.getName() + " (");

            Class<?>[] parameterTypes = method.getParameterTypes();
            for (int i = 0; i < parameterTypes.length; i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.print(parameterTypes[i].getName());
            }
            System.out.println(");");
        }
    }

    private static void printFields(Class clazz) {
        for (Field field : clazz.getFields()) {
            System.out.print("    ");
            int modifiers = field.getModifiers();
            String strModifier = Modifier.toString(modifiers);
            if (strModifier.length() > 0) {
                System.out.print(strModifier + " ");
            }
            System.out.println(field.getType().getName() + " " + field.getName() + ";");
        }
    }
}
