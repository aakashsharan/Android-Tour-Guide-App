package cloud.aakashsharan.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class SightsLandmarks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        // check from which class this activity was called.
        String caller = getIntent().getStringExtra("caller");
        //Log.i("The caller is ", ""+caller);

        // create a list of attraction
        final ArrayList<Attractions> attraction = new ArrayList<Attractions>();

        if (caller.equalsIgnoreCase("NewDelhiActivity")) {
            attraction.add(new Attractions(getString(R.string.hum1), getString(R.string.hum2), R.drawable.humayun_tomb));
            attraction.add(new Attractions(getString(R.string.qub1), getString(R.string.qub2), R.drawable.qutab_minar));
            attraction.add(new Attractions(getString(R.string.lodi1), getString(R.string.lodi2), R.drawable.lodi_gardens));
            attraction.add(new Attractions(getString(R.string.iskcon1), getString(R.string.iskcon2), R.drawable.iskcon_temple));
        } else if (caller.equalsIgnoreCase("MumbaiActivity")) {
            attraction.add(new Attractions(getString(R.string.kan1), getString(R.string.kan2), R.drawable.kan_caves));
            attraction.add(new Attractions(getString(R.string.siddhi1), getString(R.string.siddhi2), R.drawable.sri_siddhi));
            attraction.add(new Attractions(getString(R.string.mary1), getString(R.string.mary2), R.drawable.mount_mary_church));
            attraction.add(new Attractions(getString(R.string.cpt1), getString(R.string.cpt2), R.drawable.cp_shivaji));
        } else if (caller.equalsIgnoreCase("ChennaiActivity")) {
            attraction.add(new Attractions(getString(R.string.kap1), getString(R.string.kap2), R.drawable.kap_temple));
            attraction.add(new Attractions(getString(R.string.sai1), getString(R.string.sai2), R.drawable.sai_temple));
            attraction.add(new Attractions(getString(R.string.iit1), getString(R.string.iit2), R.drawable.iit_madras));
        } else if (caller.equalsIgnoreCase("AmritsarActivity")) {
            attraction.add(new Attractions(getString(R.string.ham1), getString(R.string.ham2), R.drawable.harmandir_sahib));
            attraction.add(new Attractions(getString(R.string.akal1), getString(R.string.akal2), R.drawable.akal_takht));
            attraction.add(new Attractions(getString(R.string.jall1), getString(R.string.jall2), R.drawable.jallianwala_bagh));
            attraction.add(new Attractions(getString(R.string.gobin1), getString(R.string.gobin2), R.drawable.gobin_fort));
        }

        AttractionsAdapter atAdapter = new AttractionsAdapter(this, attraction, R.color.sights_landmark);
        ListView listView = (ListView) findViewById((R.id.list));
        listView.setAdapter(atAdapter);

    }
}
