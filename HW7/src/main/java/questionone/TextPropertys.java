package questionone;

public class TextPropertys {
    private String font;
    private int fontSize;
    private String color;

    public TextPropertys(String font, int fontSize, String color) {
        this.font = font;
        this.fontSize = fontSize;
        this.color = color;
    }

    public String getProperties() {
        return font + ", " + fontSize + ", " + color;
    }
}
