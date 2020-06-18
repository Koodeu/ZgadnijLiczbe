package kl.sda;

import java.util.Random;
import java.util.Scanner;

public class Gra {

    public static void main(String[] args) {

    int i = 0;
    int los;
    int odp;

    Random random = new Random();
        los = random.nextInt(10) + 1;

        System.out.println("Zgadnij jaką liczbę mam na myśli\n");

        Scanner scanner = new Scanner(System.in);

        do {
            i++;
            System.out.println("Podaj mi liczbę od 1 do 10");
            odp = scanner.nextInt();

            if ( odp > los) {
                System.out.println("Liczba, którą mam na myśli jest mniejsza");
            }
            else if (odp < los) {
                System.out.println("Liczba, którą mam na myśli jest większa");
            }


        }while (odp != los);

        System.out.println("zgadłeś za " + i + " razem");






}
}


