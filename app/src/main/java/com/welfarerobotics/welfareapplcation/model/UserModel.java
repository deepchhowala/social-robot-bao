package com.welfarerobotics.welfareapplcation.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : Hyunwoong
 * @When : 4/3/2019 7:39 AM
 * @Homepage : https://github.com/gusdnd852
 */
public class UserModel {

    private String id;
    private String name;
    private String location;
    private ArrayList<ConversationModel> dict;
    private ArrayList<String> photo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<ConversationModel> getDict() {
        return dict;
    }

    public void setDict(ArrayList<ConversationModel> dict) {
        this.dict = dict;
    }

    public ArrayList<String> getPhoto() {
        return photo;
    }

    public void setPhoto(ArrayList<String> photo) {
        this.photo = photo;
    }
}