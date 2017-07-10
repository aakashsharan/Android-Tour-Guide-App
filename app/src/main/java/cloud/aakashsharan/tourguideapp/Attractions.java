package cloud.aakashsharan.tourguideapp;

/**
 * Created by Aakash on 7/10/2017.
 */

public class Attractions {

    private static final int NO_IMAGE_PROVIDED = -1;
    private String mDescription;
    private String mTitle;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    public Attractions(String title, String description, int imageResourceId){
        mTitle = title;
        mDescription = description;
        mImageResourceId = imageResourceId;
    }

    public String getDescription(){
        return mDescription;
    }

    public String getTitle(){
        return mTitle;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }

    // check if image exists or not.
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
