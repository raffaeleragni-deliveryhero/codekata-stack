package kata;


public class KataStack {
  int size = 0;

  public int size() {
    return size;
  }

  void push(String test) {
    size += 1;
  }

  void pop() throws Exception {
    if(size == 0){
      throw new Exception("stack is empty!");
    }
    size = 0;
  }
}
