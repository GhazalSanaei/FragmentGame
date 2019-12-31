package com.example.fragmentgame.fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.fragmentgame.R;
import com.example.fragmentgame.utils.TinyDB;

public class DetailFragment extends Fragment {
private static final String KEY_ID = "id";
ImageView imageViewCircle , imageViewRectangle , imageViewSquare;
    TinyDB tinyDB ;
    public int value;

    public static DetailFragment newInstance(int position ){
        DetailFragment detailFragment = new DetailFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(KEY_ID,position);
        detailFragment.setArguments(bundle);
        return detailFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detail, container, false);

        tinyDB = new TinyDB(getActivity());

        imageViewCircle = view.findViewById(R.id.imageViewCircle);
        imageViewRectangle = view.findViewById(R.id.imageViewRectangle);
        imageViewSquare = view.findViewById(R.id.imageViewSquare);

        if(getArguments() != null){


            Integer id = getArguments().getInt(KEY_ID);

            switch (id){

                case 0 :
                {
                    imageViewCircle.setImageResource(R.drawable.circle_blue);
                    imageViewSquare.setImageResource(tinyDB.getInt("square"));
                    imageViewRectangle.setImageResource(tinyDB.getInt("rectangle"));
                    tinyDB.putInt("circle",R.drawable.circle_blue);
                    break;

                }
                case 1:
                {
                    imageViewCircle.setImageResource(R.drawable.circle_green);
                    imageViewSquare.setImageResource(tinyDB.getInt("square"));
                    imageViewRectangle.setImageResource(tinyDB.getInt("rectangle"));
                    tinyDB.putInt("circle",R.drawable.circle_green);
                    break;
                }
                case 2:
                {
                    imageViewCircle.setImageResource(R.drawable.circle_red);
                    imageViewSquare.setImageResource(tinyDB.getInt("square"));
                    imageViewRectangle.setImageResource(tinyDB.getInt("rectangle"));
                    tinyDB.putInt("circle",R.drawable.circle_red);
                    break;
                }
                case 3:
                {
                    imageViewCircle.setImageResource(R.drawable.circle_yellow);
                    imageViewSquare.setImageResource(tinyDB.getInt("square"));
                    imageViewRectangle.setImageResource(tinyDB.getInt("rectangle"));
                    tinyDB.putInt("circle",R.drawable.circle_yellow);
                    break;
                }
                case 4:
                {
                    imageViewCircle.setImageResource(R.drawable.circle_orange);
                    imageViewSquare.setImageResource(tinyDB.getInt("square"));
                    imageViewRectangle.setImageResource(tinyDB.getInt("rectangle"));
                    tinyDB.putInt("circle",R.drawable.circle_orange);
                    break;
                }
                case 5:
                {
                    imageViewSquare.setImageResource(R.drawable.square_blue);
                    imageViewCircle.setImageResource(tinyDB.getInt("circle"));
                    imageViewRectangle.setImageResource(tinyDB.getInt("rectangle"));
                    tinyDB.putInt("square",R.drawable.square_blue);
                    break;
                }
                case 6:
                {
                    imageViewSquare.setImageResource(R.drawable.square_red);
                    imageViewCircle.setImageResource(tinyDB.getInt("circle"));
                    imageViewRectangle.setImageResource(tinyDB.getInt("rectangle"));
                    tinyDB.putInt("square",R.drawable.square_red);
                    break;
                }
                case 7:
                {
                    imageViewSquare.setImageResource(R.drawable.square_green);
                    imageViewCircle.setImageResource(tinyDB.getInt("circle"));
                    imageViewRectangle.setImageResource(tinyDB.getInt("rectangle"));
                    tinyDB.putInt("square",R.drawable.square_green);
                    break;
                }
                case 8:
                {
                    imageViewSquare.setImageResource(R.drawable.square_yellow);
                    imageViewCircle.setImageResource(tinyDB.getInt("circle"));
                    imageViewRectangle.setImageResource(tinyDB.getInt("rectangle"));
                    tinyDB.putInt("square",R.drawable.square_yellow);
                    break;
                }
                case 9:
                {
                    imageViewSquare.setImageResource(R.drawable.square_orange);
                    imageViewCircle.setImageResource(tinyDB.getInt("circle"));
                    imageViewRectangle.setImageResource(tinyDB.getInt("rectangle"));
                    tinyDB.putInt("square",R.drawable.square_orange);
                    break;
                }
                case 10:
                {
                    imageViewRectangle.setImageResource(R.drawable.rectangle_blue);
                    imageViewCircle.setImageResource(tinyDB.getInt("circle"));
                    imageViewSquare.setImageResource(tinyDB.getInt("square"));
                    tinyDB.putInt("rectangle",R.drawable.rectangle_blue);
                    break;
                }case 11:
                {
                    imageViewRectangle.setImageResource(R.drawable.rectangle_red);
                    imageViewCircle.setImageResource(tinyDB.getInt("circle"));
                    imageViewSquare.setImageResource(tinyDB.getInt("square"));
                    tinyDB.putInt("rectangle",R.drawable.rectangle_red);
                    break;
                }case 12:
                {
                    imageViewRectangle.setImageResource(R.drawable.rectangle_green);
                    imageViewCircle.setImageResource(tinyDB.getInt("circle"));
                    imageViewSquare.setImageResource(tinyDB.getInt("square"));
                    tinyDB.putInt("rectangle",R.drawable.rectangle_green);
                    break;
                }case 13:
                {
                    imageViewRectangle.setImageResource(R.drawable.rectangle_yellow);
                    imageViewCircle.setImageResource(tinyDB.getInt("circle"));
                    imageViewSquare.setImageResource(tinyDB.getInt("square"));
                    tinyDB.putInt("rectangle",R.drawable.rectangle_yellow);
                    break;
                }case 14:
                {
                    imageViewRectangle.setImageResource(R.drawable.rectangle_orange);
                    imageViewCircle.setImageResource(tinyDB.getInt("circle"));
                    imageViewSquare.setImageResource(tinyDB.getInt("square"));
                    tinyDB.putInt("rectangle",R.drawable.rectangle_orange);
                    break;
                }


            }
        }
        return view;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        tinyDB.putInt("circle" , R.drawable.circle_black);
        tinyDB.putInt("square" , R.drawable.square_black);
        tinyDB.putInt("rectangle" , R.drawable.rectangle_black);
    }


}
