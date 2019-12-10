package com.reshika.secondassignment.ui.slideshow;

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

public class SlideshowFragment extends Fragment implements  View.OnClickListener {

    private SlideshowViewModel slideshowViewModel;
    private Button btnAuto;
    private EditText etAuto;
    private TextView tvAuto;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_slideshow, container, false);

        etAuto = view.findViewById(R.id.etAuto);
        btnAuto = view.findViewById(R.id.btnAuto);
        tvAuto=view.findViewById(R.id.tvAuto);

        btnAuto.setOnClickListener(this);
        return view;
//        slideshowViewModel =
//                ViewModelProviders.of(this).get(SlideshowViewModel.class);
//        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);
//        final TextView textView = root.findViewById(R.id.text_slideshow);
//        slideshowViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
//        return root;
    }

    @Override
    public void onClick(View v) {
    int a,square,counter=1;

    int n=Integer.parseInt(etAuto.getText().toString());
    a=n;
    square=n*n;
    while (n!=0)
    {
        counter=counter*10;
        n=n/10;
    }

    if (square%counter==a){
        tvAuto.setText("It is autoMorphic");
    }
    else {
        tvAuto.setText("It is not autoMorphic");
    }


    }
}