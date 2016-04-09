package com.example.saemi.hackadengue.Utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;

/**
 * Created by paulo on 06/01/16.
 */
public class Alerts {
    private static Alerts ourInstance = new Alerts();

    public static Alerts getInstance() {
        return ourInstance;
    }

    private Alerts() {
    }

    public static void menssage(String title, String message, Activity activity){
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
               dialog.cancel();
            }
        });
        builder.setMessage(message);
        builder.setTitle(title);
        builder.create().show();
    }




//    public static void confirm(String title, String message, Activity activity){
//        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
//        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                AdicionarClienteActivity.responseCreateClient();
//                dialog.cancel();
//            }
//        });
//        builder.setMessage(message);
//        builder.setTitle(title);
//        builder.create().show();
//    }

//    public HashMap<String, String> mountDataToDelete(){
//        HashMap<String,String> params = new HashMap<>();
//        params.put("id", ClienteActivity.idCliente);
//        return params;
//    }


}
