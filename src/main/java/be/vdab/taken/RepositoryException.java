package be.vdab.taken;

public class RepositoryException extends RuntimeException{

    public RepositoryException(Exception oorzaak) {
        super(oorzaak);
    }
}
