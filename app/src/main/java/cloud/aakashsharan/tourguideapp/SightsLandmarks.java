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
            attraction.add(new Attractions("Humayun's Tomb", "This tomb, built in 1570, is of particular cultural significance as it was the first garden-tomb on the Indian subcontinent. It inspired several major architectural innovations, culminating in the construction of the Taj Mahal and many other Mughal architecture and garden complexes in India.", R.drawable.humayun_tomb));
            attraction.add(new Attractions("Qutab Minar", "Construction on this sandstone minaret was begun in 1192. Surrounded by other historical sites, it is the most popular monument in India. Miniature Souvenir is available at Luv Indiya, 12 B Janpath Market, Connaught Place, New Delhi", R.drawable.qutab_minar));
            attraction.add(new Attractions("Lodi Gardens", "An oasis in an otherwise crowded, dusty city, Lodi Gardens is the perfect place to spend a relaxing afternoon admiring nature.", R.drawable.lodi_gardens));
            attraction.add(new Attractions("ISKCON Temple", "This elaborate temple of the Hare Krishna is one of the largest in India.", R.drawable.iskcon_temple));
        } else if (caller.equalsIgnoreCase("MumbaiActivity")) {
            attraction.add(new Attractions("Kanheri Caves", "Kanheri the best part about the national park situated right in the city. The road leading to the caves is well maintained and a fun 7-8 kms drive. The caves are beautiful and make you feel calm.", R.drawable.kan_caves));
            attraction.add(new Attractions("Shree Siddhivinayak", "Located in Mumbai’s central area, Prabhadevi, this temple is the most revered Lord Ganesh temple not only of Maharashtra but also of India.", R.drawable.sri_siddhi));
            attraction.add(new Attractions("Mount Mary Church", "This is a beautiful Roman Catholic Church which is very famous for the week-long Bandra fair which takes place here every year in September.", R.drawable.mount_mary_church));
            attraction.add(new Attractions("Chhatrapati Shivaji Terminus", "India's most beautiful railway station is a masterpiece of Gothic architecture with stained-glass windows, towering spires, domed arches and buttresses and pillars with animal images carved into them.", R.drawable.cp_shivaji));
        } else if (caller.equalsIgnoreCase("ChennaiActivity")) {
            attraction.add(new Attractions("Kapaleeshwar Temple", "This ancient shrine to Shiva is centrally located and among the area’s most popular landmarks.", R.drawable.kap_temple));
            attraction.add(new Attractions("Shirdi Sai Baba Temple", "Nice ambience. the temple also includes separate abodes for Gayathri devi, and Dattatreya.", R.drawable.sai_temple));
            attraction.add(new Attractions("Indian Institute Of Technology, Madras", "Madras IIT is one of the most prestigious Institute of Technology was established in 1959 and the campus of the Institute was part of the Guindy National Park.", R.drawable.iit_madras));

        } else if (caller.equalsIgnoreCase("AmritsarActivity")) {
            attraction.add(new Attractions("Harmandir Sahib", "Sri Harmandir Sahib also Sri Darbar Sahib informally referred to as the Golden Temple, is the holiest Gurdwara of Sikhism, located in the city of Amritsar.", R.drawable.harmandir_sahib));
            attraction.add(new Attractions("Akal Takht", "Located in the Golden temple complex itself, Akal Takht sahib is one of the 5 seats of power in the Sikh religion, daily hukumnama is read. The building of shri Akal Takht is located directly opposite the Harmandir Sahib was founded by sixth Sikh Guru, Guru Hargobind, as a symbol of political sovereignty and where spiritual and temporal concerns of the Sikh people could be addressed", R.drawable.akal_takht));
            attraction.add(new Attractions("Jallianwala Bagh", "This is the site of the April 13, 1919 massacre of hundreds of innocents by British troops.", R.drawable.jallianwala_bagh));
            attraction.add(new Attractions("Gobindgarh Fort", "Gobindgarh Fort is located inside the Lohgarh Darwaza on the Old Cant. road. Built in the 19th century, it was under the reign of Bhangi-misl, Maharaja Ranjit Singh, British and the Indian army. It is now open to public.", R.drawable.gobin_fort));

        }


        AttractionsAdapter atAdapter = new AttractionsAdapter(this, attraction, R.color.sights_landmark);
        ListView listView = (ListView) findViewById((R.id.list));
        listView.setAdapter(atAdapter);

    }
}
