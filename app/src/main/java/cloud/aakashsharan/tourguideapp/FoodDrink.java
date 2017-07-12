package cloud.aakashsharan.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodDrink extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        // check from which class this activity was called.
        String caller = getIntent().getStringExtra("caller");

        // create a list of attraction
        final ArrayList<Attractions> attraction = new ArrayList<Attractions>();

        if (caller.equalsIgnoreCase("NewDelhiActivity")) {
            attraction.add(new Attractions(getString(R.string.old_del_baz1), getString(R.string.old_del_baz2), R.drawable.old_del_baz));
            attraction.add(new Attractions(getString(R.string.saffron1), getString(R.string.saffron2), R.drawable.saffron));
            attraction.add(new Attractions(getString(R.string.del_food_walks1), getString(R.string.del_food_walks2), R.drawable.del_food_walks));
        } else if (caller.equalsIgnoreCase("MumbaiActivity")) {
            attraction.add(new Attractions(getString(R.string.street_mumbai1), getString(R.string.street_mumbai2), R.drawable.street_mumbai));
            attraction.add(new Attractions(getString(R.string.mum_moments1), getString(R.string.mum_moments2), R.drawable.mum_moments));
        } else if (caller.equalsIgnoreCase("ChennaiActivity")) {
            attraction.add(new Attractions(getString(R.string.cook_sundari1), getString(R.string.cook_sundari2), R.drawable.cook_sundari));
            attraction.add(new Attractions(getString(R.string.foodie_day1), getString(R.string.foodie_day2), R.drawable.foodie_day));
            attraction.add(new Attractions(getString(R.string.travel_spoon1), getString(R.string.travel_spoon2), R.drawable.travel_spoon));
        } else if (caller.equalsIgnoreCase("AmritsarActivity")) {
            attraction.add(new Attractions(getString(R.string.food_trail1), getString(R.string.food_trail2), R.drawable.food_trail));
        }

        AttractionsAdapter atAdapter = new AttractionsAdapter(this, attraction, R.color.food_drink);
        ListView listView = (ListView) findViewById((R.id.list));
        listView.setAdapter(atAdapter);
    }
}
