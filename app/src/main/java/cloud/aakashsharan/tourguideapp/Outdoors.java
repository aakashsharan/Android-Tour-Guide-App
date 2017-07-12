package cloud.aakashsharan.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Outdoors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        // check from which class this activity was called.
        String caller = getIntent().getStringExtra("caller");

        // create a list of attraction
        final ArrayList<Attractions> attraction = new ArrayList<Attractions>();

        if (caller.equalsIgnoreCase("NewDelhiActivity")) {
            attraction.add(new Attractions(getString(R.string.spin_monkey1), getString(R.string.spin_monkey2), R.drawable.spin_monkey));
            attraction.add(new Attractions(getString(R.string.del_cycle1), getString(R.string.del_cycle2), R.drawable.del_cycle));
            attraction.add(new Attractions(getString(R.string.aqua_adven1), getString(R.string.aqua_adven2), R.drawable.aqua_adven));
        } else if (caller.equalsIgnoreCase("MumbaiActivity")) {
            attraction.add(new Attractions(getString(R.string.chowpatty1), getString(R.string.chowpatty2), R.drawable.chowpatty));
            attraction.add(new Attractions(getString(R.string.marine_drive1), getString(R.string.marine_drive2), R.drawable.marine_drive));
            attraction.add(new Attractions(getString(R.string.juhu1), getString(R.string.juhu2), R.drawable.juhu));
        } else if (caller.equalsIgnoreCase("ChennaiActivity")) {
            attraction.add(new Attractions(getString(R.string.arignar1), getString(R.string.arignar2), R.drawable.arignar));
            attraction.add(new Attractions(getString(R.string.besant1), getString(R.string.besant2), R.drawable.besant));
            attraction.add(new Attractions(getString(R.string.marina1), getString(R.string.marina2), R.drawable.marina));
        } else if (caller.equalsIgnoreCase("AmritsarActivity")) {
            attraction.add(new Attractions(getString(R.string.food_trail1), getString(R.string.food_trail2), R.drawable.food_trail));
            attraction.add(new Attractions(getString(R.string.rainbow1), getString(R.string.rainbow2), R.drawable.rainbow));
        }

        AttractionsAdapter atAdapter = new AttractionsAdapter(this, attraction, R.color.outdoor);
        ListView listView = (ListView) findViewById((R.id.list));
        listView.setAdapter(atAdapter);
    }
}
