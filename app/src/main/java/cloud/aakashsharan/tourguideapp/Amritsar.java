package cloud.aakashsharan.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Amritsar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categories_list);

        // Find the view that shows Sights & Landmarks
        final TextView sightsLandmarks = (TextView) findViewById(R.id.sights_landmarks);

        // Set a click listener on newDelhi View
        sightsLandmarks.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent sightsLandmarksIntent = new Intent(Amritsar.this, SightsLandmarks.class);
                sightsLandmarksIntent.putExtra("caller", "AmritsarActivity");
                startActivity(sightsLandmarksIntent);
            }
        });

        // Find the view that shows Outdoors
        TextView outdoors = (TextView) findViewById(R.id.outdoor);

        // Set a click listener on newDelhi View
        outdoors.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent outdoorsIntent = new Intent(Amritsar.this, Outdoors.class);
                outdoorsIntent.putExtra("caller", "AmritsarActivity");
                startActivity(outdoorsIntent);
            }
        });

        // Find the view that shows Food & Drink
        TextView foodDrink = (TextView) findViewById(R.id.food_drink);

        // Set a click listener on newDelhi View
        foodDrink.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent foodDrinkIntent = new Intent(Amritsar.this, FoodDrink.class);
                foodDrinkIntent.putExtra("caller", "AmritsarActivity");
                startActivity(foodDrinkIntent);
            }
        });

        // Find the view that shows Tours
        TextView tours = (TextView) findViewById(R.id.tours);

        // Set a click listener on newDelhi View
        tours.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent toursIntent = new Intent(Amritsar.this, Tours.class);
                toursIntent.putExtra("caller", "AmritsarActivity");
                startActivity(toursIntent);
            }
        });
    }
}
