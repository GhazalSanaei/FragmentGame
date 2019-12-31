package com.example.fragmentgame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;

import com.example.fragmentgame.fragment.DetailFragment;
import com.example.fragmentgame.fragment.MasterFragment;
import com.example.fragmentgame.utils.TinyDB;

public class MainActivity extends AppCompatActivity implements MasterFragment.MasterListener {




    Fragment detailFragment , masterFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        masterFragment = new MasterFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.containerMaster,masterFragment).commit();
        detailFragment= DetailFragment.newInstance(-1);
        getSupportFragmentManager().beginTransaction().add(R.id.containerDetail,detailFragment).commit();
        TinyDB tinyDB = new TinyDB(this);

        tinyDB.putInt("circle" , R.drawable.circle_black);
        tinyDB.putInt("square" , R.drawable.square_black);
        tinyDB.putInt("rectangle" , R.drawable.rectangle_black);

    }

    @Override
    public void onClickListenerMaster(Integer position) {


        detailFragment = DetailFragment.newInstance(position);
        getSupportFragmentManager().beginTransaction().add(R.id.containerDetail, detailFragment).commit();

    }



}
