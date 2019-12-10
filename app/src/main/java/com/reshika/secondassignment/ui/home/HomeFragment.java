package com.reshika.secondassignment.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.reshika.secondassignment.R;

public class HomeFragment extends Fragment implements View.OnClickListener {

    //private HomeViewModel homeViewModel;
    private Button btnArea;
    private EditText etRadius;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_home, container, false);

        etRadius=view.findViewById(R.id.etRadius);
        btnArea=view.findViewById(R.id.btnArea);

        btnArea.setOnClickListener(this);
        return view;
//        homeViewModel =
//                ViewModelProviders.of(this).get(HomeViewModel.class);
//        View root = inflater.inflate(R.layout.fragment_home, container, false);
//        final TextView textView = root.findViewById(R.id.text_home);
//        homeViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
//        return root;
    }

    @Override
    public void onClick(View v) {
        float radius= Float.parseFloat(etRadius.getText().toString());
        float result= (22/7)*radius*radius;

        Toast.makeText(getActivity(), "Area is:" + result, Toast.LENGTH_SHORT).show();

    }
}