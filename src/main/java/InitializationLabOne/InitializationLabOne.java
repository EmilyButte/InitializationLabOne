package InitializationLabOne;

/**
 * Created by emilybutte on 9/11/16.
 */
public class InitializationLabOne {

    public static void main(String[] args) {
        ColorfulThing colorfulThing1 = new ColorfulThing(ColorfulThing.Color.RED);
        colorfulThing1.getColor();
        ColorfulThing colorfulThing2 = new ColorfulThing(ColorfulThing.Color.ORANGE);
        colorfulThing2.getColor();
        ColorfulThing colorfulThing3 = new ColorfulThing(ColorfulThing.Color.YELLOW);
        colorfulThing3.getColor();
        ColorfulThing colorfulThing4 = new ColorfulThing(ColorfulThing.Color.GREEN);
        colorfulThing4.getColor();
        ColorfulThing colorfulThing5 = new ColorfulThing(ColorfulThing.Color.BLUE);
        colorfulThing5.getClass();

        BoringThing boringThing1 = new BoringThing();
        BoringThing boringThing2 = new BoringThing();
        BoringThing boringThing3 = new BoringThing();
        BoringThing boringThing4 = new BoringThing();
        BoringThing boringThing5 = new BoringThing();

    }
}
