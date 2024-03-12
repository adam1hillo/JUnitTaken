package be.vdab.taken;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        BigDecimal prijsExclusiefBtw = BigDecimal.valueOf(50);
        BigDecimal btwPercentage = BigDecimal.valueOf(55);
        System.out.println(btwPercentage.divide(BigDecimal.valueOf(100),2, RoundingMode.HALF_UP));
    }
}
