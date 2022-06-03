package apiTests;

import api.TrelloBO;
import org.testng.annotations.Test;

public class moveCardsToListTest {
    TrelloBO trelloBO = new TrelloBO();

    @Test
    public void moveCardsToList() {
        trelloBO.moveStickerToList();
    }
}
