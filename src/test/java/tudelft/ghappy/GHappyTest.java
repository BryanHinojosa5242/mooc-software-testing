package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {
    @Test
    public void testGHappy_AllGsHappy() {
        GHappy gh = new GHappy();
        Assertions.assertTrue(gh.gHappy("xxggxx"));
    }

    @Test
    public void testGHappy_SingleGUnhappy() {
        GHappy gh = new GHappy();
        Assertions.assertFalse(gh.gHappy("xxgxx"));
    }

    @Test
    public void testGHappy_UnhappyGAtEnd() {
        GHappy gh = new GHappy();
        Assertions.assertFalse(gh.gHappy("xxggyygxx"));
    }
}
