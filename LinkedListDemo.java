import java.io.*;
import java.util.LinkedList;
import java.util.List;
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Character> ll=new LinkedList<Character>();
        ll.add('A');
        ll.add('B');
        ll.add('C');
        System.out.println("Original content"+ll);
        ll.addLast('D');
        ll.addFirst('E');
        System.out.println("After calling addFirst() and addLast()");
        System.out.println("Content"+ll);       
        ll.add(2,'F');
        ll.add(2,'G');
        System.out.println("After insertion");
        System.out.println("Content"+ll) ;
        System.out.println("Here are first and last elements"+ll.getFirst()+" "+ll.getLast());
        List <Character>sub = ll.subList(2,5);
        System.out.println("Content of sublist view:"+sub);
        LinkedList<Character> ll2=new LinkedList<Character>(sub);
        ll.removeAll(ll2);
        System.out.println("\nAfter removing ll2 from ll1");
        System.out.println("Content"+ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println("\nAfter deleting fist and last elements");
        System.out.println("Content"+ll);
        ll.set(0,Character.toLowerCase(ll.get(0)));

        System.out.println("\nAfter change"+ll);

    }
}
