/*
Сообщения (Использование ArrayList):
        Создайте класс Message, который содержит
        информацию о сообщении: отправитель (TestEmployee),
        текст сообщения (String), и время отправки (LocalDateTime).
        В классе TestEmployee, добавьте поле, которое будет хранить
        список сообщений (ArrayList<Message>),
        отправленных пользователем.
 */
/*
package homework24;

import java.util.HashSet;

public class Message {
    // отправитель (класс TestEmployee)
    private TestEmployee sender;
    private String messageText;
    private String time;
    private int index;
    HashSet<TestEmployee> likes = new HashSet<>();


    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Message(TestEmployee sender, String messageText, String time) {
        this.sender = sender;
        this.messageText = messageText;
        this.time = time;
    }

    public TestEmployee getSender() {
        return sender;
    }

    public String getMessageText() {
        return messageText;
    }

    public String getTime() {
        return time;
    }

    public void setSender(TestEmployee sender) {
        this.sender = sender;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public HashSet<TestEmployee> getLikes() {
        return likes;
    }

    @Override
    public String toString() {
        String message = "-----------------------------\n";
        message += time + "\n" + text + "\n";
        message +=".............................\n";
    /*    if (!likes.isEmpty()) {
            Iterator<TestEmployee> iterator = likes.iterator();
            while (iterator.hasNext()) {
                TestEmployee user = iterator.next();
                message += "\uD83D\uDC96 " + user.getName()+ "\n";
            }
        }
        else{
            message += "\uD83D\uDC94 Пока никто не лайкнул\n";
        }
        message += "-----------------------------\n";
        return message;
    }

}

*/
