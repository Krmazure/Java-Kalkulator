import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj w kalkulatorze!");

        while (true) {
            System.out.print("Podaj pierwszą liczbę: ");
            double liczba1 = scanner.nextDouble();

            System.out.print("Podaj drugą liczbę: ");
            double liczba2 = scanner.nextDouble();

            System.out.println("Wybierz operację:");
            System.out.println("1. Dodawanie");
            System.out.println("2. Odejmowanie");
            System.out.println("3. Mnożenie");
            System.out.println("4. Dzielenie");
            System.out.println("5. Wyjście");

            System.out.print("Wybierz opcję: ");
            int opcja = scanner.nextInt();

            double wynik = 0;

            switch (opcja) {
                case 1:
                    wynik = liczba1 + liczba2;
                    break;
                case 2:
                    wynik = liczba1 - liczba2;
                    break;
                case 3:
                    wynik = liczba1 * liczba2;
                    break;
                case 4:
                    if (liczba2 != 0) {
                        wynik = liczba1 / liczba2;
                    } else {
                        System.out.println("Błąd: Nie można dzielić przez zero!");
                        continue;
                    }
                    break;
                case 5:
                    System.out.println("Dziękujemy za korzystanie z kalkulatora!");
                    System.exit(0);
                default:
                    System.out.println("Błąd: Nieprawidłowa opcja!");
                    continue;
            }

            System.out.println("Wynik: " + wynik);
        }
    }
}
