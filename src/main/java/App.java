import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld beanTwo =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        Cat cat = (Cat) applicationContext.getBean("cat");
        System.out.println(cat.getMessage());

        Cat catTwo = (Cat) applicationContext.getBean("cat");
        System.out.println(catTwo.getMessage());

        System.out.println("Сравненине бинов HelloWorld: " + (bean.equals(beanTwo)));//todo объекты сравниваются по .equals (javaCore)
        System.out.println("Сравненине бинов Cat: " + (cat == catTwo));
    }
}