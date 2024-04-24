/*
package socialnetwork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class UserCommunity {

    private HashMap<Integer, TestEmployee> allUsers = new HashMap<>();
    private HashMap<String,Community> allCommunity = new HashMap<>();
    public ArrayList<TestEmployee> findUser = new ArrayList<>();

    public void addUser(TestEmployee user){
        allUsers.put(user.getId(), user);
    }

    public void addCommunity(Community community){
        allCommunity.put(community.getName(), community);
    }

    public HashMap<Integer, TestEmployee> getAllUsers() {
        return allUsers;
    }

    public HashMap<String, Community> getAllCommunity() {
        return allCommunity;
    }

    public void setAllUsers(HashMap<Integer, TestEmployee> allUsers) {
        this.allUsers = allUsers;
    }

    public void setAllCommunity(HashMap<String, Community> allCommunity) {
        this.allCommunity = allCommunity;
    }

  /*
    // метод поиска пользователя по имени от Веры
    public static ArrayList<TestEmployee> findUser(String, userName) {
        ArrayList<TestEmployee> userArrayList = new ArrayList<>();
        for (TestEmployee user : all.values()) {
            if(user.getName().equalsIgnoreCase())
        }

    }  */


