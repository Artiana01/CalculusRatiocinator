package calculusratiocinator;

public class Affirmation {
    public String texte;

    public Affirmation(String texte) {
        this.texte = texte;
    }

    public String evaluer() {
        return EvalAffirmation.evaluer(this);
    }
}
