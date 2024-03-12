package be.vdab.taken;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class VeilingTest {

    private Veiling veiling;
    @BeforeEach
    void beforeEach() {
        veiling = new Veiling();
    }
    @Test
    void hetHoogsteBodVanEenNieuweVeilingIs0€() {
        assertThat(veiling.getHoogsteBod()).isZero();
    }

    @Test
    void naEenBodVan10€IsHetHoogsteBod10€() {
        veiling.doeBod(BigDecimal.TEN);
        assertThat(veiling.getHoogsteBod()).isEqualByComparingTo("10");
    }

    @Test
    void naEenBodVan2€En10€En2€En1€IsHetHoogsteBod10€() {
        veiling.doeBod(BigDecimal.TWO);
        veiling.doeBod(BigDecimal.TEN);
        veiling.doeBod(BigDecimal.TWO);
        veiling.doeBod(BigDecimal.ONE);
        assertThat(veiling.getHoogsteBod()).isEqualByComparingTo("10");
    }
}