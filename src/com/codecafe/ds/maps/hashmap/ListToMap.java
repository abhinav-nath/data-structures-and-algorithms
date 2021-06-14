package com.codecafe.ds.maps.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class User {
    int id;
    String name;
    String phone;

    public User(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", phone=" + phone + "]";
    }

}

public class ListToMap {

    public static void main(String[] args) {
        User user1 = new User(1, "user1", "100001");
        User user2 = new User(2, "user2", "100002");
        User user3 = new User(3, "user3", "100003");

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);

        Map<Integer, User> userMap = new HashMap<>();

        for (User user : users) {
            if (userMap.get(user.getId()) == null)
                userMap.put(user.getId(), user);
        }

        System.out.println("userMap : " + userMap);
    }

}