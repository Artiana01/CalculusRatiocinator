package calculusratiocinator;

public final class Verite extends Affirmation {
    public Verite(String texte) {
        super(texte);
    }

    @Override
    public String evaluer() {
        return "vrai";
    }
}
