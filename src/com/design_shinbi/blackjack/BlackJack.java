package com.design_shinbi.blackjack;

import java.util.Scanner;

public class BlackJack {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean yn = false;

		while (!yn) {
			start(scanner);

			System.out.println("");
			System.out.println("お疲れさまでした。");
			System.out.println("もう1度プレイしますか？");
			System.out.println("[Y]はい [N]いいえ");
			String input = scanner.nextLine();

			if (input.equalsIgnoreCase("N")) {
				yn = true;
			}
		}
		System.out.println("さようなら。また来てくださいね。");

		scanner.close();
	}

	public static void start(Scanner scanner) {
		Player player = new Player(scanner);
		Dealer dealer = new Dealer();
		Stock stock = new Stock();

		player.start(stock);
		dealer.start(stock);

		dealer.display();

		player.play(stock);
		dealer.play(stock);

		showResult(player, dealer);
	}

	public static void showResult(Attender player, Attender dealer) {
		dealer.display();
		player.display();

		int dealerStrength = dealer.calculateStrength();
		int playerStrength = player.calculateStrength();

		if (dealerStrength > playerStrength) {
			System.out.println("あなたの負けです。。。");
		} else if (dealerStrength < playerStrength) {
			System.out.println("あなたの勝ちです!!!");
		} else if (dealerStrength == playerStrength) {
			System.out.println("引き分けです。");
		}
	}
}
