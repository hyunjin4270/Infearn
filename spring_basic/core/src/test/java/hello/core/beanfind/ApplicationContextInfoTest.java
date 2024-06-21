package hello.core.beanfind;

import hello.core.AppConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextInfoTest {
   ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

   @Test
    @DisplayName("모든 빈 출력하기")
    void findAllBean() {
       String[] beanDefinitiionNames = ac.getBeanDefinitionNames();
       for (String beanDefinitiionName : beanDefinitiionNames) {
           Object bean = ac.getBean(beanDefinitiionName);
           System.out.println("name = " + beanDefinitiionName + " object = " + bean);

       }
   }
}
