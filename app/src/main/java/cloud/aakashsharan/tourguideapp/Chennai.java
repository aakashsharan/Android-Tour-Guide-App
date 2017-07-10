package cloud.aakashsharan.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Chennai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categories_list);

        // Find the view that shows Sights & Landmarks
        TextView sightsLandmarks = (TextView) findViewById(R.id.sights_landmarks);

        // Set a click listener on newDelhi View
        sightsLandmarks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sightsLandmarksIntent = new Intent(Chennai.this, SightsLandmarks.class);
                sightsLandmarksIntent.putExtra("caller", "ChennaiActivity");
                startActivity(sightsLandmarksIntent);
            }
        });

        // Find the view that shows Outdoors
        TextView outdoors = (TextView) findViewById(R.id.outdoor);

        // Set a click listener on newDelhi View
        outdoors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent outdoorsIntent = new Intent(Chennai.this, Outdoors.class);
                outdoorsIntent.putExtra("caller", "ChennaiActivity");
                startActivity(outdoorsIntent);
            }
        });

        // Find the view that shows Food & Drink
        TextView foodDrink = (TextView) findViewById(R.id.food_drink);

        // Set a click listener on newDelhi View
        foodDrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent foodDrinkIntent = new Intent(Chennai.this, FoodDrink.class);
                foodDrinkIntent.putExtra("caller", "ChennaiActivity");
                startActivity(foodDrinkIntent);
            }
        });

        // Find the view that shows Tours
        TextView tours = (TextView) findViewById(R.id.tours);

        // Set a click listener on newDelhi View
        tours.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toursIntent = new Intent(Chennai.this, Tours.class);
                toursIntent.putExtra("caller", "ChennaiActivity");
                startActivity(toursIntent);
            }
        });
    }
}
