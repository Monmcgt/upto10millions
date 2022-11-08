public class Java {
public static void main(String[] args) {
    int x = 0;
    while (x < 10000000) {
      x++;
      System.out.println(x);
      if (x == 10000000) {
        System.out.println("Up to 10 millions");
      }
    }
  }
}
