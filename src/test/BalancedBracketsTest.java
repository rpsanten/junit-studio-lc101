package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void onlyBracketsWrongOrderReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void noBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("No brackets :("));
    }

    @Test
    public void bracketPhraseTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Yaaay brackets!]"));
    }

    @Test
    public void bracketInStringTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Yaa[ay bra]ckets!"));
    }

    @Test
    public void nestedBracketTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void extraLeftBracketFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[]]"));
    }

    @Test
    public void extraRightBracketFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]]]"));
    }

    @Test
    public void unevenBracketLeftFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[This is a] [tes]t!"));
    }

    @Test
    public void unevenBracketRightFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[This is a]]] [tes]t!"));
    }

    @Test
    public void multipleEvenBracketsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[This is a ]][it wil]l" +
                "work[[]] I know it[ will![ yaay ]  okay!] [tes]t!"));
    }

    @Test
    public void multipleBracketsExtraLeft() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[This] [is[crazy]]"));
    }

    @Test
    public void multipleBracketsExtraRight() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[This] [i]s[cra]zy]]"));
    }

    @Test
    public void startedWithALeftNowWeHere() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][[This] [i]s[cra]zy]]["));
    }

    @Test
    public void improperNesting() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void emptyStringTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
}
