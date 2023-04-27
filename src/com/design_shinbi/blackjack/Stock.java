package com.design_shinbi.blackjack;

import java.util.Collections;
import java.util.List;

/**
 * 手札管理クラス
 */
public class Stock {
	private List<Card> cards;

	/**
	 * 手札を初期化する
	 */
	public Stock() {
		initialize();
	}

	/**
	 * 52枚のカードをシャッフルする
	 */
	public void initialize() {
		List<Card> list = Card.getAllCards();
		Collections.shuffle(list);
		this.cards = list;
	}

	/**
	 * カードの枚数を取得する
	 * @return カードの枚数
	 */
	public int getNumberOfCards() {
		return this.cards.size();
	}

	/**
	 * カードを引く
	 * @return　引いたカード
	 */
	public Card pickCard() {
		Card card = this.cards.get(0);
		this.cards.remove(0);
		return card;
	}
}
