package com.design_shinbi.blackjack;

/**
 * カード情報管理クラス
 */
import java.util.ArrayList;
import java.util.List;

public class Card {

	private Suit suit;
	private int number;

	/**
	 * コンストラクター
	 * @param suit トランプのマーク
	 * @param number トランプの数字
	 */
	public Card(Suit suit, int number) {
		this.suit = suit;
		this.number = number;
	}

	/**
	 * トランプのマークを取得する
	 * @return トランプのマーク
	 */
	public Suit getSuit() {
		return suit;
	}

	/**
	 * トランプの数字を取得する
	 * @return トランプの数字
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * 数字情報の文字列を取得する
	 * （例：　1 -> A, 2 -> 2, 3 -> 3, ..., 12 -> Q, 13 -> K）
	 * @param number トランプの数字
	 * @return 数字の文字列
	 */
	public static String getNumberString(int number) {
		String string = null;

		if (number == 1) {
			string = "A";

		} else if (number == 11) {
			string = "J";

		} else if (number == 12) {
			string = "Q";

		} else if (number == 13) {
			string = "K";

		} else if (number >= 2 && number <= 10) {
			string = Integer.toString(number);

		}

		return string;
	}

	/**
	 * カードの文字列を取得する
	 * （例:　[スペードA], [スペード2], ...）
	 */
	public String toString() {
		String string = String.format("[%s%s]", this.suit.getName(), getNumberString(this.number));

		return string;
	}

	/**
	 * 52枚の全てのカードを取得する。
	 * @return 52枚すべてのカードリスト
	 */
	public static List<Card> getAllCards() {
		List<Card> list = new ArrayList<Card>();

		for (Suit suit : Suit.values()) {
			for (int number = 1; number <= 13; number++) {
				Card card = new Card(suit, number);
				list.add(card);
			}
		}

		return list;
	}
}
