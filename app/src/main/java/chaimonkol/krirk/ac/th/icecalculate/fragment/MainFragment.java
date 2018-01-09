package chaimonkol.krirk.ac.th.icecalculate.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import chaimonkol.krirk.ac.th.icecalculate.MainActivity;
import chaimonkol.krirk.ac.th.icecalculate.R;

/**
 * Created by acer on 9/1/2561.
 */

public class MainFragment extends Fragment{

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Create Toolber
        createToolber();


    } // Main Method

    private void createToolber() {

        Toolbar toolbar = getView().findViewById(R.id.toolberMain);
        ((MainActivity)getActivity()).setSupportActionBar(toolbar);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    }
}    //Main Class
