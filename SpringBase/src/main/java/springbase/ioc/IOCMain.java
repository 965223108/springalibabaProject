package springbase.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springbase.ioc.beans.WorkDao;

public class IOCMain {

    public static void main(String[] args)
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringApplication.xml");
        WorkDao workDao = applicationContext.getBean("workdao",WorkDao.class);
        System.out.println(workDao);
        System.out.println(applicationContext);
    }
}
