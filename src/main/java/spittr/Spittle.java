package spittr;

import java.util.Date;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class Spittle {
    private final Long id;
    private final String message;
    private final Date time;
    private Double latitude;
    private Double longitude;


    public Spittle(String message, Date time) {
        this(message, time, 0.0, 0.0);
    }

    public Spittle(String message, Date time, Double latitude, Double longitude) {
        this.message = message;
        this.id = null;
        this.time = time;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public Date getTime() {
        return time;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public boolean equals(Object that){
        return EqualsBuilder.reflectionEquals(this, that, "id", "time");
    }

    public int hashCode(){
        return HashCodeBuilder.reflectionHashCode(this, "id", "time");
    }
}
