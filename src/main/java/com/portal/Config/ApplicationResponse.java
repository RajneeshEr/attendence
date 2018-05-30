package com.portal.Config;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 25/5/2018
 */
@Data
@Component
public class ApplicationResponse {

    private String message;
    private HttpStatus status;
    private Object payload;

    public ApplicationResponse setPayload(Object payload) {
        this.payload = payload;
        return this;
    }

    @Override
    public String toString() {
        return "ApplicationResponse{" +
                "message='" + message + '\'' +
                ", status=" + status +
                ", payload=" + payload +
                '}';
    }


}