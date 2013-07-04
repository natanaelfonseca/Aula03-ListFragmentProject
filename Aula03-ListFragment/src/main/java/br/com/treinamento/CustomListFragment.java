package br.com.treinamento;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by natanaelfonseca on 10/06/13.
 */
public class CustomListFragment extends ListFragment {

    String[] nomes = new String[]{"Joao","Maria", "Jose", "Pedro", "Paulo", "Paula", "Raoni", "Andre", "Enzo", "Alex", "Natanael"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate( R.layout.list_fragment, container, false );
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter( new ArrayAdapter<String>( getActivity(), android.R.layout.simple_list_item_1, nomes ));
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {

        super.onListItemClick(l, v, position, id);

        Toast.makeText( getActivity(), "Voce selecionou  -" + nomes[position], Toast.LENGTH_SHORT );

    }
}
