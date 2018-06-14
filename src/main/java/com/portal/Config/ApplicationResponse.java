package com.portal.Config;

import org.springframework.stereotype.Component;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 25/5/2018
 */
@Component
public class ApplicationResponse {

    private String message;
    private boolean status;
    //private HttpStatus status;
    private Object data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ApplicationResponse{" +
                "message='" + message + '\'' +
                ", status=" + status +
                ", data=" + data+
                '}';
    }

}