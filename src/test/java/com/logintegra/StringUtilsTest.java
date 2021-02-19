package com.logintegra;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class StringUtilsTest {

    private final StringUtils stringUtils = new StringUtils();

    @Test
    @Tag("Critical")
    @DisplayName("Metoda 'getFirstLetter' zwraca pierwszą literę podanego słowa")
    void getFirstLetter_returns_first_letter() {
        String s = stringUtils.getFirstLetter("wsb");
        assertEquals("w", s);

        assertAll("words",
                () -> assertEquals(stringUtils.getFirstLetter("wsb"), "w"),
                () -> assertEquals(stringUtils.getFirstLetter("JUnit"), "J"),
                () -> assertEquals(stringUtils.getFirstLetter("WSB"), "W"));
    }

    @Test
    void getFirstLetter_returns_empty_string_when_given_empty_string() {
        String s = stringUtils.getFirstLetter("");
        assertEquals(s, "");
    }

    @Test
    void getFirstLetter_returns_empty_string_when_given_null() {
        String s = stringUtils.getFirstLetter(null);
        assertEquals(s, "");
    }

    @Test
    @DisplayName("Metoda 'getLastLetter' zwraca ostatnią literę podanego słowa")
    void getLastLetter_returns_last_letter(){
        String s = stringUtils.getLastLetter("Marcin");
        assertEquals("n", s);

        assertAll("names",
                () -> assertEquals(stringUtils.getLastLetter("Baltazar Gąbka"), "a" ),
                () -> assertEquals(stringUtils.getLastLetter("BRUCE LEE"), "E" ),
                () -> assertEquals(stringUtils.getLastLetter("NanA"), "A" ));
    }

    @Test
    void getLastLetter_returns_empty_string_when_given_empty_string() {
        String s = stringUtils.getLastLetter("");
        assertEquals(s, "");
    }

    @Test
    void getLastLetter_returns_empty_string_when_given_null() {
        String s = stringUtils.getLastLetter(null);
        assertEquals(s, "");
    }
}
