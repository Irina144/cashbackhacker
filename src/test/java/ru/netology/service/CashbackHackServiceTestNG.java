package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTestNG {

    @Test
    public void shouldReturn100WhenAmountIs900() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        int expected = 100;
        Assert.assertEquals(actual, expected, "Должно не хватать 100 рублей");
    }

    @Test
    public void shouldReturn0WhenAmountIsExactly1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0; 
        Assert.assertEquals(actual, expected, "Если ровно 1000, должно быть 0");
    }

    @Test
    public void shouldReturn999WhenAmountIs1001() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1001);
        int expected = 999;
        Assert.assertEquals(actual, expected, "Если 1001 → 999");
    }

    @Test
    public void shouldReturn0WhenAmountIs0() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        int expected = 0;
        Assert.assertEquals(actual, expected, "Если 0 → 0");
    }
}