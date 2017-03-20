import java.util.ArrayList;

public abstract class Sorter{
  private final ArrayList<Integer> arr;

  public Sorter(ArrayList<Integer> arr) {
  this.arr = arr;
  }
  public abstract ArrayList<Integer> sorting(ArrayList<Integer> a);

  public ArrayList<Integer> sort(){
    ArrayList<Integer> sor = new ArrayList<Integer>(arr);
    return sorting(sor);
  }

  public long time(int iterations){
    long start = System.nanoTime();
    for (int i = 0; i < iterations; i++){
      this.sort();
      //System.out.println(this.sort());
    }
    long end = System.nanoTime();
    return end - start;
  }
  public static void main(String[] args) {
    ArrayList<Integer> arrlist = new ArrayList<Integer>();
    arrlist.add(5);
    arrlist.add(1);
    arrlist.add(4);
    arrlist.add(7);
    arrlist.add(2);
    arrlist.add(5);
    arrlist.add(2);
    SelectionSorter selectTest = new SelectionSorter(arrlist);
    InsertionSorter insertTest = new InsertionSorter(arrlist);
    MergeSorter mergeTest = new MergeSorter(arrlist);
    QuickSorter quickTest = new QuickSorter(arrlist);
    System.out.println("selectTest " + selectTest.time(5));
    System.out.println("insertTest " + insertTest.time(5));
    System.out.println("mergeTest " + mergeTest.time(5));
    System.out.println("quickTest " + quickTest.time(5));


  }
}