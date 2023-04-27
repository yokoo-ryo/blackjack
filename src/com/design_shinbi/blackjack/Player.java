package com.design_shinbi.blackjack;

import java.util.Scanner;

public class Player extends Attender {

	public static final int ACTION_HIT = 1;
	public static final int ACTION_STAND = 2;

	private Scanner scanner;

	public Player(Scanner scanner) {
		super("YOU");
		this.scanner = scanner;
	}

	@Override
	public int calculateStrength() {
		// TODO 自動生成されたメソッド・スタブ
		int strength = super.calculateStrength();
		if (strength == 0) {
			strength = -1;
		}

		return strength;
	}

	@Override
	public void play(Stock stock) {
		// TODO 自動生成されたメソッド・スタブ
		boolean standing = false;

		while (!standing) {
			this.display();
			int action = selectAction();
			if (action == ACTION_HIT) {
				this.hit(stock);
				int strength = this.calculateStrength();
				if (strength <= 0) {
					standing = true;
				}
			} else {
				standing = true;
			}
		}
	}

	private int selectAction() {
		String selectMessage = String.format("[%d] Hit (カードを引く), [%d] Stand (勝負する)",
				ACTION_HIT, ACTION_STAND);

		System.out.println(selectMessage);

		int action = 0;
		while (action != ACTION_HIT && action != ACTION_STAND) {
			String intput = this.scanner.nextLine();
			try {
				action = Integer.parseInt(intput);
			} catch (Exception e) {
			}
		}

		return action;
	}

}
