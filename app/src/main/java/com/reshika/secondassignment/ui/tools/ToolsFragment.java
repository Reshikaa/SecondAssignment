package com.reshika.secondassignment.ui.tools;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.reshika.secondassignment.R;

public class ToolsFragment extends Fragment implements View.OnClickListener {

    private ToolsViewModel toolsViewModel;
    private Button btnSwap;
    private EditText etFirst,etSecond;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_tools, container, false);

        etFirst=view.findViewById(R.id.etFirst);
        etSecond=view.findViewById(R.id.etSecond);
        btnSwap=view.findViewById(R.id.btnSwap);

        btnSwap.setOnClickListener(this);
        return view;
//        toolsViewModel =
//                ViewModelProviders.of(this).get(ToolsViewModel.class);
//        View root = inflater.inflate(R.layout.fragment_tools, container, false);
//        final TextView textView = root.findViewById(R.id.text_tools);
//        toolsViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
//        return root;
    }

    @Override
    public void onClick(View v) {
        int first,second;

        first=Integer.parseInt(etFirst.getText().toString());
        second=Integer.parseInt(etSecond.getText().toString());

        etFirst.setText(Integer.toString(second));
        etSecond.setText(Integer.toString(first));
    }
}