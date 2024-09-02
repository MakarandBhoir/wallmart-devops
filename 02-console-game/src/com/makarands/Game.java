package com.makarands;

import java.util.Scanner;

public class Game {
	private static int generateRandomNumber() {
		int number = (int) (Math.random() * 100) + 1;
		System.out.println(number);
		return number;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int randomNumber = Game.generateRandomNumber();
		int attempt = 1;
		do {
			System.out.print("Guess number - Attempt " + attempt + " = ");
			int guess = scanner.nextInt();
			if (randomNumber == guess) {
				break;
			} else {
				System.out.println("Incorrect guess! try again");
			}
			attempt++;
		} while (attempt <= 5);
		if (attempt < 6) {
			System.out.println("Congratulation! You did it");
		} else {
			System.out.println("Game Over!!!");
		}
		scanner.close();
	}
}
