
package Collection.list.crud;


import java.util.ArrayList;

public class delete {
    public static void main(String[] args) {
        ArrayList<String> alist = new ArrayList<String>();
        alist.add("Steve");
        alist.add("Tim");
        alist.add("Lucy");
        alist.add("Pat");
        alist.add("Angela");
        alist.add("Tom");


        //object
        alist.remove("Angela");

        //index
        alist.remove(2);
    }
}
