package Aufgaben.Aufgabenblatt11.Aufgabe47;

import static org.junit.Assert.*;
import org.junit.*;

public class FarbFernseherTest {
    private FarbFernseher ff1, ff2;

    @Before
    public void initFFs() {
        ff1 = new FarbFernseher("Wohnzimmer", 6, 7, 8);
        ff2 = new FarbFernseher("Schlafzimmer", 35, 15, 20);
    }

    @Test
    public void testFF1toString() {
        assertEquals("Fernseher im Wohnzimmer: v=6, p=7, c=8", ff1.toString());
        assertEquals("Fernseher im Schlafzimmer: v=35, p=15, c=20", ff2.toString());
    }

    @Test
    public void testFFCompare(){
        assertFalse(ff1.istAngenehmerAls(ff2));
        assertFalse(ff2.istAngenehmerAls(ff1));
    }

    @Test
    public void testFFChange(){
        ff1.change("volume", -5);
        ff1.change("program", 1);
        ff1.change("color", 15);
        assertEquals("Fernseher im Wohnzimmer: v=1, p=8, c=23", ff1.toString());
    }

    @Test
    public void testFFCompareAfterChange(){
        ff1.change("volume", -5);
        ff1.change("program", 1);
        ff1.change("color", 15);
        assertTrue(ff1.istAngenehmerAls(ff2));
        assertFalse(ff2.istAngenehmerAls(ff1));
    }
}
