package utils;

import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.util.Iterator;

public class NodeList<L> implements Iterable<L> {
    public Node<L> head;
    public Node<L>  temp;

    public Node<L> getHead() {
        return head;
    }

    public Node<L> getTemp() {
        return temp;
    }

    public Node<L> addNode(L node){
        this.temp = this.head = new Node<>(head, node);
        return head;
    }

    public void reset(){
        this.head = this.temp = null;
    }

    public Node<L> deleteNode(Node<L> nodeToDelete){
        if(temp != null && nodeToDelete.getContents().equals(head)){
            temp = head = head.getNext();
            return nodeToDelete;
        }
        while(temp!=null) {
            if (nodeToDelete.getContents().equals(temp.getNext().getContents())) {
                temp.setNext(temp.getNext().getNext());
                temp = head;
                return nodeToDelete;
            }
        }
        return null;
    }

    public L delete(L item){
        if(temp!=null && item.equals(head.getContents())){
            temp = head = head.getNext();
            return item;
        }
        while (temp!=null){
            if(item.equals(temp.getNext().getContents())) {
                temp.setNext(temp.getNext().getNext());
                temp = head;
                return item;
            }
        }
        return null;
    }

    public int count(){
        int i = 0;
        for(L x : this){i++;}
        return i;
    }

    @Override
    public Iterator<L> iterator() {
        return new NodeIterator<L>(head);
    }
}
