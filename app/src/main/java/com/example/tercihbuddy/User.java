package com.example.tercihbuddy;

import java.util.List;

public class User {

    public String username, email, pid ;
    public List<String> tercih_listesi_list;

    public User(){

    }
    public User (String username, String email, String pid, List<String> Stringtercih_listesi_list ){
        this.username = username;
        this.pid = pid;
        this.email = email;
        this.tercih_listesi_list = tercih_listesi_list;
    }


}
