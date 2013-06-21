
package org.jsharkey.sky.webservice;

import org.jsharkey.sky.webservice.Forecast.ParseException;

import java.util.List;

public class MetarSource implements ForecastSource {
    
    // TODO: find an online API that performs lat+lon lookup to METAR station code

    @Override
    public List<Forecast> getForecasts(double lat, double lon, int days) throws ParseException {
        throw new ParseException("METAR not yet implemented");
    }


}
