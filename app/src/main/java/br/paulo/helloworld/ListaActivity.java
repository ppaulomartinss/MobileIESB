package br.paulo.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class ListaActivity extends AppCompatActivity {

    private RecyclerView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        lista = (RecyclerView) findViewById(R.id.lista);
        lista.setItemAnimator(new DefaultItemAnimator());
        lista.setLayoutManager(new LinearLayoutManager(this));
    }
}
