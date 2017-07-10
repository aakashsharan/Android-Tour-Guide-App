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
            attraction.add(new Attractions("Private Custom Shopping Tour: Delhi's Bustling Markets", "Shop like a local, not a visitor, on a private, customized 6-hour shopping tour of Delhi. Select three or four markets and enjoy a flexible itinerary, shopping and strolling at each at your own pace. Dive into legendary Chandni Chowk for jewelry, electronics, and one-of-a-kind clothing. Choose to visit everything from Delhi's budget-friendly bazaars to malls to handicraft villages.", R.drawable.shop_delhi));
            attraction.add(new Attractions("Mughal Heritage Tour Including Lodhi Garden, Humayun Tomb and Akshardham Temple", "Gain a deeper understanding of Mughal history, influence and rule on this popular tour of Delhi landmarks. Learn about the Sai Baba Temple and tour the picturesque Lodi Garden. Get an up close look at history as you walk through the Human Tomb. This memorable journey of culture and history concludes with a visit to the Akshardham Temple and a show at the musical fountains.", R.drawable.mughal));
            attraction.add(new Attractions("Spiritual Delhi Temples Full-Day Private Guided Tour", "Explore the temples of Delhi and the diversity of religions in India on a private full-day tour. Accompanied by your private guide, see ISKCON temple, Lotus Temple, Chattarpur Temple, Gurudwara Bangla Sahib, Akshardham Temple, and Birla Mandir (Lakshmi Narayan Temple). Includes entrance fees, private guide and transportation, and hotel pickup and drop-off.", R.drawable.spi_delhi));
        } else if (caller.equalsIgnoreCase("MumbaiActivity")) {
            attraction.add(new Attractions("Dharavi Slum Small-Group Tour", "See a different side of Mumbai on this 2.5-hour walking tour of the Dharavi slum. Visit the community center and tour the textiles, recycling, and leather tanning businesses run by the local residents.", R.drawable.dharavi));
            attraction.add(new Attractions("Highlights of Mumbai: Sightseeing Tour of Mumbai", "In this tour we offer you a fascinating 'getaway' that gives you a ringside view of the 'madness and magic' of MUMBAI - the living city that 'never sleeps'. Visit Includes Dhobi Ghat, Hanging Garden, Mani Bhavan, Marine drive, Gateway of India, Drive passes High Court, Prince of wales Museum, University, Flora fountain, Visit to Crawford Market & Victoria terminus now Cst, Jain temple, Banganga tank. ", R.drawable.high_mumbai));
            attraction.add(new Attractions("Private Mumbai City Tour", "TJoin this tour to visit the various landmarks of Mumbai all in a day. You will be accompanied by an English-speaking guide who walk you through the historical importance as well as the present day relevance of each place you visit.", R.drawable.private_mumbai));
        } else if (caller.equalsIgnoreCase("ChennaiActivity")) {
            attraction.add(new Attractions("Storytrails", "Story-based walking tours and short excursions that zig-zag through the beat and the pulse of the city; from its oldest parts to its busy bazaars, through dance and art to its rural heart. Unlike sight-seeing tours, these trails focus on the everyday sights on the streets - the local customs, symbolisms and the fascinating stories behind the mundane rituals of life. Hosted by a team of articulate storytellers, these trails are an enjoyable way for visitors to appreciate the local way of life. Pick from nine different tours in Chennai.", R.drawable.story_trails));
            attraction.add(new Attractions("Foodies Day Out", "Foodies Day Out at Madurai, offers you the best food tour in the country. As we walk and ride through the city's authentic eateries you will sample the best food the temple town has to offer. A food tour that covers everything from the local snacks to dessert that the locals relish. Get ready for a gastronomical experience of your life !", R.drawable.foodie_day));
            attraction.add(new Attractions("Five Senses Tours", "Five Senses Tours Private Limited Company offers culture tours in India. We offer a cultural immersive experience that connects you to the essence of India and its people. We keep things local on our tours. Our guides are from the local community and don the hat of cultural ambassadors. The theme of our experiences is around the art, culture and traditions prevalent in the area.", R.drawable.five_senses));
        } else if (caller.equalsIgnoreCase("AmritsarActivity")) {
            attraction.add(new Attractions("Foodtrailsindia", "With FoodtrailsIndia, we want you to see the Guru di Nagri (Guru’s city), as Amritsar is fondly called, on foot and indulge in tasting the centuries old recipes of the Old city apart from experiencing traditional markets. With its narrow bylanes and more than 3000 shops inside the old city, the old city guarded by 12 historical gates, the old city offers travelers a chance to explore the city.", R.drawable.food_trail));
            attraction.add(new Attractions("Davinder Singh's Amritsar Heritage Walk", "Davinder's 7:30 a.m. Amritsar Heritage tour, which in addition to excellent orientation on both Sikhism and the city, as well as insights on architecture and very good street food (like Kulchas, cooked in a Tandoori oven, and buffalo milk yogurt, both of which one has the option of sampling on the tour).", R.drawable.davin_heritage));

        }


        AttractionsAdapter atAdapter = new AttractionsAdapter(this, attraction, R.color.tours);
        ListView listView = (ListView) findViewById((R.id.list));
        listView.setAdapter(atAdapter);
    }
}
