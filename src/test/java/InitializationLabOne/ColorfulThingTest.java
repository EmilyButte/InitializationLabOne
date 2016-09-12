package InitializationLabOne;

import org.junit.Assert;
import org.junit.Test;


/**
 * Created by emilybutte on 9/11/16.
 */
public class ColorfulThingTest {

    ColorfulThing colorfulThing = new ColorfulThing(ColorfulThing.Color.RED);

    @Test
    public void getColorTest(){
        ColorfulThing.Color expectedValue = ColorfulThing.Color.RED;
        ColorfulThing.Color actualValue = colorfulThing.getColor();
        Assert.assertEquals("color message", expectedValue, actualValue);
    }
}
