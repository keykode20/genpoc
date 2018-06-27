package co.uk.emilyo.framework.test;

import co.uk.emilyo.framework.annotation.PartOfChain;
import co.uk.emilyo.framework.node.Node;

@PartOfChain(prevNode = "node1", id = "node2")
public class TestNode2Annotated  extends Node {
    @Override
    public Object action(Object o) {
        if(o == null){
            System.out.println("obj was null");
        }else{
            System.out.println("obj was populater");
        }
        return null;
    }
}
