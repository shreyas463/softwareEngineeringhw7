package questionone;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class TextModify implements Modifyable {
    private List<Text> text;

    public void create(List<Text> text) {
        this.text = text;
    }

    @Override
    public void edit(String fileName, List<Text> documentText) {
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                throw new IOException("File not there: " + fileName);
            }
            FileWriter writer = new FileWriter(file);
            for(Text text : documentText) {
                writer.write(text.getText() + "\n");
            }
            writer.close();
            this.text = documentText;
            System.out.println("File modified successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while modifying the file.");
            e.printStackTrace();
        }
    }


    @Override
    public void save(String fileName) {
        try {
            FileWriter writer = new FileWriter(fileName);
            for(int i = 0; i < text.size(); i++) {
                writer.write(text.get(i).getText() + "\n");
            }
            writer.close();
            System.out.println("Successfully saved to file " + fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
