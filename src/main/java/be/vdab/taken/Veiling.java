package be.vdab.taken;

import java.math.BigDecimal;

class Veiling {
private BigDecimal hoogsteBod = BigDecimal.ZERO;
    void doeBod(BigDecimal bedrag) {
        if (bedrag.compareTo(hoogsteBod) > 0) {
            hoogsteBod = bedrag;
        }
    }
    BigDecimal getHoogsteBod() {
        return hoogsteBod;
    }
}
