/*
package homework24myversion;

import java.util.ArrayList;
import java.util.HashSet;


public class TestEmployee {
    private static String userName;
    private static int userId;

  // тут будет храниться весь список друзей из задания 1
    private static HashSet<TestEmployee> listOfFriends = new HashSet<>();

    //список сообщений, отправленных пользователем из задания 2
    private static ArrayList<Message> listOfMessages= new ArrayList<>();


    public TestEmployee(String userName, int userId, HashSet<TestEmployee> listOfFriends,ArrayList<Message> listOfMessages) {
        this.userName = userName;
        this.userId = userId;
        this.listOfFriends = listOfFriends;
        this.listOfMessages = listOfMessages;
    }


    public String getUserName() {
        return userName;
    }

    public int getUserId() {
        return userId;
    }

    public HashSet<TestEmployee> getAllUsersInfo() {
        return listOfFriends;
    }

    public ArrayList<Message> getListOfMessages() {
        return listOfMessages;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setAllUsersInfo(ArrayList<TestEmployee> allUsersInfo) {
        this.listOfFriends = listOfFriends;
    }

    public void setListOfMessages(ArrayList<Message> listOfMessages) {
        this.listOfMessages = listOfMessages;
    }


    // добавление нового друга пользователя
    public static void addNewUser(HashSet<TestEmployee> listOfFriends,String newUserName, int newUserId) {
        listOfFriends.add(new TestEmployee( newUserName, newUserId,listOfFriends,listOfMessages));
        System.out.println("Был добавлен новый пользователь: " + newUserName);
    }



    // добавление нового сообщения
    public static void addNewMessage(ArrayList<Message> listOfMessages) {
        listOfMessages.add(new ArrayList<Message>(listOfMessages));
        System.out.println("Было добавлено новое сообщение: " + listOfMessages);
    }

    //удаление по имени
    public static void removeUserByName(String userToDelete,HashSet<TestEmployee> listOfFriends) {
        boolean isName = false;
        for (int i = 0; i < listOfFriends.size(); i++) {
            if (userToDelete.equals(listOfFriends)) {
                listOfFriends.remove(i);
                System.out.println("Мы удалили " + userToDelete + ".");
                isName = true;
            }
            if (!isName) {
                System.out.println("Покупка " + userToDelete + " не найдено!");
            }
        }
    }

    //удаление по id
    public static void removeUserById(int idToDelete,HashSet<TestEmployee> listOfFriends) {
        boolean isId = false;
        for (int i = 0; i < listOfFriends.size(); i++) {
            if (isId) {
                System.out.println("Запись " + idToDelete + " не найдено!");
            } else {
                if (idToDelete == listOfFriends) {
                    System.out.println("Запись с id=" + idToDelete + " удалена.");
                    isId = true;
                }
            }
        }
    }


    // добавляем пользователей
    public static void addFriend (HashSet <TestEmployee> newFriend){
        listOfFriends.add(newFriend);
        System.out.println("Добавлен новый ДРУГ: " + newFriend);
    }

    // удаляем пользователей
    public static void deleteFriend (HashSet <TestEmployee> friendToDelete){
        listOfFriends.remove(friendToDelete);
        System.out.println("Удален ДРУГ: " + friendToDelete);
    }
}


// используем HashSet<> для хранения списка друзей
// используем Array list для хранения имени и id


//ListOfFriens() listOfFriends = new listOfFriends ();



*/
