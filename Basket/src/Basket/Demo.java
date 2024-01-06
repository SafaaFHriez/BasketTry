
package Basket;


public class Demo {
    public static void main(String[] args) {
      Basket <String, Double> b = new Basket<>();
      b.add(3.0);
      b.add(5.6);
      b.add(3.0);
      b.add(7.0);
      System.out.println(b);
      System.out.println("safaa updated");
    }
}
