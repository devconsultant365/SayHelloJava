package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloTest {

    @org.junit.jupiter.api.Test
    void sayHello() {
        String res = new Hello().sayHello("test");

        assertEquals("Hello test", res);
    }
}
