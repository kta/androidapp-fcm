package com.example.sakakibara_tetsu.push;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ここでタグの設定をする。 このタグに対してメッセージを送るので、iOS, Android, AdndroidPlusとそれぞれ設定すると良いかも
        FirebaseMessaging.getInstance().subscribeToTopic("Android");
        // ここでタグの設定をする。 アプリ全体にもメッセージを送りたい場合のために、共通するタグの設定も行う
        FirebaseMessaging.getInstance().subscribeToTopic("app");
    }
}
