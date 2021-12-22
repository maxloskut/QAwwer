package apiTests;


import org.testng.Assert;
import org.testng.annotations.Test;
import api.Response;
import api.TrelloBO;

public class InviteToBoardTest {
    TrelloBO trelloBO = new TrelloBO();

    @Test
    public void InviteToBoard() {
        trelloBO.inviteToBoard();
    }
}