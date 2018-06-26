package co.uk.emilyo.framework.test;

import co.uk.emilyo.framework.node.Node;

public class TestNode2 extends Node {
    @Override
    public Object action(Object o) {
        String s = (String) o;
        Integer i = 1;
        Integer j = 0;
        if("ciao".equals(s)) return i;
        else return j;
    }
}
