package questionone;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TextTests {


    @Test
    public void testTextPropertyFactoryCaching() {
        TextPropertyFactory factory = TextPropertyFactory.getInstance();
        TextPropertys prop1 = factory.getTextProperties("Arial", 12, "Red");
        TextPropertys prop2 = factory.getTextProperties("Arial", 12, "Red");


        assertEquals("Instances of TextPropertys with identical properties should be the same", prop1, prop2);
    }


    @Test
    public void testTextPropertiesString() {
        TextPropertys prop = new TextPropertys("Calibri", 14, "Blue");
        String expectedPropertiesString = "Calibri, 14, Blue";

        assertEquals("TextPropertys should return the correct Fonts", expectedPropertiesString, prop.getProperties());
    }


}
