package co.uk.emilyo.framework.test;

import co.uk.emilyo.framework.annotation.PartOfChain;
import co.uk.emilyo.framework.node.Node;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@PartOfChain(id = "node1")
public class TestNode1Annotated extends Node {
    @Override
    public Object action(Object o) {
        System.out.println("node1 triggered");
        return null;
    }
}
