import com.maxmind.geoip2.WebServiceClient;
import com.maxmind.geoip2.exception.GeoIp2Exception;
import com.maxmind.geoip2.model.CityResponse;
import com.maxmind.geoip2.record.*;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/** This class is used to obtain the location of the user using geo-location, which will interface with the user class
 We need to figure out ways to link geo-city for geolocation to this class**/

public class location {
    // This creates a WebServiceClient object that is thread-safe and can be
    // reused across requests. Reusing the object will allow it to keep
    // connections alive for future requests. The object is closeable, but
    // it should not be closed until you are finished making requests with it.
    //
    // Replace "42" with your account ID and "license_key" with your license key.

    private WebServiceClient client = new WebServiceClient.Builder(42, "license_key").build();
    private CityResponse response;
    private Country country;
    private Subdivision subdivision;
    private City city;
    private Postal postal;
    double latitude;
    double longitude;
    double accuracyRadius;

    {

        InetAddress ipAddress = null;
        try {
            ipAddress = InetAddress.getByName("128.101.101.101");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        // Do the lookup
    }
    private location(InetAddress ipAddress) {
        try {
            response = client.city(ipAddress);
            country = response.getCountry();
            subdivision = response.getMostSpecificSubdivision();
            city = response.getCity();
            postal = response.getPostal();
            latitude = response.getLocation().getLatitude();
            longitude = response.getLocation().getLongitude();
            accuracyRadius = response.getLocation().getAccuracyRadius();
        }

        catch (IOException | GeoIp2Exception e) {
        e.printStackTrace();
    }

    }
}