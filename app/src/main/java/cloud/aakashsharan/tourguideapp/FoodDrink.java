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
            attraction.add(new Attractions("Old Delhi Bazaar Walk & Haveli Visit", "Our Old Delhi tours are combination of Food, Heritage & culture with walking and cycle rickshaw( Pedi cab) ride to make a comfortable experience at Old Delhi. It is off the eaten / beaten path and a feast for all the senses. We recommend our guests to see Delhi not just as a sightseeing tour or sitting simply on a cycle rickshaw / Pedi cab or in a taxi BUT see it through our eyes to experience the city on the whole with its past and present, with its beliefs and its culture that co-exist. Our walks give a taste of the city and make you sink in the frenzy of its colours, vivacity and irresistible charm. Your senses come alive as you will encounter the many captivating sights and sounds this amazing city has.", R.drawable.old_del_baz));
            attraction.add(new Attractions("Saffron Palate", "Experience an authentic Indian Kitchen with an Indian Family in the heart & heritage of Hauz Khas in Delhi.Delectable Indian cuisine experience to learn, relish & cherish for life. Various Experience options which include ; (Enjoy an Indian meal with our Family) , (Learn to cook Indian Food and understand the basic nuances of Indian food & spices) , (Learn to cook Sattvic / Yogic Indian Food), (Visit the Spice & Vegetable market for a first hand orientation of Spices , Lentils & Vegetables used in our Food followed by a cooking class), (Visit the Handicrafts , Spice & Vegetable Market followed by Cooking class & meal) & (High Tea and sumptuous Indian snacks along with a Walk to the Monuments in the historic area of Hauz Khas).", R.drawable.saffron));
            attraction.add(new Attractions("Delhi Food Walks", "Delhi Food Walks conduct food expeditions to relish the food culture of Delhi and interact with the fellow food enthusiasts. It began in 2011 to act as a bastion of Delhi food culture.", R.drawable.del_food_walks));
        } else if (caller.equalsIgnoreCase("MumbaiActivity")) {
            attraction.add(new Attractions("Street Food During Ramzan", "Ramzan time is the best time to be in this locality to eat the vast variety of street food here, from tandoor items to main courses and sweet dishes it is the best food in all of Mumbai, a must visit in this time of the year", R.drawable.street_mumbai));
            attraction.add(new Attractions("Mumbai Moments", "Welcome to our city. Mumbai as we see it, we invite you to discover our home, in all its true COLOURS. Mumbai is a city that will mesmerize you with its sights, sounds and smells! If you are you looking out for some incredible authentic Mumbai experience, then we recommend you to go for our Mumbai Moments tours. If you are a leisure traveler or on a business, we help you to discover the essence of this city with our specialized and personalized, private and group, customized Mumbai city tours.", R.drawable.mum_moments));
        } else if (caller.equalsIgnoreCase("ChennaiActivity")) {
            attraction.add(new Attractions("Cook With SundariKrishna", "Continuous interaction with a number of International visitors to Chennai, India during the last few years, has encouraged me to provide a platform where guests are not only in a position to enjoy the nuances of Indian fine dining but further learn the art of cooking depending on their interest. The guests can choose from a variety of menu lists which will be provided through email on booking.", R.drawable.cook_sundari));
            attraction.add(new Attractions("Foodies Day Out", "Foodies Day Out at Madurai, offers you the best food tour in the country. As we walk and ride through the city's authentic eateries you will sample the best food the temple town has to offer. A food tour that covers everything from the local snacks to dessert that the locals relish. Get ready for a gastronomical experience of your life !", R.drawable.foodie_day));
            attraction.add(new Attractions("Traveling Spoon", "Traveling Spoon provides travelers with private, authentic food experiences, from homemade meals to cooking classes and market tours, with local hosts in their homes.", R.drawable.travel_spoon));
        } else if (caller.equalsIgnoreCase("AmritsarActivity")) {
            attraction.add(new Attractions("Foodtrailsindia", "With FoodtrailsIndia, we want you to see the Guru di Nagri (Guru’s city), as Amritsar is fondly called, on foot and indulge in tasting the centuries old recipes of the Old city apart from experiencing traditional markets. With its narrow bylanes and more than 3000 shops inside the old city, the old city guarded by 12 historical gates, the old city offers travelers a chance to explore the city.", R.drawable.food_trail));
        }


        AttractionsAdapter atAdapter = new AttractionsAdapter(this, attraction, R.color.food_drink);
        ListView listView = (ListView) findViewById((R.id.list));
        listView.setAdapter(atAdapter);
    }
}
