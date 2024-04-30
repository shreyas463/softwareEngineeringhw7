package questionone;

public class Text {

    private String text;
    private TextPropertys textProperties;

    public Text(String text, String font, int fontSize, String color) {
        this.text = text;
        this.textProperties = TextPropertyFactory.getInstance().getTextProperties(font, fontSize, color);
    }

    private String getTextProperties() {
        return textProperties.getProperties();
    }

    public String getText() {
        return text + ", " + getTextProperties();
    }


}
