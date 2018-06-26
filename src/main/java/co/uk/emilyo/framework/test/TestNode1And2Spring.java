package co.uk.emilyo.framework.test;

import co.uk.emilyo.framework.node.Node;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestNode1And2Spring {
    public static void main(String... args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        Node node1 = ctx.getBean("node1", Node.class);
        Object ciao = node1.start("ciao");
        System.out.println(ciao);
    }
}
