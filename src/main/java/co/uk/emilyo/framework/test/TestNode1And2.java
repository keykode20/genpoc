package co.uk.emilyo.framework.test;

import co.uk.emilyo.framework.node.Node;

public class TestNode1And2 {
    public static void main(String... args){
        Node node1 = new TestNode1();
        Node node2 = new TestNode2();
        node1.setNextNode(node2);
        Object ciao = node1.start("ciao");
        System.out.println(ciao);
    }
}
