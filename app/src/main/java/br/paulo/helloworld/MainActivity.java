package br.paulo.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editNome;
    EditText editEmail;
    EditText editSenha;
    EditText editConfirmarSenha;
    Button btnConfirmar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNome = (EditText) findViewById(R.id.editNome);
        editEmail = (EditText) findViewById(R.id.editEmail);
        editSenha = (EditText) findViewById(R.id.editSenha);
        editConfirmarSenha = (EditText) findViewById(R.id.editConfirmarSenha);
        btnConfirmar = (Button) findViewById(R.id.btnConfirmar);

        btnConfirmar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                /*if(editNome.getText().length()==0 || editEmail.getText().length()==0) {
                    Toast.makeText(getApplication(), "Preencha todos os campos", Toast.LENGTH_LONG).show();*/

                if(editNome.getText().toString().length()==0){
                    editNome.setError("Digite o seu nome!");

                }
                if(editEmail.getText().toString().length()==0) {
                    editEmail.setError("Digite o seu E-mail!");
                }

                if(editSenha.getText().toString().length()==0) {
                    editSenha.setError("Digite sua senha!");
                }

                if(editConfirmarSenha.getText().toString().length()==0){
                    editConfirmarSenha.setError("Confirme sua senha!");

                }else{
                    Toast.makeText(getApplication(),
                            "Cadastro realizado com sucesso " +editNome.getText().toString()+"!", Toast.LENGTH_LONG).show();

                    //Limpando os dados

                }
            }

        });
    }

    public void mostrarMensagem(View parametro){
        Toast.makeText(this, "TESTE DE TEXTO NO TOAST", Toast.LENGTH_LONG).show();
    }

    public void mostrarTelaLogin(View parametro){
        Intent it = new Intent(this, LoginActivity.class);
        startActivity(it);
    }

}
