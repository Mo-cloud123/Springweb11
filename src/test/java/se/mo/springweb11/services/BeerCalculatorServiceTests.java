package se.mo.springweb11.services;

import org.junit.jupiter.api.Test;
import se.mo.springweb11.service.BeerCalculatorService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BeerCalculatorServiceTests {
    // sut= System Under Test
    private BeerCalculatorService sut = new BeerCalculatorService();

    @Test
    public void When_18_And_Krogen_And_Not_Drunk_Should_Be_Allowed(){
        // ARRANGE
        int age = 18;
        String location = "K";
        float promille = 0.0f;

        // ACT
        boolean canBuyBeer = sut.CanBuyBeer(age, location, promille);
        // ASSERT
        assertEquals(true, canBuyBeer);
    }
    @Test
    public void When_17_And_Krogen_And_Not_Drunk_Should_Not_Be_Allowed(){
        // ARRANGE
        int age = 17;
        String location = "K";
        float promille = 0.0f;

        // ACT
        boolean canBuyBeer = sut.CanBuyBeer(age, location, promille);
        // ASSERT
        assertEquals(false, canBuyBeer);

    }
}
