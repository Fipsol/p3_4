import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Podaj wysokość trójkąta: ");
    int wysokosc = scanner.nextInt();
    for (int i = wysokosc; i >= 1; i--) {
      for (int j = 1; j <= wysokosc - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <(2*i); j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}