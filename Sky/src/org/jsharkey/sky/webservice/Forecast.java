
package org.jsharkey.sky.webservice;

/**
 * Data for a specific forecast at a point in time.
 */
public class Forecast {
    boolean alert = false;
    long validStart = Long.MIN_VALUE;
    int tempHigh = Integer.MIN_VALUE;
    int tempLow = Integer.MIN_VALUE;
    String conditions;
    String url;
    
    /**
     * Exception to inform callers that we ran into problems while parsing the
     * forecast returned by the webservice.
     */
    public static final class ParseException extends Exception {
        private static final long serialVersionUID = 1L;

        public ParseException(String detailMessage) {
            super(detailMessage);
        }

        public ParseException(String detailMessage, Throwable throwable) {
            super(detailMessage, throwable);
        }
    }

}
