package com.example.timepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView timeTextView = (TextView)findViewById(R.id.timeTextView);
        TimePicker timePicker = (TimePicker)this.findViewById(R.id.timePicker);

        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {

                timeTextView.setText("Время: " + hourOfDay + ":" + minute);
                // или так
                // timeTextView.setText("Время: " + view.getHour() + ":" + view.getMinute());
            }
        });
    }
}