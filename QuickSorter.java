import java.util.ArrayList;

public class QuickSorter extends Sorter{

  public QuickSorter(ArrayList<Integer> c){
      super(c);
  }
  public ArrayList<Integer> sorting(ArrayList<Integer> a){
    ArrayList<Integer> sorted = new ArrayList<Integer>();
    if (a.size() <= 1) //base case
      return a;
    else {
      int piv = a.get(0);
      for (int i = 1; i < a.size();i++){
        //compares numbers to pivot and places them accordingly
        if (a.get(i) < piv)
          a.add(a.indexOf(piv), a.remove(i));
        else
          a.add(a.indexOf(piv)+1, a.remove(i));
        } // calls sorting on lower and higher subLists and adds them to sorted
        sorted.addAll(sorting(new ArrayList<Integer>(a.subList(0, a.indexOf(piv)))));
        sorted.add(piv);
        sorted.addAll(sorting(new ArrayList<Integer>(a.subList(a.indexOf(piv)+1, a.size()))));
        System.out.println(sorted);
        return sorted;
    }
  }
}