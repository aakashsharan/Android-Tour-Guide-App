package cloud.aakashsharan.tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the view that shows New Delhi
        TextView newDelhi = (TextView) findViewById(R.id.new_delhi_city);

        // Set a click listener on newDelhi View
        newDelhi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent newDelhiIntent = new Intent(MainActivity.this, NewDelhi.class);
                startActivity(newDelhiIntent);
            }
        });

        // Find the view that shows Mumbai
        TextView mumbai = (TextView) findViewById(R.id.mumbai_city);

        // Set a click listener on newDelhi View
        mumbai.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent mumbaiIntent = new Intent(MainActivity.this, Mumbai.class);
                startActivity(mumbaiIntent);
            }
        });

        // Find the view that shows Chennai
        TextView chennai = (TextView) findViewById(R.id.chennai);

        // Set a click listener on newDelhi View
        chennai.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent chennaiIntent = new Intent(MainActivity.this, Chennai.class);
                startActivity(chennaiIntent);
            }
        });

        // Find the view that shows Amritsar
        TextView amritsar = (TextView) findViewById(R.id.amritsar);

        // Set a click listener on newDelhi View
        amritsar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent amritsarIntent = new Intent(MainActivity.this, Amritsar.class);
                startActivity(amritsarIntent);
            }
        });


    }
}
