package kata;


public class KataStack {
  int size = 0;
  String[] items = new String[10];

  public int size() {
    return size;
  }

  void push(String test) {
    if (size == 10) {
      throw new IllegalStateException("overflow");
    }
    
    items[size] = test;
    size += 1;
  }

  String pop() throws Exception {
    if(size == 0){
      throw new Exception("stack is empty!");
    }
    size--;
    
    return items[size];
  }
}
