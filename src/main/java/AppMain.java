import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.StudentService;

public class AppMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-mvc.xml");
        StudentService studentService = context.getBean("studentService", StudentService.class);
        System.out.println(studentService.getAll());
    }
}
