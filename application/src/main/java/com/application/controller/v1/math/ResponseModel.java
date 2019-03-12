package com.application.controller.v1.math;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ResponseModel {
    private String date;
    private String message;
    private double result;

    public ResponseModel()
    {
        this.date = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
        this.message = "Your operation was successfully processed";
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
