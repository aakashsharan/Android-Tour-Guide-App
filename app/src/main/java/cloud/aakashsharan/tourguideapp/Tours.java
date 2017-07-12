package cloud.aakashsharan.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Tours extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        // check from which class this activity was called.
        String caller = getIntent().getStringExtra("caller");

        // create a list of attraction
        final ArrayList<Attractions> attraction = new ArrayList<Attractions>();

        if (caller.equalsIgnoreCase("NewDelhiActivity")) {
            attraction.add(new Attractions(getString(R.string.ndmk1), getString(R.string.ndmk2), R.drawable.shop_delhi));
            attraction.add(new Attractions(getString(R.string.mughal1), getString(R.string.mughal2), R.drawable.mughal));
            attraction.add(new Attractions(getString(R.string.spi_delhi1), getString(R.string.spi_delhi2), R.drawable.spi_delhi));
        } else if (caller.equalsIgnoreCase("MumbaiActivity")) {
            attraction.add(new Attractions(getString(R.string.dharavi1), getString(R.string.dharavi2), R.drawable.dharavi));
            attraction.add(new Attractions(getString(R.string.high_mumbai1), getString(R.string.high_mumbai2), R.drawable.high_mumbai));
            attraction.add(new Attractions(getString(R.string.private_mumbai1), getString(R.string.private_mumbai2), R.drawable.private_mumbai));
        } else if (caller.equalsIgnoreCase("ChennaiActivity")) {
            attraction.add(new Attractions(getString(R.string.story_trails1), getString(R.string.story_trails2), R.drawable.story_trails));
            attraction.add(new Attractions(getString(R.string.foodie_day1), getString(R.string.foodie_day2), R.drawable.foodie_day));
            attraction.add(new Attractions(getString(R.string.five_senses1), getString(R.string.five_senses2), R.drawable.five_senses));
        } else if (caller.equalsIgnoreCase("AmritsarActivity")) {
            attraction.add(new Attractions(getString(R.string.food_trail1), getString(R.string.food_trail2), R.drawable.food_trail));
            attraction.add(new Attractions(getString(R.string.davin_heritage1), getString(R.string.davin_heritage2), R.drawable.davin_heritage));
        }

        AttractionsAdapter atAdapter = new AttractionsAdapter(this, attraction, R.color.tours);
        ListView listView = (ListView) findViewById((R.id.list));
        listView.setAdapter(atAdapter);
    }
}
