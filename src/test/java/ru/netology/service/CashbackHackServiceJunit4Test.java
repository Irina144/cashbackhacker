package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceJunit4Test {

    @Test
    public void shouldReturn100WhenAmountIs900() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int actual = service.remain(900);
        Assert.assertEquals("900 → не хватает 100", expected, actual);
    }

    @Test
    public void shouldReturn0WhenAmountIsExactly1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);
        Assert.assertEquals("1000 кратно 1000 → должно быть 0", expected, actual);
    }

    @Test
    public void shouldReturn999WhenAmountIs1001() {
        CashbackHackService service = new CashbackHackService();
        int expected = 999;
        int actual = service.remain(1001);
        Assert.assertEquals("1001 → 999", expected, actual);
    }

    @Test
    public void shouldReturn0WhenAmountIs0() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(0);
        Assert.assertEquals("0 → 0", expected, actual);
    }
}