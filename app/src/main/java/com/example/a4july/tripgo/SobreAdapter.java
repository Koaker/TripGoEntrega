package com.example.a4july.tripgo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SobreAdapter extends ArrayAdapter<Sobre>{

    private Context mContext;
    int mResource;


    public SobreAdapter(Context context, int resource, ArrayList<Sobre> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String titulo = getItem(position).getTitulo();
        String reposta = getItem(position).getResposta();

        Sobre sobre = new Sobre(titulo,reposta);
        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TextView title = (TextView) convertView.findViewById(R.id.TituloSobre);
        TextView resp = (TextView) convertView.findViewById(R.id.RespSobre);

        title.setText(titulo);
        resp.setText(reposta);
        return convertView;
    }
}
