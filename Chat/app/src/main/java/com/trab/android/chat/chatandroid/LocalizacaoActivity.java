package com.trab.android.chat.chatandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LocalizacaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_localizacao);
    }

    public void voltar(View view) {
        Intent it = new Intent(LocalizacaoActivity.this, ChatActivity.class);
        startActivity(it);
    }
}
