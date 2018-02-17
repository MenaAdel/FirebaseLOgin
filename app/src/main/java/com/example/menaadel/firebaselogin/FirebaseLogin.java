package com.example.menaadel.firebaselogin;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by MenaAdel on 2/14/2018.
 */

public class FirebaseLogin extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);
    }
}
