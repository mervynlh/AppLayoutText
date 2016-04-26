package com.it.lili.applayouttext.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.it.lili.applayouttext.R;

/**
 * Created by Administrator on 2016/4/26 0026.
 */
public class FragmentTwo extends Fragment {
    private static FragmentTwo instance = null;
    public static FragmentTwo newInstance(){
        if(instance == null){
            instance = new FragmentTwo();
        }
        return instance;
    }

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_two, container, false);
        TextView mTextView = (TextView) view.findViewById(R.id.fragment_tv);
        mTextView.setText("我是第二个Fragment");
        return view;
    }
}
