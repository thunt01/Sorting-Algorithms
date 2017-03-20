import java.util.ArrayList;

public class SelectionSorter extends Sorter{

  public SelectionSorter(ArrayList<Integer> c){
    super(c);
  }
    public ArrayList<Integer> sorting(ArrayList<Integer> a){
      ArrayList<Integer> sorted = new ArrayList<Integer>();
      int temp = a.size();
      int dex;
      for (int j = 0; j < temp; j++){
        dex = 0;
        for (int i= 1; i < a.size(); i++){
          if (a.get(i) < a.get(dex)){
            dex = i;
          }
        }
        sorted.add(a.get(dex));
        a.remove(dex);
      }
      System.out.println(sorted);
      return sorted;
    }
}