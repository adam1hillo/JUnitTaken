package be.vdab.taken;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RechthoekTest {


    @Test
    void deOppervlakteVanEenRechthoekVan4Op5Is15() {
        assertThat(new Rechthoek(5, 4).getOppervlakte()).isEqualTo(20);
    }

    @Test
    void deOmtrekVanEenRechthoekVan4Op5Is18() {
        assertThat(new Rechthoek(5, 4).getOmtrek()).isEqualTo(18);
    }

    @Test
    void rechthoekenMetHetzelfdeBreedteEnLengteZijnGelijk() {
        assertThat(new Rechthoek(5,4)).isEqualTo(new Rechthoek(5,4));
    }
    @Test
    void rechhoekenMetVerschillendeAfmetingenZijnVerschillend() {
        assertThat(new Rechthoek(5, 4)).isNotEqualTo(new Rechthoek(5,3));
    }
    @Test
    void deHashCodeVanGelijkeRechthoekkenIsGelijk() {
        assertThat(new Rechthoek(5,4)).hasSameHashCodeAs(new Rechthoek(5,4));
    }
    @Test
    void deLengteMagNietNegatiefZijn() {
        assertThatIllegalArgumentException().isThrownBy(() -> new Rechthoek(-1,5));
    }
    @Test
    void deBreedteMagNietNegatiefZijn() {
        assertThatIllegalArgumentException().isThrownBy(() -> new Rechthoek(5,-1));
    }
    @Test
    void deLengteMagNietKleinerDanBreedteZijn() {
        assertThatIllegalArgumentException().isThrownBy(() -> new Rechthoek(4,5));
    }
}

