package apiTests;


import org.testng.Assert;
import org.testng.annotations.Test;
import api.Response;
import api.TrelloBO;

public class AddDescriptionToCardTest {
    TrelloBO trelloBO = new TrelloBO();

    @Test
    public void AddDescriptionToCard() {
        trelloBO.addDesc();
    }
}