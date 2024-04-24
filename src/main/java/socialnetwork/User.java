package socialnetwork;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class User {
    private String name;
    private int id;
    private HashSet<User> friends;
    private ArrayList<Message> messages = new ArrayList<>();

    public User(String name, int id, HashSet<User> friends) {
        this.name = name;
        this.id = id;
        this.friends = new HashSet<>();
    }

        public void addFriend(User friend){
        friends.add(friend);
        }
        public void removeFriend(User friendToRemove) {
            friends.remove(friendToRemove);
        }

        public void sendMessage(String messagetext, LocalDateTime sendTime){
        messages.add(new Message(this,messagetext,sendTime));
        }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public HashSet<User> getFriends() {
        return friends;
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFriends(HashSet<User> friends) {
        this.friends = friends;
    }

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        return "TestEmployee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
