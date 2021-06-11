package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MirrorTest {
    @Test
    public void mirrorEndTest() {
        Mirror mi = new Mirror();
        String result = mi.mirrorEnds("asdfasdfasdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfdsfasdfdsa");
        Assertions.assertEquals("asdf", result);
    }
}
