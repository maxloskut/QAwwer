package apiTests;


import org.testng.Assert;
import org.testng.annotations.Test;
import api.Response;
import api.TrelloBO;

public class CreateBoardTest {
    TrelloBO trelloBO=new TrelloBO();

    @Test
    public void createBoardTest(){

        trelloBO.create();
    }


}
