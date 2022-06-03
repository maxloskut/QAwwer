package apiTests;

import api.TrelloBO;
import org.testng.annotations.Test;

public class addAttachmentTest {
    TrelloBO trelloBO = new TrelloBO();

    @Test
    public void AddAttachment() {
        trelloBO.addAttachment();
    }
}
