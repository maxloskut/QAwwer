package apiTests;

import api.TrelloBO;
import org.testng.annotations.Test;

public class renameBoardTest {
    TrelloBO trelloBO = new TrelloBO();

    @Test
    public void RenameBoard() {
        trelloBO.renameBoard();
    }
}
