package api;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.UUID;

public class TrelloBO {

    private String CardId = "62910ae6b8727d4a225250e5";
    private String IdList = "6043cb756c270335f21b92da";
    private String boardId = "6043cb74a3d31f373ecd9239";
    private String secondListId = "6297d2c870fe81665949dc20";
    private String nameList = "MyNewList";
    private String idList = "6043cb756c270335f21b92da";
    private String nameCard = "MyTestIdCard";
    private String top = "-60";
    private String left = "10";
    private String zIndex = "1";
    private String image = "taco-cool";
    private String url = "https://developer.atlassian.com/cloud/trello/rest/api-group-cards/%23api-cards-id-attachments-post";
    private String newUrl = "https://www.guru99.com/api-testing.html";
    private String labelType = "6043cb74119ec035937b541e";

    public String create() {
        Request createRequest = RequestRepo.createTrelloBoard("Board"+ UUID.randomUUID().toString().substring(0,5));
        Response createResponse=new Client().send(createRequest);
        Assert.assertEquals(createResponse.getStatusCode().intValue(),200,"invalid code");
        return createResponse.getBodyAsJson().getString("id");
    }

    private String newNameForBoard = "NewBoardName";

    public String renameBoard() {
        Request createRequest = RequestRepo.renameBoard(boardId, newNameForBoard);
        Response createResponse=new Client().send(createRequest);
        Assert.assertEquals(createResponse.getStatusCode().intValue(),200,"invalid code");
        return createResponse.getBodyAsJson().getString("id");
    }

    public String addSticker() {
        Request createRequest = RequestRepo.addSticker(CardId, top, left, zIndex, image);
        Response createResponse=new Client().send(createRequest);
        Assert.assertEquals(createResponse.getStatusCode().intValue(),200,"invalid code");
        return createResponse.getBodyAsJson().getString("id");
    }

    public String moveStickerToList() {
        Request createRequest = RequestRepo.moveCardToList(secondListId, boardId, idList);
        Response createResponse=new Client().send(createRequest);
        Assert.assertEquals(createResponse.getStatusCode().intValue(),200,"invalid code");
        return null;
//        return createResponse.getBodyAsJson().getString("id");
    }

    private String commentText = "THis is my comment";

    public String addComment() {
        Request createRequest = RequestRepo.addComment(CardId, commentText);
        Response createResponse=new Client().send(createRequest);
        Assert.assertEquals(createResponse.getStatusCode().intValue(),200,"invalid code");
        return createResponse.getBodyAsJson().getString("id");
    }

    public String addAttachment() {
        Request createRequest = RequestRepo.addAttachment(CardId, url);
        Response createResponse=new Client().send(createRequest);
        Assert.assertEquals(createResponse.getStatusCode().intValue(),200,"invalid code");
        return createResponse.getBodyAsJson().getString("id");
    }

    public String putAttachment() {
        Request createRequest = RequestRepo.putAttachment(CardId, newUrl);
        Response createResponse=new Client().send(createRequest);
        Assert.assertEquals(createResponse.getStatusCode().intValue(),200,"invalid code");
        return createResponse.getBodyAsJson().getString("id");
    }

    public String getAttachment() {
        Request createRequest = RequestRepo.getAttachment(CardId);
        Response createResponse=new Client().send(createRequest);
        Assert.assertEquals(createResponse.getAttachment(), "https://developer.atlassian.com/cloud/trello/rest/api-group-cards/#api-cards-id-attachments-post","invalid code");
        return createResponse.getBodyAsJson().getString("attachments");
    }

    public String addLabel() {
        Request createRequest = RequestRepo.addLabel(CardId, labelType);
        Response createResponse=new Client().send(createRequest);
        Assert.assertEquals(createResponse.getStatusCode().intValue(),200,"invalid code");
        return createResponse.getBodyAsJson().getString("id");
    }
}
