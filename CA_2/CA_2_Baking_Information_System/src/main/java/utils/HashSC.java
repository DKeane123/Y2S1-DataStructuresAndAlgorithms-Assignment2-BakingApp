package utils;

import java.lang.reflect.Array;
import java.util.*;

public class HashSC<E> {
    private NodeList[] hashTable;

    public HashSC(Class<E> c, int size){
        hashTable= (NodeList[]) Array.newInstance(c, size);

        for(int i=0;i<hashTable.length;i++)
            hashTable[i]=  new NodeList<>();
    }

    public void displayHashTable() {
        System.out.println("Hash Table (using Separate Chaining)\n======================");
        for(int i=0;i<hashTable.length;i++) {
            System.out.println("\nChain "+i+"\n------------");
            for(Object node : hashTable[i])
                System.out.println(node);

        }
    }

    public int hashFunction(int key) {
        return key%hashTable.length;
    }

    public int add(E item, int key) {
        int home = hashFunction(key);
        hashTable[home].addNode(item);
        return home;
    }

    public int add(E item) {
        int home = hashFunction(Math.abs(item.hashCode()));
        hashTable[home].addNode(item);
        return home;
    }


   /* public static void main(String[] args) {
        HashSC<String> h=new HashSC<>(7);
        Scanner k=new Scanner(System.in);
        String data;

        do {
            System.out.print("Enter value: ");
            data=k.nextLine();
            if(data.length()>0) {
                int loc=h.add(data);
                if(loc!=-1) System.out.println("Item "+data+" stored at location "+loc);
                else System.out.println("Error. Cannot store "+data+". Table is full.");
            }
        }while(data.length()>0);

        h.displayHashTable();
    }*/
}