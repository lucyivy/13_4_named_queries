package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testPizzaNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Sesame")
                .burgers(3)
                .sauce("Garlic")
                .ingredient("Cheese")
                .ingredient("Tomatoes")
                .ingredient("Salad")
                .ingredient("Olives")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals("Sesame", bigmac.getBun());
        Assert.assertEquals(3, bigmac.getBurgers());
        Assert.assertEquals("Garlic", bigmac.getSauce());
        Assert.assertEquals(4, howManyIngredients);
    }
}

