package questionone;

import java.util.HashMap;

public class TextPropertyFactory {

    private static final HashMap<String, TextPropertys> textPropertiesCache = new HashMap<>();
    private static TextPropertyFactory instance = null;

    private TextPropertyFactory() {}

    public static synchronized TextPropertyFactory getInstance() {
        if (instance == null) {
            instance = new TextPropertyFactory();
        }
        return instance;
    }

    public synchronized TextPropertys getTextProperties(String font, int fontSize, String color) {
        String key = getKey(font, fontSize, color);
        return textPropertiesCache.computeIfAbsent(key, k -> new TextPropertys(font, fontSize, color));
    }

    private String getKey(String font, int fontSize, String color) {
        return String.format("%s-%d-%s", font, fontSize, color);
    }
}
