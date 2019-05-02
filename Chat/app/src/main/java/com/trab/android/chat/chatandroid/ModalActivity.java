package com.trab.android.chat.chatandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ModalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modal);
    }


    public void cadastre(View view) {
        Intent it = new Intent(ModalActivity.this, CadastroSalaActivity.class);
        startActivity(it);
    }

    public void cancelar(View view) {
        Intent it = new Intent(ModalActivity.this, MainActivity.class);
        startActivity(it);
    }
}
