package com.bridgelabz.program.myfirstspringapp.controller;

import com.bridgelabz.program.myfirstspringapp.module.UserFullName;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
@Configuration
public class UserName {

    private static List<UserFullName> loadUserFullNameFromDb(){
        List<UserFullName> userObject=new ArrayList<UserFullName>();
        userObject.add(new UserFullName("Deep","Gondhule"));
        userObject.add(new UserFullName("Deepak","dhule"));
        userObject.add(new UserFullName("Prakash","Gond"));
        userObject.add(new UserFullName("Ram","NathSingh"));
        return userObject;
    }
    private List<UserFullName> users=loadUserFullNameFromDb();
    List<UserFullName> getAllUserFullNames(){
        return users;
    }

    int resourceFound=0;
    public String updateItem(UserFullName user) {
        for(UserFullName currentUser:users){
            if(currentUser.getFirstName()==user.getFirstName() ){
                resourceFound++;
                currentUser.setFirstName(user.firstName);
                currentUser.setLastName(user.lastName);
            }
        }
        if(resourceFound<1){
            users.add(user);
            return "Name Successfully Added" ;
        }
        return "Name successfully Updated";
    }
}
