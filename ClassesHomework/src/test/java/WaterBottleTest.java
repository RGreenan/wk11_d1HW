import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterbottle;

    @Before
    public void before(){
        waterbottle = new WaterBottle(100, 0);
    }

    @Test
    public void newBottleVolumeTest(){
        assertEquals(100, waterbottle.newBottleVolume());
    }

    @Test
    public void drinkAmountTest(){
        assertEquals(90, waterbottle.drinkVolume());
    }

    @Test
    public void hasDrunkMoreWaterTest(){
        waterbottle.drinkVolume();
        assertEquals(80, waterbottle.drinkVolume());
    }

    @Test
    public void canEmptyBottle(){
        assertEquals(0, waterbottle.emptyBottle());
    }

    @Test
    public void canFillBottle(){
        assertEquals(100, waterbottle.fillBottle());
    }
}
