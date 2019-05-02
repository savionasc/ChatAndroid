package com.trab.android.chat.chatandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ChatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
    }

    public void localizacao(View view) {
        Intent it = new Intent(ChatActivity.this, LocalizacaoActivity.class);
        startActivity(it);
    }

}
