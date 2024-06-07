package calculusratiocinator;

public class AffirmationEt extends Affirmation {
    private Affirmation a1, a2;

    public AffirmationEt(Affirmation a1, Affirmation a2) {
        super(a1.texte + " et " + a2.texte);
        this.a1 = a1;
        this.a2 = a2;
    }

    @Override
    public String evaluer() {
        if (a1.evaluer().equals("vrai") && a2.evaluer().equals("vrai")) {
            return "vrai";
        }
        return "faux";
    }
}
