package ru.netology.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {

    @Test
    void shouldReturn100WhenAmountIs900() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int actual = service.remain(900);
        assertEquals(expected, actual, "Должно не хватать 100 рублей");
    }

    @Test
    void shouldReturn0WhenAmountIsExactly1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0; // ожидаем 0, но метод ошибочный — тест упадёт
        int actual = service.remain(1000);
        assertEquals(expected, actual, "Если ровно 1000, должно быть 0");
    }

    @Test
    void shouldReturn999WhenAmountIs1001() {
        CashbackHackService service = new CashbackHackService();
        int expected = 999;
        int actual = service.remain(1001);
        assertEquals(expected, actual, "Если 1001 → 999");
    }

    @Test
    void shouldReturn0WhenAmountIs0() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(0);
        assertEquals(expected, actual, "Если 0 → 0");
    }
}