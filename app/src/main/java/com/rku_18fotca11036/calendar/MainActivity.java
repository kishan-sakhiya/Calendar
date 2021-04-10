package com.rku_18fotca11036.calendar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    TextView txtDate;
    ImageView imgCal;
    int year;
    int day;
    int month;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtDate = findViewById(R.id.txtDate);
        imgCal = findViewById(R.id.imgCal);

        Calendar calendar = Calendar.getInstance();

        imgCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            day = calendar.get(Calendar.DAY_OF_MONTH);
            month = calendar.get(Calendar.MONTH);
            year = calendar.get(Calendar.YEAR);


                DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        txtDate.setText(dayOfMonth +"-"+ month +"-"+ year);
                    }
                },day,month,year);
                datePickerDialog.show();
            }
        });
    }
}