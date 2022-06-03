package apiTests;

import api.TrelloBO;
import org.testng.annotations.Test;

public class addLabelTest {
    TrelloBO trelloBO = new TrelloBO();

    @Test
    public void AddLabel() {
        trelloBO.addLabel();
    }
}
