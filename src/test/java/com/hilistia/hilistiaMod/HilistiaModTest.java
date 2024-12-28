package com.hilistia.hilistiaMod;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class HilistiaModTest {

    public static final HilistiaMod mod = new HilistiaMod();

    @BeforeAll
    static void beforeAll() {
        mod.onInitialize();
    }

    @Test
    void test_mod_initializes() {
        Assertions.assertInstanceOf(HilistiaMod.class, mod);
    }
}
