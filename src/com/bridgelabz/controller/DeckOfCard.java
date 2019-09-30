package com.bridgelabz.controller;

import java.util.Random;

import com.bridgelazs.utility.OopsUtility;
import com.bridgelazs.utility.Utility;

public class DeckOfCard 
{
 public static void main(String[] args) 
 {  Random rand=new Random();
	String [] suit= {"Clubs","Diamonds", "Hearts", "Spades"};
	String[] rank = { "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14" };
	String[] deck = new String[52];
	int length = deck.length;
	String[][] cardsOfPlayers = new String[4][9];
	int i = 0;

	// created Deck of cards
	while (length > i) {
		for (int l = 0; l < 4; l++) {
			for (int l2 = 0; l2 < 13; l2++) {
				deck[i] = suit[l] + rank[l2];
				i++;
			}

		}

	}

	// shuffled using random function
	for (int l = 0; l < deck.length; l++) {
		String temp="";
		int randomNumber = rand.nextInt(52);
		temp=deck[randomNumber];
		deck[randomNumber] = deck[51 - randomNumber];
		deck[51 - randomNumber]=temp;
	}

	// giving each player 9 cards
	i = 0;
	for (int j = 0; j < cardsOfPlayers.length; j++) {
		for (int j2 = 0; j2 < cardsOfPlayers[j].length; j2++) {
			cardsOfPlayers[j][j2] = deck[i];
			i++;
		}
	}

	// printing their cards before sorting
	System.out.print("Cards of players before Sorting are :" +" ");
	System.out.println();
	OopsUtility.showCards(cardsOfPlayers);
    System.out.println();
	// Sorting and showing cards of each player
	
	for (int j = 0; j < cardsOfPlayers.length; j++) {
		OopsUtility.sortCards(cardsOfPlayers[j]);
	}
	System.out.print("Cards of players after Sorting are :"+ " ");
	System.out.println();
	OopsUtility.showCards(cardsOfPlayers);

}

}
