package com.luv2code.springdemo;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomFortuneService implements FortuneService {

	private String[] fortunes = {"Humor is an affirmation of dignity.",
							"Present your best ideas today to an eager and welcoming audience.",
							"A great pleasure in life is doing what others say you can't."};
	
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		int fortuneIndex = myRandom.nextInt(fortunes.length);
		
		return fortunes[fortuneIndex];
	}
}
