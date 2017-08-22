package com.mromanro;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @org.junit.jupiter.api.Test
    void reverseString() {
        assertEquals("olleH", Main.reverseString("Hello"));
        assertEquals("21" , Main.reverseString("12"));
        assertEquals("a", Main.reverseString("a"));
        assertEquals("mnbvcxzlkjhgfdsapoiuytrewq", Main.reverseString("qwertyuiopasdfghjklzxcvbnm"));
        assertEquals("/.,';][", Main.reverseString("[];',./"));
    }

}