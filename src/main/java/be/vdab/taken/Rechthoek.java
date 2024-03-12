package be.vdab.taken;

import java.util.Objects;

class Rechthoek {
    private final int lengte;
    private final int breedte;

    Rechthoek(int lengte, int breedte) {
        if (breedte < 1 || lengte < breedte) {
            throw new IllegalArgumentException();
        }
        this.lengte = lengte;
        this.breedte = breedte;
    }
    int getOppervlakte() {
        return lengte * breedte;
    }
    int getOmtrek() {
        return 2 * (lengte + breedte);
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof Rechthoek andereRechthoek && lengte == andereRechthoek.lengte && breedte == andereRechthoek.breedte;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lengte, breedte);
    }
}
