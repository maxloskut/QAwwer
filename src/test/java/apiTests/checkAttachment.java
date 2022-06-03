package apiTests;

import api.TrelloBO;
import org.testng.annotations.Test;

public class checkAttachment {
    TrelloBO trelloBO = new TrelloBO();

    @Test
    public void CheckAttachment() {
        trelloBO.getAttachment();
    }
}
