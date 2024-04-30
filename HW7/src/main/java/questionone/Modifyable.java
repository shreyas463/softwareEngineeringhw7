package questionone;

import java.util.List;

public interface Modifyable {
    void create(List<Text> text);
    void edit(String fileName, List<Text> text);
    void save(String fileName);
}
