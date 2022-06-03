package apiTests;

import api.TrelloBO;
import org.testng.annotations.Test;

public class addStickerTest {
    TrelloBO trelloBO = new TrelloBO();

    @Test
    public void AddSticker() {
        trelloBO.addSticker();
    }
}
