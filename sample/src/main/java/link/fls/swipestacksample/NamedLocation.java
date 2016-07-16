package link.fls.swipestacksample;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by PC on 7/16/2016.
 */
public class NamedLocation {

    public final String name;

    public final LatLng location;

    NamedLocation(String name, LatLng location) {
        this.name = name;
        this.location = location;
    }
}
