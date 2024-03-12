package be.vdab.taken;

import java.math.BigDecimal;
import java.math.RoundingMode;

class Artikel {
    private BigDecimal prijsExclusiefBtw;
    private  BigDecimal btwPercentage;

    Artikel(BigDecimal prijsExclusiefBtw, BigDecimal btwPercentage) {
        this.prijsExclusiefBtw = prijsExclusiefBtw;
        this.btwPercentage = btwPercentage;
    }
    BigDecimal getPrijsInclusiefBtw() {
        if (btwPercentage.compareTo(BigDecimal.ZERO) <= 0) {
            return prijsExclusiefBtw;
        }
        BigDecimal btwBedrag = prijsExclusiefBtw.multiply(btwPercentage.divide(BigDecimal.valueOf(100),2, RoundingMode.HALF_UP));
        return prijsExclusiefBtw.add(btwBedrag);
    }
}
