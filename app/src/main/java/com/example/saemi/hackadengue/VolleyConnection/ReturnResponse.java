package com.example.saemi.hackadengue.VolleyConnection;

import android.app.Activity;

/**
 * Created by paulo on 09/04/16.
 */
public class ReturnResponse {
    public static String login;
    public static String password;

    private static ReturnResponse ourInstance = new ReturnResponse();

    public static ReturnResponse getInstance() {
        return ourInstance;
    }

    private ReturnResponse() {
    }

    public void goTo(String whoCalled, String response, Activity activity){
        if (whoCalled.equals("login")){
            
        }


    }


}
