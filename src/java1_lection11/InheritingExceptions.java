package java1_lection11;

class MyException extends Exception {}

public class InheritingExceptions {
  public void doSmth() throws MyException {
    System.out.println("Робимо щось ...");
    throw new MyException();
  }
  public static void main(String[] args) {
    InheritingExceptions ie = new InheritingExceptions();
    try {
      ie.doSmth();
    } catch(MyException e) {
      System.out.println("Щось сталось ... !");
    }
  }
}
