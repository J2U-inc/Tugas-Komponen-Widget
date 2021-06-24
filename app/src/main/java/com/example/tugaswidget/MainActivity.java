package com.example.tugaswidget;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_tes);

//        @SuppressLint("WrongViewCast") Button btn_plus = (Button) this.<View>findViewById(R.id.btn_plus);
//        Button btn_plus;

    }
    public  void onImageButtonClicked(View view){
        Toast toast = Toast.makeText(MainActivity.this, "Data Berhasil Ditambahkan", Toast.LENGTH_LONG);
        toast.show();
    }
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.RB1:
                if (checked)
                    break;
            case R.id.RB2:
                if (checked)
                    break;
        }
    }
    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.CB1:
                if (checked)
                break;
            case R.id.CB2:
                if (checked)
                break;
        }
    }
}