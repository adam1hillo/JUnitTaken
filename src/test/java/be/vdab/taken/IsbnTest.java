package be.vdab.taken;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.junit.jupiter.api.Assertions.*;

class IsbnTest {

    @Test
    void hetNummer0IsVerkeerd() {
        assertThatIllegalArgumentException().isThrownBy(() -> new Isbn(0));
    }
    @Test
    void eenNegatiefNummerIsVerkeerd() {
        assertThatIllegalArgumentException().isThrownBy(() -> new Isbn(-9789027439642L));
    }

    @Test
    void eenNummerMet14CijfersIsVerkeerd() {
        assertThatIllegalArgumentException().isThrownBy(() -> new Isbn(97890274396421L));
    }
    @Test
    void eenNummerMet12CijfersIsVerkeerd() {
        assertThatIllegalArgumentException().isThrownBy(() -> new Isbn(978902743964L));
    }
    @Test
    void deEerste3CijfersMoeten978of979Zijn() {
        assertThatIllegalArgumentException().isThrownBy(() -> new Isbn(9189027439642L));
    }
    @Test
    void eenNummerMet13CijfersMetVerkeerdControleGetal2() {
        assertThatIllegalArgumentException().isThrownBy(() -> new Isbn(9789027419542L));
    }

    @Test
    void eenNummerMet13CijfersMetCorrectControleGetal2() {
        new Isbn(9789027439642L);
    }
    @Test
    void eenNummerMet13CijfersMetVerkeerdControleGetal3() {
        assertThatIllegalArgumentException().isThrownBy(() -> new Isbn(9789027439643L));
    }
    @Test
    void eenNummerMet13CijfersMetCorrectControleGetal0() {
        new Isbn(9789227439640L);
    }
    @Test
    void toStringGeeftNummerTerug() {
        assertThat(new Isbn(9789027439642L)).hasToString("9789027439642");
    }

}