package com.uabc.lsc.a01128562.clase05;


import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class PortraitFragment extends Fragment {

    private PortraitFragment.OnFragmentPortraitInteractionListener mListener;
    EditText texto;

    public PortraitFragment() {
        // Required empty public constructor
    }

    public void pasarActividad(String datos){
        if(mListener!=null){
            mListener.onFragmentPortraitInteracion(datos);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_portrait, container, false);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof PortraitFragment.OnFragmentPortraitInteractionListener){
            mListener = (PortraitFragment.OnFragmentPortraitInteractionListener)context;
        }else{
            throw new RuntimeException(context.toString() + "Must implement OnFragmentInteracionListener");
        }
    }

    public interface OnFragmentPortraitInteractionListener{
        void onFragmentPortraitInteracion(String info);
    }

}
