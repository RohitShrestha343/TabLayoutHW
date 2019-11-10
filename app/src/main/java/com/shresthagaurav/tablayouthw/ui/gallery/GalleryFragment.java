package com.shresthagaurav.tablayouthw.ui.gallery;

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

import com.shresthagaurav.tablayouthw.R;

import java.text.DecimalFormat;

public class GalleryFragment extends Fragment {
    private EditText etradius;
    private Button btnCalculate;
    private TextView txresult;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        etradius = root.findViewById(R.id.etR);
        btnCalculate = root.findViewById(R.id.btnCaluclateR);
        txresult = root.findViewById(R.id.resultR);
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DecimalFormat decimalFormat= new DecimalFormat("0.00");
                double first, result;
                first = Double.parseDouble(etradius.getText().toString());
                result = ((22 * first * first)/7);
                txresult.setText(decimalFormat.format(result));
            }
        });
        return root;
    }

}