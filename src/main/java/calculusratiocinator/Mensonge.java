package calculusratiocinator;

public final class Mensonge extends Affirmation {
    public Mensonge(String texte) {
        super(texte);
    }

    @Override
    public String evaluer() {
        return "faux";
    }
}
