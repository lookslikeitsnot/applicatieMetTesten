package be.vdab.util;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

public class StatistiekTest {
	@Test
	public void hetGemiddeldeVan0en10is5() {
		assertEquals(0, BigDecimal.valueOf(5)
				.compareTo(Statistiek.getGemiddelde(new BigDecimal[] { BigDecimal.ZERO, BigDecimal.TEN })));
	}

	@Test
	public void hetGemiddeldeVanEenGetalIsDatGetal() {
		BigDecimal enigGetal = BigDecimal.valueOf(1.23);
		assertEquals(0, enigGetal.compareTo(Statistiek.getGemiddelde(new BigDecimal[] { enigGetal })));
	}

	@Test(expected = IllegalArgumentException.class)
	public void hetGemiddeldeVanEenLegeVerzamelingKanJeNietBerekenen() {
		Statistiek.getGemiddelde(new BigDecimal[] {});
	}

	@Test(expected = NullPointerException.class)
	public void hetGemiddeldeVanNullKanJeNietBerekenen() {
		Statistiek.getGemiddelde(null);
	}

	@Test(expected = NullPointerException.class)
	public void eenArrayElementMagNietNullBevatten() {
		Statistiek.getGemiddelde(new BigDecimal[] { null });
	}
}