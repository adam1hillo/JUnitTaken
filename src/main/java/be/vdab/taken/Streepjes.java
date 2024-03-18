package be.vdab.taken;

import java.util.Scanner;

public class Streepjes {
    public static void main(String[] args) {

        System.out.println("1 - woonplaatsen.txt 2 - database:");
        Scanner scanner = new Scanner(System.in);
        int keuze = scanner.nextInt();
        while (keuze != 1 && keuze != 2) {
            System.out.println("Verkeerde keuze, probeer opnieuw:");
            keuze = scanner.nextInt();
        }
        WoonplaatsRepository repository = keuze == 1 ? new TxtWoonplaatsRepository() : new JdbcWoonplaatsRepository();
        WoonplaatsService service = new WoonplaatsService(repository);
        try {
            System.out.println(service.maxAantalStreepjesInEenWoonplaats());
        } catch (RepositoryException ex) {
            System.err.println("Kan woonplaatsen niet lezen.");
            ex.printStackTrace(System.err);
        }
    }
}
