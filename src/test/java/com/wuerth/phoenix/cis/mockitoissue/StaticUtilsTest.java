package com.wuerth.phoenix.cis.mockitoissue;

import org.junit.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;


public class StaticUtilsTest {

    public StaticUtilsTest() {

    }

    @Test
    public void test() {
        assertEquals("Simone", StaticUtils.name());

        try (MockedStatic<StaticUtils> utilities = Mockito.mockStatic(StaticUtils.class)) {
            utilities.when(StaticUtils::name).thenReturn("MockedName");
            assertEquals("MockedName", StaticUtils.name());
        }

        assertEquals("Simone", StaticUtils.name());
    }
}