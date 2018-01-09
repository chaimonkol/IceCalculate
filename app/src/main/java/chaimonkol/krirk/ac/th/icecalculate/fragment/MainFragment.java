package chaimonkol.krirk.ac.th.icecalculate.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

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

//        ShowName Controller
        showNameController();

//        Calculate Controller

        calculateController();


    } // Main Method

    private void calculateController() {
        Button button = getView().findViewById(R.id.btncalculate);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.contentMainFragment, new CalculateFragment())
                        .addToBackStack(null)
                        .commit();

            }
        });
    }

    private void showNameController() {
        Button button = getView().findViewById(R.id.btnshowname);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView textView = getView().findViewById(R.id.txtshowname);
                textView.setText("ice");
            }
        });
    }

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
