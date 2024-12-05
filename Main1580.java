public class Main1508{
  public static void main(String[] args) {
    int s = 50;
    double h = 165.8;
    String n = "NƒŸƒ¨ƒŸƒ«ƒ­";

    System.out.printf("name: %s, score: %d, height: %f \n", n, s, h);
    System.out.printf("name: %-10s, score: %10d, height: %5.2f \n", n, s, h);

    String str = String.format("name: %-10s, score: %-10d \n", n, s);
    System.out.println(str);

    double f = 12345.12345;
    System.out.printf("%f \n", f);
    System.out.printf("%,f \n", f);
    System.out.printf("%3.3f \n", f);
  }
}