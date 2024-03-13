package be.vdab.taken;

import java.util.Set;

class Isbn {
    private final long nummer;
    private static final long MIN = 1000_000_000_000L;
    private static final long MAX = 9999_999_999_999L;
    private static final Set<Short> MOGELIJKE_EERSTE_3_CIJFERS = Set.of((short)978, (short)979);
    Isbn(long nummer) {
        if (nummer < MIN || nummer > MAX) {
            throw new IllegalArgumentException("Bevat geen 13 cijfers");
        }
        var eerste3Cijfers = (short)(nummer/10000000000L);
        if (!MOGELIJKE_EERSTE_3_CIJFERS.contains(eerste3Cijfers)) {
            throw new IllegalArgumentException("Begint niet met: " + MOGELIJKE_EERSTE_3_CIJFERS);
        }
        var somEvenCijfers = 0;
        var somOnevenCijfers = 0;
        var teVerwerkenCijfers = (int) (nummer/10);
        for (int teller = 0; teller != 6; teller++) {
            somEvenCijfers += teVerwerkenCijfers % 10;
            teVerwerkenCijfers /= 10;
            somOnevenCijfers += teVerwerkenCijfers % 10;
            teVerwerkenCijfers /= 10;
        }
        var somVanGetallen = 3 * somEvenCijfers + somOnevenCijfers;
        var verschil = 10 - (somVanGetallen % 10);
        if (! (nummer % 10 == verschil % 10)) {
            throw new IllegalArgumentException("Verkeerd controlegetal");
        }
        this.nummer = nummer;
    }

    @Override
    public String toString() {
        return String.valueOf(nummer);
    }
}
