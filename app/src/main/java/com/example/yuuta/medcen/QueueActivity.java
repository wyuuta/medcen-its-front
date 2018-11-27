package com.example.yuuta.medcen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QueueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queue);
        Intent intent = getIntent();

        TextView title = findViewById(R.id.queue_title);
        final TextView your_number = findViewById(R.id.your_queue);
        TextView current_number = findViewById(R.id.now_queue);
        title.setText(getIntent().getStringExtra("poli_name"));
        your_number.setText("Belum antri");
        current_number.setText("3");

        final Button button = findViewById(R.id.queue_button);
        button.setTag(1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int status = (Integer) v.getTag();
                if (status == 1){
                    your_number.setText("10");
                    button.setText("Selesai Antri");
                    v.setTag(0);
                } else {
                    your_number.setText("Belum antri");
                    button.setText("Ambil Antrian");
                    v.setTag(1);
                }
            }
        });
    }
}
