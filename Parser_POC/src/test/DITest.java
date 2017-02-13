package test;

import di.DataManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by vakamat on 2/10/2017.
 */
public class DITest {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"di/di-config.xml"});
        DataManager dataManager = (DataManager)context.getBean("dataManager");
        dataManager.test();
    }

}
