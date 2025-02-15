package Items;

import java.util.ArrayList;
import java.util.List;

public class Paragraphs implements Items {
    List<String> paragraphs = new ArrayList<>();

    public Paragraphs(String text) {
        String[] paragraphsArray = text.split("\t");
        for (int i = 0; i < paragraphsArray.length; i++) {
            paragraphs.add(paragraphsArray[i]);
        }
    }

    public List<String> getItems() {
        return paragraphs;
    }

    @Override
    public String backToText(List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (String string : paragraphs) {
            sb.append(string + "\\t");
        }
        return sb.toString();
    }
}
