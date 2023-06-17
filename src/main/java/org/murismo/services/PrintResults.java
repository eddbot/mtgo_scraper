package org.murismo.services;

import org.murismo.models.Results;

public class PrintResults {
    public static void call(Results results){

        for (var player : results.players) {

            System.out.println("\n__Main__\n");
            for (var card : player.getMainDeck().cardList()) {
                System.out.println(card.getName() + " | " + card.getQuantity());
            }
            System.out.println("\n__Sideboard__\n");
            for (var card : player.getSideboard().cardList()) {
                System.out.println(card.getName() + " | " + card.getQuantity());
            }
            System.out.println("---------");
        }
    }
}
