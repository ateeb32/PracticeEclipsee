package com.qa.QA;

import static org.junit.Assert.*;

import org.junit.Test;

public class BlackjackTest {

	@Test
	public void test() {

		Blackjack Blackjack = new Blackjack();

		assertEquals(0, Blackjack.blackjack(10, 22));
		assertEquals(0, Blackjack.blackjack(22, 9));
		assertEquals(0, Blackjack.blackjack(22, 22));
		assertEquals(10, Blackjack.blackjack(10, 7));
		assertEquals(19, Blackjack.blackjack(1, 19));

	}

}
