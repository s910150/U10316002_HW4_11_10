import java.util.ArrayList;

public class MyStack extends ArrayList{
	
  //new ArrayList
  private ArrayList<String> list = new ArrayList<String>();

  //test if list is empty
  public boolean isEmpty() {
    return list.isEmpty();
  }

  //get list's size
  public int getSize() {
    return list.size();
  }

  public String peek() {
    return list.get(getSize() - 1);
  }

  //first in last out
  public String pop() {
    String o = list.get(getSize() - 1);
    list.remove(getSize() - 1);
    return o;
  }

  //add elements in array
  public void push(String o) {
    list.add(o);
  }

  @Override /** Override the toString in the Object class */
  public String toString() {
    return "stack: " + list.toString();
  }
}
