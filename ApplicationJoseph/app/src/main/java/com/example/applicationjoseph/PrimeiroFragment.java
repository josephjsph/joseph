package com.example.applicationjoseph;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class PrimeiroFragment extends Fragment {


    public PrimeiroFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // obter a view do fragmento
        View view = inflater.inflate(R.layout.fragment_primeiro , container, false);
        // linkar com o componente da view
        Button b = (Button) view.findViewById(R.id.btnFragmento);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // o contexto é obtido de forma diferente
                Toast.makeText(getActivity().getApplicationContext(),
                        "Estou no fragmento!!!",
                        Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}