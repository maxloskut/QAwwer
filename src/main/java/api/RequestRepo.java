package api;

import org.testng.annotations.Test;

public class RequestRepo {

    public static Request getPostman() {
        Request request=new Request();
        request.setProtocol("https");
        request.setHost("postman-echo.com");
        request.setPath("get");
        request.setMethod("GET");
        return request;
    }

    private final static String KEY = "bf24871cd382840b7c99eb1cb0364f77";
    private final static String TOKEN = "d80b0a71e57109e36cde177c6eb2076e75f211d2136310601355ccda71ab586f";



    public static Request createTrelloBoard(String boardName) {
        Request request=baseTrelloRequest();
        request.setPath("1/boards/?name="+boardName+"&key="+KEY +
                "&token="+TOKEN);
        request.setMethod("POST");
        request.setBody("{\"defaultLists\":false,\"name\":\"test_board1\",\"prefs_permissionLevel\"" +
                ":\"org\",\"prefs_selfJoin\":true,\"idOrganization\":\"60fefe65beb  2b76caa04761c\"}");
        return request;
    }

        public static Request AddDescriptionToCard(String cardId, String idList, String text) {
        Request request=baseTrelloRequest();
        request.setPath("1/cards/"+ cardId +"?&key="+KEY + "&token="+TOKEN + "&idList="+idList +"&desc="+text);
        request.setMethod("PUT");
        return request;
    }

    public static Request createList(String boardID, String nameList) {
        Request request=baseTrelloRequest();
        request.setPath("1/boards/"+boardID +"/lists?name="+nameList+"&key="+KEY + "&token="+TOKEN);
        request.setMethod("POST");
        return request;
    }

    public static Request createCard(String idList, String nameCard) {
        Request request=baseTrelloRequest();
        request.setPath("1/cards?&key="+KEY + "&token="+TOKEN + "&idList="+idList +"&name="+nameCard);
        request.setMethod("POST");
        return request;
    }


    public static Request inviteToBoard(String boardID, String memberEmail) {
        Request request=baseTrelloRequest();
        request.setPath("1/boards/"+boardID +"/members?&key="+KEY + "&token="+TOKEN +"&email=" +memberEmail);
        request.setMethod("PUT");
        return request;
    }



    public static Request renameBoard(String boardID, String newNameForBoard) {
        Request request=baseTrelloRequest();
        request.setPath("1/boards/" + boardID + "?&key=" + KEY + "&token=" + TOKEN +"&name=" + newNameForBoard);
        request.setMethod("PUT");
        return request;
    }


    private static Request baseTrelloRequest() {
        Request request=new Request();
        request.setProtocol("https");
        request.setHost("api.trello.com");
        return request;
    }

    public static Request deleteTrelloBoard(String boardId) {
        Request request=baseTrelloRequest();
        request.setPath("1/boards/"+boardId+"?key="+KEY +
                "&token="+TOKEN);
        request.setMethod("DELETE");
        return request;
    }

    public static Request addSticker(String cardId, String top, String left, String zIndex, String image) {
        Request request=baseTrelloRequest();
        request.setPath("1/cards/" + cardId + "/stickers?image=" + image + "&top=" + top + "&left=" + left + "&zIndex=" + zIndex + "&key=" + KEY + "&token=" + TOKEN);
        request.setMethod("POST");
        return request;
    }

    public static Request moveCardToList(String secondListId, String boardId, String idList) {
        Request request=baseTrelloRequest();
        request.setPath("1/lists/" + secondListId + "/moveAllCards?idBoard=" + boardId + "&idList=" + idList + "&key=" + KEY + "&token=" + TOKEN);
        request.setMethod("POST");
        return request;
    }

    public static Request addComment(String cardId, String commentText) {
        Request request=baseTrelloRequest();
        request.setPath("1/cards/" + cardId + "/actions/comments?text=" + commentText + "&key=" + KEY + "&token=" + TOKEN);
        request.setMethod("POST");
        return request;
    }

    public static Request addAttachment(String cardId, String url) {
        Request request=baseTrelloRequest();
        request.setPath("1/cards/" + cardId + "/attachments?key=" + KEY + "&token=" + TOKEN + "&url=" + url);
        request.setMethod("POST");
        return request;
    }

    public static Request addLabel(String cardId, String labelType) {
        Request request=baseTrelloRequest();
        request.setPath("1/cards/" + cardId + "/idLabels?key="+  KEY + "&token=" + TOKEN + "&value=" + labelType);
        request.setMethod("POST");
        return request;
    }

    public static Request getAttachment(String cardId) {
        Request request=baseTrelloRequest();
        request.setPath("1/cards/" + cardId + "?key=" + KEY + "&token=" + TOKEN + "&attachments=" + true);
        request.setMethod("GET");
        return request;
    }

    public static Request putAttachment(String cardId, String newUrl) {
        Request request=baseTrelloRequest();
        request.setPath("1/cards/" + cardId + "/attachments?key=" + KEY + "&token=" + TOKEN + "&url=" + newUrl);
        request.setMethod("PUT");
        return request;
    }
}
