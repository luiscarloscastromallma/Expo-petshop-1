package com.example.alumno.myapplication.models;

import java.util.ArrayList;

public class UserGroup {
    int id;
    int userId;
    int groupId;

    public UserGroup(int _id, int _userId, int _groupId) {
        //Constructor
        this.id = _id;
        this.userId = _userId;
    }

    public ArrayList getData() {
        ArrayList<UserGroup> list = new ArrayList<UserGroup>();
        list.add(new UserGroup(1, 1,  1));
        list.add(new UserGroup(1, 1,  1));

        return list;
    }
}