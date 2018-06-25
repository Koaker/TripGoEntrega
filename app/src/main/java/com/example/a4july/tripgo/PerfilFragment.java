package com.example.a4july.tripgo;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.a4july.tripgo.R;
import com.google.firebase.auth.FirebaseAuth;
import com.squareup.picasso.Picasso;


/**
 * A simple {@link Fragment} subclass.
 */

public class PerfilFragment extends Fragment {

    ImageView imageView;
    Button salvar;
    Button limpar;
    public PerfilFragment() {
        // Required empty public constructor
    }

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.fragment_perfil, container, false);

        imageView = rootView.findViewById(R.id.FragPhoto);
        TextView nome = rootView.findViewById(R.id.FragNome);
        TextView email = rootView.findViewById(R.id.FragEmail);
        nome.setText(FirebaseAuth.getInstance().getCurrentUser().getDisplayName());
        email.setText(FirebaseAuth.getInstance().getCurrentUser().getEmail());
        String url = FirebaseAuth.getInstance().getCurrentUser().getPhotoUrl().toString();
        loadImageFromUrl(url);

        EditText cardnome = rootView.findViewById(R.id.cardName);
        EditText cardNumber = rootView.findViewById(R.id.cardNumber);
        EditText cardsenha = rootView.findViewById(R.id.cardCVC);

        String cardname = cardnome.getText().toString().trim();
        String cardnumero = cardnome.getText().toString();
        String cardcvc = cardnome.getText().toString();





        // Inflate the layout for this fragment
        return rootView;
    }

    public void buttonOnClick(View v) {
// do something when the button is clicked
        switch(v.getId()) {
            // Just like you were doing

        }


    }

    private void loadImageFromUrl(String url) {
        Picasso.get().load(url).into(imageView);

    }




}