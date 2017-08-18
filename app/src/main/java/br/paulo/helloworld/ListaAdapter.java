package br.paulo.helloworld;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Paulo on 18/08/2017.
 */

public class ListaAdapter extends RecyclerView.Adapter {

    private Context context;

    public ListaAdapter(Context context) {this.context = context;}


    @Override
    public ListaViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(context).inflate(R.layout.layout_itens_lista, parent, false);

        return new ListaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ListaViewHolder extends RecyclerView.ViewHolder {
        
        public ListaViewHolder(View v){
            super(v);
        }
    }
}
