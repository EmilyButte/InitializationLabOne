package InitializationLabOne;

/**
 * Created by emilybutte on 9/12/16.
 */
public class ColorfulThing {
    // Define value of color
    public Color color;

    // Create enum constants
    public enum Color {
        RED, ORANGE, GREEN, BLUE, PURPLE, YELLOW, BROWN, TAN, BLACK, GRAY, WHITE
    }

    // Constructor
    public ColorfulThing(Color color) {
        this.color = color;
    }

    // getColor method
    public Color getColor() {
        return color;
    }
}
