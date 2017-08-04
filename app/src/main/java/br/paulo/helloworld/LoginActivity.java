package br.paulo.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("TESTE", "Passando pelo onRestart...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TESTE", "Passando pelo onResume...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TESTE", "Passando pelo onPause...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TESTE", "Passando pelo onStop...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TESTE", "Passando pelo onDestroy...");
    }

    public void mostrarTelaCadastro(View parametro){
        Intent it = new Intent(this, MainActivity.class);
        startActivity(it);
    }

    public void efetuarLogin(View parametro){
        Toast.makeText(this, "TESTE DE BOTÃO", Toast.LENGTH_LONG).show();
    }
}
