package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tudelft.leapyear.LeapYear;

public class GHappyTest {
    @Test
    public void isHappy() {
        GHappy ha = new GHappy();
        Assertions.assertTrue(ha.gHappy("leggo"));
    }
}
