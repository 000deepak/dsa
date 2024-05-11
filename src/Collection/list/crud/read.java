package Collection.list.crud;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class read {

    public static void main(String[] args) {

        //looping
        ArrayList<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(25);
        l.add(58);
        l.add(30);

        System.out.println(l);

        //1
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }

        //2
        for (int x : l) {
            System.out.println(x);
        }

        //3
        l.forEach(x -> System.out.println(x));

        //3
        l.forEach(System.out::println);
        //System is class,out is object and println is method

        //4
        Iterator<Integer> itr = l.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        //5-bidiresection only for list
        ListIterator<Integer> lItr = l.listIterator();
        while (lItr.hasNext()) {
            System.out.println(lItr.next() + " " + lItr.hasPrevious());
        }

        //6
        for (ListIterator<Integer> fItr = l.listIterator(); fItr.hasNext(); ) {
            System.out.println(fItr.next());
        }

    }
}


