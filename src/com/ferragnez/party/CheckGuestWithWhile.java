package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuestWithWhile {

    public static void main(String[] args) {

        String[] partyGuests = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
                "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

        Scanner input = new Scanner(System.in);

        String userName;

        System.out.println("Inserisci il tuo nome: ");

        userName = input.nextLine();

        int i = 0;

        while (i < partyGuests.length) {

            if (userName.equals(partyGuests[i])) {

                System.out.println("Si sei invitato!");
                break;

            }

            else if (i == partyGuests.length - 1) {
                System.err.println("No non sei invitato broski.");
                break;
            }

            else {

                i++;

            }
        }
        ;

    }

}