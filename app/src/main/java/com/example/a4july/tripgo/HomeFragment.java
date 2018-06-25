package com.example.a4july.tripgo;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import com.example.a4july.tripgo.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private ListView ListHome;
    private HomeAdapter adapter;
    Context mcontext;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        setHasOptionsMenu(true);
        ListHome = (ListView) rootView.findViewById(R.id.listHome);

        Home hotel1 = new Home("Azura Hotel",
                "Brasil",
                "Rio Grande do Sul, poa",
                "Beco da 7 facadas",
                "300", "luxuosa",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent venenatis augue id hendrerit \tvolutpat. Curabitur euismod congue magna ac placerat. Nullam rhoncus quam non sem convallis aliquet. Proin at augue \tblandit, ultricies purus sed, dapibus ligula. Quisque blandit metus non dolor volutpat mattis.",
                "https://res.cloudinary.com/simplotel/image/upload/x_0,y_82,w_1571,h_883,r_0,c_crop,q_60,fl_progressive/w_960,f_auto,c_fit/vits-shalimar-hotel-ankleshwar/IMG_1451_Large_skvfnw");

        Home hotel2 = new Home("Azura Hotel",
                "Brasil",
                "Rio Grande do Sul, Porto Alegre",
                "Beco da 7 facadas",
                "150", "comum",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent venenatis augue id hendrerit \tvolutpat. Curabitur euismod congue magna ac placerat. Nullam rhoncus quam non sem convallis aliquet. Proin at augue \tblandit, ultricies purus sed, dapibus ligula. Quisque blandit metus non dolor volutpat mattis.",
                "https://media-cdn.tripadvisor.com/media/photo-s/06/eb/1b/55/apt-409-hotel-simples.jpg");


        Home hotel3 = new Home("Namaste Hote",
                "Iraque",
                "Bagdá",
                "Bagdá city , 234",
                "20", "comum",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent venenatis augue id hendrerit \tvolutpat. Curabitur euismod congue magna ac placerat. Nullam rhoncus quam non sem convallis aliquet. Proin at augue \tblandit, ultricies purus sed, dapibus ligula. Quisque blandit metus non dolor volutpat mattis.",
                "https://www.matraqueando.com.br/wp-content/uploads/2012/10/Hospedagem-economica-Sao-Luis-Hotel-Soft-Inn-cafe-da-manha-cama.jpg");


        Home hotel4 = new Home("Senegal Hotel Station",
                "Senegal",
                "Senegales",
                "Gen.Albuquerque ,243",
                "150", "luxuosa",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent venenatis augue id hendrerit \tvolutpat. Curabitur euismod congue magna ac placerat. Nullam rhoncus quam non sem convallis aliquet. Proin at augue \tblandit, ultricies purus sed, dapibus ligula. Quisque blandit metus non dolor volutpat mattis.",
                "https://c7.quickcachr.fotos.sapo.pt/i/B22078e6d/10077086_8OZAa.jpeg");


        Home hotel5 = new Home("Russian Vodka Hotel Drink Experience",
                "Russia",
                "Stralingrado",
                "Passing the dead germans at the right side",
                "700", "Super Luxu",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent venenatis augue id hendrerit \tvolutpat. Curabitur euismod congue magna ac placerat. Nullam rhoncus quam non sem convallis aliquet. Proin at augue \tblandit, ultricies purus sed, dapibus ligula. Quisque blandit metus non dolor volutpat mattis.",
                "https://c1.staticflickr.com/8/7608/17123709491_8f60ea24c1_b.jpg");


        ArrayList<Home> homelist = new ArrayList<>();
        homelist.add(hotel1);
        homelist.add(hotel2);
        homelist.add(hotel3);
        homelist.add(hotel4);
        homelist.add(hotel5);

        mcontext = getContext();

        adapter = new HomeAdapter(mcontext, R.layout.home_list_sobre, homelist);

        ListHome.setAdapter(adapter);


        // Inflate the layout for this fragment
        return rootView;
    }

}



       /* Tentativa de fazer o Retrofit funcionar, funcionou porém estavamos usando API do walmart para simular apenas, não conseguimos uma API de hotel, porém houveram problemas
       Então fizemos um fake commerce, mas a chamada estava funcionando, apenas na hora de pegar os dados não estavamos conseguindo pegar info dentro do bracket...

       Retrofit retrofit = new Retrofit.Builder()

                .baseUrl("http://api.walmartlabs.com/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        WalmartService service = retrofit.create(WalmartService.class);

        Call<Product> call = service.listProduct();



        call.enqueue(new Callback<Product>() {
            @Override
            public void onResponse(Call<Product> call, Response<Product> response) {

            }

            @Override
            public void onFailure(Call<Product> call, Throwable t) {

            }
        }); */