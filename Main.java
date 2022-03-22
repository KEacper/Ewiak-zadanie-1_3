import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Podaj dowolną liczbę");
    Scanner scan = new Scanner(System.in);
    int liczba = scan.nextInt();
    int wynik = liczba%10;
     System.out.println("Wynik dzielenia z resztą przez 10 to: "+wynik);
  }
}