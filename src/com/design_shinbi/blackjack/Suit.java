package com.design_shinbi.blackjack;

/**
 *列挙型を定義する
 */
public enum Suit {
	SPADE("スペード"), HEART("ハート"), DIAMOND("ダイヤ"), CLUB("クラブ");

	private String name;

	private Suit(String name) {
		this.name = name;
	}

	/**
	 * カードの名前の文字列を取得する
	 * @return カードの名前の文字列
	 */
	public String getName() {
		return this.name;
	}
}
