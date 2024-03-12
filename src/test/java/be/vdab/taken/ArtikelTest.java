package be.vdab.taken;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.*;

class ArtikelTest {

    @Test
    @DisplayName("Prijs plus BTW = 0 is Prijs zelf")
    void prijsPlusBtwZeroIsPrijs() {
        assertThat(new Artikel(BigDecimal.valueOf(50), BigDecimal.ZERO).getPrijsInclusiefBtw()).isEqualByComparingTo("50");
    }
    @Test
    @DisplayName("Prijs plus negatief BTW is Prijs zelf")
    void prijsPlusNegatiefBtwIsPrijs() {
        assertThat(new Artikel(BigDecimal.valueOf(50), BigDecimal.valueOf(-10)).getPrijsInclusiefBtw()).isEqualByComparingTo("50");
    }
    @Test
    @DisplayName("30 plus BTW 6% is 31.8")
    void prijsVan30InclusiefBtwVan6ProcentIs31Komma8() {
        assertThat(new Artikel(BigDecimal.valueOf(30), BigDecimal.valueOf(6)).getPrijsInclusiefBtw()).isEqualByComparingTo("31.8");
    }
}
