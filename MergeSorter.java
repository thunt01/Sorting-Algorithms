import java.util.ArrayList;

public class MergeSorter extends Sorter{

  public MergeSorter(ArrayList<Integer> c){
    super(c);
  }
  public ArrayList<Integer> sorting(ArrayList<Integer> a){
    ArrayList<Integer> arr2 = new ArrayList<Integer>();
    ArrayList<Integer> sorted = new ArrayList<Integer>();
    arr2.addAll(a.subList(a.size()/2, a.size())); // divides a into two ArrayLists
    a = new ArrayList<Integer>(a.subList(0, a.size()/2));
    if (a.size() > 1 || arr2.size() > 1){
      arr2 = sorting(arr2);
      a = sorting(a);
    }
    while(!a.isEmpty() || !arr2.isEmpty()){ //base case
      //combines arraylists a and arr2 into sorted arraylist
      if (arr2.isEmpty()){
        sorted.addAll(a);
        a.clear();
        return sorted;
      } else if(a.isEmpty()){
        sorted.addAll(arr2);
        arr2.clear();
        return sorted;
      } else if (a.get(0) < arr2.get(0)){
        sorted.add(a.remove(0));
      }else {
        sorted.add(arr2.remove(0));
      }
    }
    System.out.println(sorted);
    return sorted;
  }
}