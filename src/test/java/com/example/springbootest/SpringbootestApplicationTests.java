package com.example.springbootest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class SpringbootestApplicationTests {

	@Test
	void test() {
		Assert.isTrue((4/2) == 2, "Non égaux");
		Assert.isInstanceOf(String.class, new String(), "Pas une chaîne");

		List<Integer> liste = new ArrayList<Integer>();
		liste.add(1);
		Assert.notEmpty(liste, "Est vide)");

		Integer i = null;
		Assert.isNull(i, "Doit être null");
	}

}
