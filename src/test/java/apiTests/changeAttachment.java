package apiTests;

import api.TrelloBO;
import org.testng.annotations.Test;

public class changeAttachment {
    TrelloBO trelloBO = new TrelloBO();

    @Test
    public void ChangeAttachment() {
        trelloBO.putAttachment();
    }
}
