/*
Пользователи и Друзья (Использование ArrayList и HashSet):
        Создайте класс TestEmployee, который должен содержать
        информацию о пользователе: имя (String),
        уникальный идентификатор (int), и список друзей
        (используйте HashSet для хранения объектов TestEmployee,
        представляющих друзей пользователя).


package homework24;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class TestEmployee {

    private String name;
    private int id;
    private HashSet<TestEmployee> friends = new HashSet<>();
    private ArrayList<Message> listMessage =  new ArrayList<>(); // список сообщений

    public TestEmployee(ArrayList<Message> listMessage) {
        this.listMessage = listMessage;
    }

    public ArrayList<Message> getListMessage() {
        return listMessage;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public HashSet<TestEmployee> getFriends() {
        return friends;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFriends(HashSet<TestEmployee> friends) {
        this.friends = friends;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestEmployee user = (TestEmployee) o;
        return id == user.id && Objects.equals(name, user.name) && Objects.equals(friends, user.friends);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String TestEmployee(String name, int id) {
        this.name = name;
        this.id = id;

        @Override
        public String toString () {

            String username = "Имя: " + name + "\n";
            String userId = "ID: " + id + "\n";
            String delimiterFriends = "-------Friends---------\n";
            String delimiterUser = "--------TestEmployee-----------\n";
            String delimiterUnder = "-----------------------\n";

            String userFriends = "";
            if (!friends.isEmpty()) {
                for (TestEmployee user : friends) {
                    userFriends += user.getName() + "\n";
                }
            } else {
                userFriends = "No friends yet!\n";
            }
            return delimiterUser + username + userId + delimiterFriends + userFriends + delimiterUnder;
        }
    }

    //метод для добавления и удаления друзей пользователя

    public void addNewFriend (TestEmployee friend){
        if (friend == null) {
            System.out.println("Не смогли добавить пользователя" + friend.getName() + " в друзья.");
        }
    } else{
        boolean isAdded = friends.add(friend);
        if (isAdded) {
            System.out.println("Добавлен");
        } else {
            System.out.println(("Не дообавлен"));
        }
    }
}

public void removeFriend(TestEmployee friend){
    //если пользователя нет в друзьях, то надо указать, что он не удалился
    boolean isRemoved = friends.remove(friend);
}

public void addlikeInMessage(TestEmployee user){
    if(user==null){
        System.out.println("Юзер пустой");
    }else {
        likes.add(user);
    }
}

//лайк сообщения
public void addlikeToMessage int index,TestEmployee user){ //этот метод мы будем вызывать в MAIN-е
        if(listMessages.

siz()index+1){
        System.out.

println("Сообщения с индексом" + index + " нет в списке сообщений");
        }else
        {
        for(Message mes:listMessages){
        if(getIndex() ==index){
        if(mes.Likes().contains(user)){
        System.out.println(user.getName() + " ,вы уже лайкнули это сообщение!");
        }




        //addLikeInMessage(user);
}
}
}
}
}
 */


