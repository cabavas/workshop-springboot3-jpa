package com.example.course.resources.exceptions;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.Instant;

public class StandardError implements Serializable {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant timestamp;
    private Integer status;
    private String error;
    private String message;
    private String path;

    public StandardError() {
    }

    public StandardError(Instant timestamp, Integer status, String error, String message, String path) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public StandardError(String message, Instant timestamp, Integer status, String error, String message1, String path) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.message = message1;
        this.path = path;
    }

    public StandardError(String message, Throwable cause, Instant timestamp, Integer status, String error, String message1, String path) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.message = message1;
        this.path = path;
    }

    public StandardError(Throwable cause, Instant timestamp, Integer status, String error, String message, String path) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }

    public StandardError(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, Instant timestamp, Integer status, String error, String message1, String path) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.message = message1;
        this.path = path;
    }
}
