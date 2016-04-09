package com.example.saemi.hackadengue.Utils;

import android.app.Activity;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;


/**
 * Created by paulo on 05/01/16.
 */
public class Preferences {

    public static String getPreferece(String key, Activity activity){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(activity);
        String resp= sharedPreferences.getString(key, "");
        return resp;
    }

    public static void savePreferences(String key, String value, Activity activity) {
        SharedPreferences sharedEndereco = PreferenceManager.getDefaultSharedPreferences(activity);
        SharedPreferences.Editor editor = sharedEndereco.edit();
        editor.putString(key, value);
        editor.commit();
    }

    public static void deleteSharedPreference(Activity activity, String key){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(activity);
        sharedPreferences.edit().remove(key).commit();
    }
}
