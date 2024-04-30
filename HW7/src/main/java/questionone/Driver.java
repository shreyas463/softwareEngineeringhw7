package questionone;



import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Driver {
    private static final String[] fonts = {"Arial", "Calibri", "Verdana"};
    private static final int[] fontSizes = {12, 14, 16};
    private static final String[] colors = {"Red", "Blue", "Black"};
    private static final String filePath = "src/main/java/questionone/"; // Added trailing slash.

    public static void main(String[] args) {

        TextModify textModify = new TextModify();
        textModify.create(createTexts("HelloWorldCS5800"));
        textModify.save(filePath + "doc.txt"); // This is the document with 4 differnt styles.

        String fileName = filePath + "doc.txt";
        textModify.edit(fileName, createTexts("HelloWorldCS5800")); // Edit the first document.
        textModify.save(fileName); // Save the first document again.
    }

    public static List<Text> createTexts(String words){
        List<Text> texts = new ArrayList<>();
        Random rand = new Random(); // Using Random for better random number generation.

        for(int i = 0; i < words.length(); i++) {
            String randomColor = colors[rand.nextInt(colors.length)];
            String randomFont = fonts[rand.nextInt(fonts.length)];
            int randomFontSize = fontSizes[rand.nextInt(fontSizes.length)];
            texts.add(new Text(words.substring(i, i+1), randomFont, randomFontSize, randomColor));
        }
        return texts;
    }
}
