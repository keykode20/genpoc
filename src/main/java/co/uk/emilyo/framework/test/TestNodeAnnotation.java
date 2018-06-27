package co.uk.emilyo.framework.test;

import co.uk.emilyo.framework.annotation.PartOfChain;
import co.uk.emilyo.framework.node.Node;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Annotation;

public class TestNodeAnnotation {
    public static void main(String... args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        Node node3 = ctx.getBean("node3", Node.class);
        Node node4 = ctx.getBean("node4",Node.class);

        PartOfChain node3Annotation = node3.getClass().getAnnotation(PartOfChain.class);
        String node3AnnotationPrevNodeValue = node3Annotation.prevNode();
        System.out.println(node3AnnotationPrevNodeValue);

        PartOfChain node4Annotation = node4.getClass().getAnnotation(PartOfChain.class);
        String node4AnnotationPrevNodeValue = node4Annotation.prevNode();
        System.out.println(node4AnnotationPrevNodeValue);

    }
}
