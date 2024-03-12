package be.vdab.taken;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RechthoekTest {


    @Test
    void deOppervlakteVanEenRechthoekVan4Op5Is15() {
        assertThat(new Rechthoek(4, 5).getOppervlakte()).isEqualTo(20);
    }

    @Test
    void deOmtrekVanEenRechthoekVan4Op5Is18() {
        assertThat(new Rechthoek(4, 5).getOmtrek()).isEqualTo(18);
    }

    @Test
    void rechthoekenMetHetzelfdeBreedteEnLengteZijnGelijk() {
        assertThat(new Rechthoek(4,5)).isEqualTo(new Rechthoek(4,5));
    }
    @Test
    void rechhoekenMetVerschillendeAfmetingenZijnVerschillend() {
        assertThat(new Rechthoek(4, 5)).isNotEqualTo(new Rechthoek(3,5));
    }
    @Test
    void deHashCodeVanGelijkeRechthoekkenIsGelijk() {
        assertThat(new Rechthoek(4,5)).hasSameHashCodeAs(new Rechthoek(4,5));
    }
}

