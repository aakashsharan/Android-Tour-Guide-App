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
            attraction.add(new Attractions("SpinMonkey", "We at SPINMONKEY want to take you out for a spin and get you to explore Delhi like never before! We have a wide variety of tours to choose from and you can select the one that suits your interests and schedule. SPINMONKEY RIDES give you unmatched experience and help you remember Delhi fondly when you go back home. We recommend it highly and it will be worth every penny spent! With cycling tours customised for tourists, couples, families, corporates, adventure enthusiasts and even the locals, SPINMONKEY is the best way to tour Delhi and experience its culture, heritage and culinary delights. If you enjoy traveling with a group, meeting new people and exploring new destinations in non-traditional ways, then SpinMonkey is the best fit for you. Our bicycle tours provide the convenience of having everything planned out for you. You usually bike in a group of 8 to 15 people, typically from several different countries, which make for new acquaintances and international friendships. Most tour operators provide you with a comprehensive information package with tips on sights, cultural highlights, and scenic stops and ensure a fun filled ride!", R.drawable.spin_monkey));
            attraction.add(new Attractions("DelhiByCycle", "Namaste! Welcome to DelhiByCycle! A lifetime experience in the lively streets of Delhi is waiting for you! India is a country of contrast and colours and a strong inspiration for the mind! With our tours we invite you to become part of this unique mix of colours, smells, sounds, tastes and unforgettable images. Take the tour and experience the city of Delhi with all your senses for a true 'street experience'! We have spent many, many hours cycling around, to see and feel what are the best places for you.We offer 4 tours - Shah Jahan, Yamuna, Raj and Nizamudddin - so you can fully explore the different corners of Old and New Delhi.We never try to make things more beautiful, hide difficult sceneries or avoid certain places. Our aim is to show Delhi as the Delhiites experience their city daily. Intense, sometimes overwhelming, but always satisfying in unexpected ways.Have a great tour!", R.drawable.del_cycle));
            attraction.add(new Attractions("Aquaterra Adventures", "Aquaterra Adventures is the only Indian company to be rated twice in a row as best adventure travel outfitters on Earth, in a global survey by National Geographic Society, 2008 & 2009. We have been running trips and tours for the discerning traveller throughout the Indian Himalayas since 1995, yet the experience of our travel personnel dates well beyond that, to years of leading trips throughout the Indian Himalayan belt. We believe that an adventure travel outfit is only as good as its guides. Good equipment, food and guides is what makes an outdoor trip an experience to savour.", R.drawable.aqua_adven));
        } else if (caller.equalsIgnoreCase("MumbaiActivity")) {
            attraction.add(new Attractions("Chowpatty Beach", "The action starts at night at this famous beach, which is lined with vendors, entertainers, children's rides and fast food stalls selling bhelpuris (puffed rice snacks) and other Indian delights.", R.drawable.chowpatty));
            attraction.add(new Attractions("Marine Drive", "Bordering the Arabian Sea, this famous road is a popular spot for watching sunsets, and is gorgeous when lit up at night.", R.drawable.marine_drive));
            attraction.add(new Attractions("Juhu Beach", "Not your typical swimming and bathing beach, this beach is best visited on weekend afternoons and evenings, when it comes alive with children's rides, carvnival-like amusements and food stands.", R.drawable.juhu));
        } else if (caller.equalsIgnoreCase("ChennaiActivity")) {
            attraction.add(new Attractions("Arignar Anna Zoological Park", "It is one of the oldest Zoological parks in the country. Vast area with lot of spaces and enclosures with a wide variety of animals.", R.drawable.arignar));
            attraction.add(new Attractions("Besant Nagar Beach", "This is a must watch place in Chennai. The beach is relatively good. One can enjoy the cool breeze both in the morning as well as in the evening. Many people go for a morning walk along the beach shore. Many eateries are available along the beach shore.", R.drawable.besant));
            attraction.add(new Attractions("Marina Beach", "This expansive beach is Chennai's most famous tourist attraction, though the undercurrent is too strong for all but the strongest swimmers. Look out for the 'Kannagi' statue on Marina Beach, which tells the story of the legendary character from a South Indian epic.", R.drawable.marina));
        } else if (caller.equalsIgnoreCase("AmritsarActivity")) {
            attraction.add(new Attractions("Foodtrailsindia", "With FoodtrailsIndia, we want you to see the Guru di Nagri (Guru’s city), as Amritsar is fondly called, on foot and indulge in tasting the centuries old recipes of the Old city apart from experiencing traditional markets. With its narrow bylanes and more than 3000 shops inside the old city, the old city guarded by 12 historical gates, the old city offers travelers a chance to explore the city.", R.drawable.food_trail));
            attraction.add(new Attractions("Rainbow Resorts", "The facilities available are Water park, Go-karting(450 mts Tarmac track), Paintball, Adventure sports(Zip Line, Rappelling, Burma bridge, Hanging log), Boating, Kitty Party hall, Lush green Banquet lawn restaurant. ", R.drawable.rainbow));

        }

        AttractionsAdapter atAdapter = new AttractionsAdapter(this, attraction, R.color.outdoor);
        ListView listView = (ListView) findViewById((R.id.list));
        listView.setAdapter(atAdapter);
    }
}
