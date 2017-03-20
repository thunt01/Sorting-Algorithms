import java.util.ArrayList;

public class InsertionSorter extends Sorter{

  public InsertionSorter(ArrayList<Integer> c){
    super(c);
  }
    public ArrayList<Integer> sorting(ArrayList<Integer> a){
      for (int k = 0;k < a.size();k++) {
        for (int i = 0;i < a.size();i++) {
          if (k > i){
            continue;
          }
          if (a.get(k) > a.get(i)){
            a.add(k, a.get(i));
            a.remove(i+1);
          }
        }
      }
      System.out.println(a);
      return a;
    }
}
