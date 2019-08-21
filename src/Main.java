
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Main {
     final StringBuilder builder=new StringBuilder("123");
     String name="123";
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
      Main main=new Main();
      System.out.println(main.builder);
      System.out.println(main.name);
      Class  cl=main.getClass();
      Field field=cl.getDeclaredField("builder");
      Field nameField=cl.getDeclaredField("name");
      nameField.setAccessible(true);
      field.setAccessible(true);
      field.set(main,new StringBuilder("111"));
      nameField.set(main,"111");
      System.out.println(main.builder);
        System.out.println(main.name);
    }
}
