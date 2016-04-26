package com.it.lili.applayouttext.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.it.lili.applayouttext.MyRecyclerViewAdapter;
import com.it.lili.applayouttext.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/4/26 0026.
 */
public class FragmentOne extends Fragment {

    private static FragmentOne instance = null;
    public static FragmentOne newInstance(){
        if(instance == null){
            instance = new FragmentOne();
        }
        return instance;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_one, container, false);
        RecyclerView recyclerView = (RecyclerView)view.findViewById(R.id.recyclerView);
        StaggeredGridLayoutManager gridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        List<Integer> datas = new ArrayList<>();
        for(int i = 0 ;i < 100 ;i ++){
            datas.add(i);
        }
        recyclerView.setAdapter(new MyRecyclerViewAdapter(getActivity(),datas));
        return view;
    }

}
