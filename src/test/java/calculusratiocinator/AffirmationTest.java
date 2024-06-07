package calculusratiocinator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AffirmationTest {

    @Test
    public void testLouEstPauvreEtLouEstGenereux() {
        Affirmation mensonge1 = new Mensonge("Lou est pauvre");
        Affirmation affirmation1 = new Affirmation("Lou est généreux");

        Affirmation a1 = new AffirmationEt(mensonge1, affirmation1);
        assertEquals("faux", a1.evaluer(), "Lou est pauvre et Lou est généreux");
    }

    @Test
    public void testLouEstBeauDoncLouEstPauvre() {
        Affirmation verite1 = new Verite("Lou est beau");
        Affirmation mensonge1 = new Mensonge("Lou est pauvre");

        Affirmation a2 = new AffirmationDonc(verite1, mensonge1);
        assertEquals("faux", a2.evaluer(), "Lou est beau. Donc Lou est pauvre");
    }

    @Test
    public void testLouEstPauvreDoncLouEstGenereux() {
        Affirmation mensonge1 = new Mensonge("Lou est pauvre");
        Affirmation affirmation1 = new Affirmation("Lou est généreux");

        Affirmation a3 = new AffirmationDonc(mensonge1, affirmation1);
        assertEquals("vrai", a3.evaluer(), "Lou est pauvre. Donc Lou est généreux");
    }

    @Test
    public void testLouEstBeauOuLouEstGenereuxDoncLouEstPauvre() {
        Affirmation verite1 = new Verite("Lou est beau");
        Affirmation affirmation1 = new Affirmation("Lou est généreux");
        Affirmation mensonge1 = new Mensonge("Lou est pauvre");

        Affirmation a4 = new AffirmationDonc(new AffirmationOu(verite1, affirmation1), mensonge1);
        assertEquals("faux", a4.evaluer(), "Lou est beau ou Lou est généreux. Donc Lou est pauvre");
    }

}
