/*
package homework24myversion;

import java.util.ArrayList;
import java.util.HashSet;

public class Message {
    private ArrayList<TestEmployee> sender;
    private String textOfMessage;
    private String timeOfSending;

    //список всех пользователей, кто поставил лайк
    private static HashSet<TestEmployee> allUsersWhoLikeMessage = new HashSet<>();


    public Message(ArrayList<TestEmployee> sender, String textOfMessage, String timeOfSending, HashSet<TestEmployee> allUsersWhoLikeMessage) {
        this.sender = sender;
        this.textOfMessage = textOfMessage;
        this.timeOfSending = timeOfSending;
        this.allUsersWhoLikeMessage = allUsersWhoLikeMessage;
    }

    public ArrayList<TestEmployee> getSender() {
        return sender;
    }

    public String getTextOfMessage() {
        return textOfMessage;
    }

    public String getTimeOfSending() {
        return timeOfSending;
    }

    public HashSet<TestEmployee> allUsersWhoLikeMessage() {
        return allUsersWhoLikeMessage;
    }

    public void setSender(ArrayList<TestEmployee> sender) {
        this.sender = sender;
    }

    public void setTextOfMessage(String textOfMessage) {
        this.textOfMessage = textOfMessage;
    }

    public void setTimeOfSending(String timeOfSending) {
        this.timeOfSending = timeOfSending;
    }

    public void setTimeOfSending(HashSet<TestEmployee> allUsersWhoLikeMessage) {
        this.allUsersWhoLikeMessage = allUsersWhoLikeMessage;
    }


    @Override
    public String toString() {
        return "Message{" +
                ", sender='" + sender + '\'' +
                ", textOfMessage='" + textOfMessage + '\'' +
                ", timeOfSending='" + timeOfSending + '\'' +
                ", allUsersWhoLikeMessage='" + allUsersWhoLikeMessage + '\'' +
                '}';
    }
}
    //ставим лайк
    /*  public static void putLike(HashSet<TestEmployee> userLikeMessage){

    } */

