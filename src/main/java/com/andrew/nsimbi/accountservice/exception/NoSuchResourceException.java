package com.andrew.nsimbi.accountservice.exception;

public class NoSuchResourceException extends Throwable {
    private String message;
    private long resouceId;

    public NoSuchResourceException(String message, long resouceId) {
        super();
        this.message = message;
        this.resouceId = resouceId;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public long getResouceId() {
        return resouceId;
    }
    public void setResouceId(long resouceId) {
        this.resouceId = resouceId;
    }
}
