package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashBackHackServiceTest {

    @Test
    public void shouldBuyFor1000() {
        CashBackHackService service = new CashBackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void shouldBuyFor1900() {
        CashBackHackService service = new CashBackHackService();
        int amount = 1_500;

        int actual = service.remain(amount);
        int expected = 500;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldButFor0() {
    CashBackHackService service = new CashBackHackService();
    int amount = 1_000;

    int actual = service.remain(amount);
    int expected = 0;

    Assert.assertEquals(actual, expected);
    }
}
