package be.vdab.taken;

class Rechthoek {
    private final int lengte;
    private final int breedte;

    Rechthoek(int lengte, int breedte) {
        this.lengte = lengte;
        this.breedte = breedte;
    }
    int getOppervlakte() {
        return lengte * breedte;
    }
    int getOmtrek() {
        return 2 * (lengte + breedte);
    }
}
