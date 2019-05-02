package com.trab.android.chat.chatandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CadastroSalaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_sala);
    }

    public void cadastrar(View view) {
        Intent it = new Intent(CadastroSalaActivity.this, ChatActivity.class);
        startActivity(it);
    }
}
