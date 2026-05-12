package CollectionFramework;
import java.util.*;

public interface arrList {
public static void main(String[] args) {
  ArrayList<Integer> list = new ArrayList<Integer>();
    // add element 
    list.add(0);
    list.add(1);
    list.add(2);
    list.add(3);

    System.out.println("arraylist : " + list);
    list.remove(3);
    System.out.println("arraylist : " + list);
    list.set(2, 99);
    System.out.println("arraylist : " + list);
    for(int i=0;i<list.size();i++){
        System.out.print(list.get(i));
    }
    System.out.println();
    list.add(4);
    list.add(5);
}

}
