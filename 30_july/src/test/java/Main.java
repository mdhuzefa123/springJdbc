import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.nareshit.dao.StudentDao;
import com.nareshit.model.Student;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		StudentDao dao = (StudentDao)ctx.getBean("dao");
		Student st = new Student(07, "mm", "kk");
		dao.saveStudent(st);
		System.out.println("Student record is successfully saved..");
	}
}
