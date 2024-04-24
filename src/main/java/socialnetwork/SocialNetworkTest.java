/*
package socialnetwork;

import java.time.LocalDateTime;
import Community;
import UserCommunity;

public class SocialNetworkTest {
    public static void main(String[] args) {

        //UserCommunityUtil util = new UserCommunityUtil();

        // создаем пользователя
        TestEmployee userBillGates = new TestEmployee("Bill",1);
        TestEmployee userMask = new TestEmployee("MaskForever",2);

        util.addUser(userBillGates);
        util.addUser(userMask);

        // БилГейтс завел в социальной сети друга Маска
        userBillGates.addFriend(userMask);
        userMask.addFriend(userBillGates);

        Message userBillGatesMessage = new Message(userBillGates,"Do You have one free ticket to Mars?",LocalDateTime.now());

        userBillGates.sendMessage(userBillGatesMessage.getText(), userBillGatesMessage.getSendTime());
        userMask.sendMessage("Do You have pirate key for Windows", LocalDateTime.now());

        userBillGatesMessage.likeMessage((userMask));

        Community community = new Community("Top-2 in the world");
        community.addMembers(userBillGates);
        community.addMembers(userMask);



    }
}
*/