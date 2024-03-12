package be.vdab.taken;

import be.vdab.taken.Woord;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class WoordTest {

    @Test
    void vorkIsGeenPalindroom() {
        assertThat(new Woord("vork").isPalindroom()).isFalse();
    }
    @Test
    void lepelIsEenPalindroom() {
        assertThat(new Woord("lepel").isPalindroom()).isTrue();
    }
    @Test
    void lepelIsEenPalindroomIgnoreCase() {
        assertThat(new Woord("Lepel").isPalindroom()).isTrue();
    }
    @Test
    void legeStringIsEenPalindroom() {
        assertThat(new Woord("").isPalindroom()).isTrue();
    }

}
