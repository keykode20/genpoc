package co.uk.emilyo.framework.test;

import co.uk.emilyo.framework.node.Node;

public class TestNode1 extends Node {
    @Override
    public Object action(Object o) {
        String test = (String) o;
        System.out.println(test);
        return test;
    }
}
