package com.ksr.ksrinfo;


public class indianewslist
{
    String name,description,date,photo;
    indianewslist()
    {

    }
    public indianewslist(String name, String description, String date, String photo) {
        this.name = name;
        this.description = description;
        this.date = date;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

}
