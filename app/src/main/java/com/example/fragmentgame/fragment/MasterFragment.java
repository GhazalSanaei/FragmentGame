package com.example.fragmentgame.fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


import com.example.fragmentgame.R;
import com.example.fragmentgame.utils.TinyDB;
import com.example.fragmentgame.adapter.Adapter;

import java.util.ArrayList;
import java.util.List;


public class MasterFragment extends Fragment {


    public interface MasterListener{
        void onClickListenerMaster(Integer position);
    }

    MasterListener listener;

    GridView gridView;
    Adapter adapter;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof MasterListener ){
            listener = (MasterListener) context;}
        else {

            getActivity().finish();
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_master, container, false);

        gridView = view.findViewById(R.id.gridView);

        List<Integer> list = new ArrayList<>();
        list.add(R.drawable.circle_blue);
        Log.d("circle blue" , R.drawable.circle_blue +"");
        list.add(R.drawable.circle_green);
        list.add(R.drawable.circle_red);
        list.add(R.drawable.circle_yellow);
        list.add(R.drawable.circle_orange);
        list.add(R.drawable.square_blue);
        list.add(R.drawable.square_red);
        list.add(R.drawable.square_green);
        list.add(R.drawable.square_yellow);
        list.add(R.drawable.square_orange);
        list.add(R.drawable.rectangle_blue);
        list.add(R.drawable.rectangle_red);
        list.add(R.drawable.rectangle_green);
        list.add(R.drawable.rectangle_yellow);
        list.add(R.drawable.rectangle_orange);

        adapter = new Adapter(getContext() , list);
        gridView.setAdapter( adapter);


  gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


            TinyDB tinyDB = new TinyDB(getContext());
            switch (i){
                case 0: {
                    listener.onClickListenerMaster(0);
                    tinyDB.putInt("circle",R.drawable.circle_blue);
                    break;
                }
                case 1: {
                    listener.onClickListenerMaster(1);
                    tinyDB.putInt("circle",R.drawable.circle_green);
                    break;
                }
                case 2: {
                    listener.onClickListenerMaster(2);
                    tinyDB.putInt("circle",R.drawable.circle_red);
                    break;
                }
                case 3: {
                    listener.onClickListenerMaster(3);
                    tinyDB.putInt("circle",R.drawable.circle_yellow);
                    break;
                }
                case 4: {
                    listener.onClickListenerMaster(4);
                    tinyDB.putInt("circle",R.drawable.circle_orange);
                    break;
                }
                case 5: {
                    listener.onClickListenerMaster(5);
                    tinyDB.putInt("square",R.drawable.square_blue);
                    break;
                }
                case 6: {
                    listener.onClickListenerMaster(6);
                   tinyDB.putInt("square",R.drawable.square_red);
                    break;
                }case 7: {
                    listener.onClickListenerMaster(7);
                    tinyDB.putInt("square",R.drawable.square_green);
                    break;
                }case 8: {
                    listener.onClickListenerMaster(8);
                    tinyDB.putInt("square",R.drawable.square_yellow);
                    break;
                }case 9: {
                    listener.onClickListenerMaster(9);
                    tinyDB.putInt("square",R.drawable.square_orange);
                    break;
                }
                case 10: {
                    listener.onClickListenerMaster(10);
                    tinyDB.putInt("rectangle",R.drawable.rectangle_blue);
                    break;
                }
                case 11: {
                    listener.onClickListenerMaster(11);
                    tinyDB.putInt("rectangle",R.drawable.rectangle_red);
                    break;
                }
                case 12: {
                    listener.onClickListenerMaster(12);
                   tinyDB.putInt("rectangle",R.drawable.rectangle_green);
                    break;
                }
                case 13: {
                    listener.onClickListenerMaster(13);
                    tinyDB.putInt("rectangle",R.drawable.rectangle_yellow);
                    break;
                }case 14: {
                    listener.onClickListenerMaster(14);
                    tinyDB.putInt("rectangle",R.drawable.rectangle_orange);
                    break;
                }
            }
        }
    });

        return view;
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        listener=null;
    }
}
