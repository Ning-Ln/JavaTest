import config.SpringConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import vo.Student;

public class myTest {

    @Test
    public void testStudent(){
        String config="applicationContext.xml";
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext(config);
        Student student= (Student) applicationContext.getBean("student");
        System.out.println(student);

    }

    @Test
    public void testStudentconfig(){

        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student= (Student) applicationContext.getBean("学生梁宁");
        System.out.println(student);

    }
}
