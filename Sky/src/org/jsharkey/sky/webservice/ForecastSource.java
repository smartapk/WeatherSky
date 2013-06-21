
package org.jsharkey.sky.webservice;

import org.jsharkey.sky.webservice.Forecast.ParseException;

import java.util.List;

public interface ForecastSource {
    
    /**
     * Query the given location and parse any returned data into a set of
     * {@link Forecast} objects. This is a blocking call while waiting for the
     * webservice to return.
     */
    public List<Forecast> getForecasts(double lat, double lon, int days) throws ParseException;

}
