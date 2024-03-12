package be.vdab.taken;

class Woord {
    private final String woord;

    Woord(String woord) {
        this.woord = woord;
    }

    boolean isPalindroom() {
        return woord.equalsIgnoreCase(new StringBuilder(woord).reverse().toString());
    }
}
