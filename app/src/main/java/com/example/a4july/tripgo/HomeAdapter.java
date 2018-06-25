package com.example.a4july.tripgo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class HomeAdapter extends ArrayAdapter<Home> {
    private Context mContext;
    int mResource;
    private ImageView imgs;

    public HomeAdapter(Context context, int resource, ArrayList<Home> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String nome = getItem(position).getNome();
        String pais = getItem(position).getPais();
        String estado = getItem(position).getEstado();
        String endereco = getItem(position).getEndereco();
        String price = getItem(position).getPrice();
        String classe = getItem(position).getClasse();
        String descricao = getItem(position).getDescricao();
        String img = getItem(position).getImg();

        Home home = new Home(nome, pais, estado, endereco, price, classe, descricao, img);
        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TextView nomes = convertView.findViewById(R.id.hotelNome);
        TextView paiss = convertView.findViewById(R.id.hotelPais);
        TextView estados = convertView.findViewById(R.id.hotelEstado);
        TextView enderecos = convertView.findViewById(R.id.hotelEndereco);
        TextView prices = convertView.findViewById(R.id.hotelPrice);
        TextView classes = convertView.findViewById(R.id.hotelClasse);
        TextView descricaos = convertView.findViewById(R.id.hotelDesc);
        imgs = convertView.findViewById(R.id.hotelimg);


        nomes.setText(nome);
        paiss.setText(pais);
        estados.setText(estado);
        enderecos.setText(endereco);
        prices.setText(price);
        classes.setText(classe);
        descricaos.setText(descricao);
        loadImageFromUrl(img);


        return convertView;
    }


    private void loadImageFromUrl(String url) {
        Picasso.get().load(url).into(imgs);

    }

}
