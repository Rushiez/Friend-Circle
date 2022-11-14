package org.valleycollege.schoolproject;

public class Message {
    private String userEmail;
    private String message;
    private String dataTime;

    public Message() {
    }



    public Message(String userEmail, String message, String dataTime) {
        this.userEmail = userEmail;
        this.message = message;
        this.dataTime = dataTime;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDataTime() {
        return dataTime;
    }

    public void setDataTime(String dataTime) {
        this.dataTime = dataTime;
    }
}
