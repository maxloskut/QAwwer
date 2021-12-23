package api;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.UUID;

public class TrelloBO {

    public String create() {
        Request createRequest = RequestRepo.createTrelloBoard("Board"+ UUID.randomUUID().toString().substring(0,5));
        Response createResponse=new Client().send(createRequest);
        Assert.assertEquals(createResponse.getStatusCode().intValue(),200,"invalid code");
        return createResponse.getBodyAsJson().getString("id");
    }

    public Response delete(String boardId) {
        Request deleteRequest = RequestRepo.deleteTrelloBoard(boardId);
        Response deleteResponse=new Client().send(deleteRequest);
        Assert.assertEquals(deleteResponse.getStatusCode().intValue(),200,"invalid code");
        return deleteResponse;
    }


    private String CardId = "61c2a283f00c5d6f4daaf76c";
    private String IdList = "61c29a29511a6420c8688efa";
    private String Text = "describeOfCard221";


    public String addDesc() {
        Request createRequest = RequestRepo.AddDescriptionToCard(CardId, IdList, Text);
        Response createResponse=new Client().send(createRequest);
         Assert.assertEquals(createResponse.getStatusCode().intValue(),200,"invalid code");
        return createResponse.getBodyAsJson().getString("id");
    }

    private String boardId = "61c29a29511a6420c8688ef9";
    private String nameList = "MyNewList";

    public String createList() {
        Request createRequest = RequestRepo.createList(boardId, nameList);
        Response createResponse=new Client().send(createRequest);
        Assert.assertEquals(createResponse.getStatusCode().intValue(),200,"invalid code");
        return createResponse.getBodyAsJson().getString("id");
    }

    private String idList = "61c29a29511a6420c8688efa";
    private String nameCard = "MyTestIdCard";

    public String createCard() {
        Request createRequest = RequestRepo.createCard(idList, nameCard);
        Response createResponse=new Client().send(createRequest);
        Assert.assertEquals(createResponse.getStatusCode().intValue(),200,"invalid code");
        return createResponse.getBodyAsJson().getString("id");
    }

    private String memberEmail = "rygaligor42@gmail.com";

    public String inviteToBoard() {
        Request createRequest = RequestRepo.inviteToBoard(boardId, memberEmail);
        Response createResponse=new Client().send(createRequest);
        Assert.assertEquals(createResponse.getStatusCode().intValue(),200,"invalid code");
        return createResponse.getBodyAsJson().getString("id");
    }

    private String newNameForBoard = "renamedBoard";

    public String renameBoard() {
        Request createRequest = RequestRepo.renameBoard(boardId, newNameForBoard);
        Response createResponse=new Client().send(createRequest);
        Assert.assertEquals(createResponse.getStatusCode().intValue(),200,"invalid code");
        return createResponse.getBodyAsJson().getString("id");
    }

}
