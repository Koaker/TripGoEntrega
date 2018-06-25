package com.example.a4july.tripgo;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class SobreFragment extends Fragment {
    Context mcontext;
    private ListView ListSobre;

    public SobreFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_sobre, container, false);
        //Criando listview
        ListSobre = (ListView) rootView.findViewById(R.id.ListSobre);



        Sobre projeto = new Sobre("Nome do Projeto:","Trip.GO");
        Sobre versao = new Sobre("Versão do aplicativo:","1.0");
        Sobre alunos = new Sobre("Alunos:","Rafael Montedo && Wesley Magalhães");
        Sobre faculdade = new Sobre("Instituição de Ensino:","FADERGS - Faculdade de Desenvolvimento do Rio Grande do Sul");
        Sobre curso = new Sobre("Disciplina Cursada:","Computação para Dispositivos Móveis");


        ArrayList<Sobre> sobrelist = new ArrayList<>();
        sobrelist.add(projeto);
        sobrelist.add(versao);
        sobrelist.add(alunos);
        sobrelist.add(faculdade);
        sobrelist.add(curso);

        mcontext = getContext();

        SobreAdapter adapter = new SobreAdapter(mcontext, R.layout.item_list_sobre, sobrelist);
        ListSobre.setAdapter(adapter);
        return rootView;
    }


}
