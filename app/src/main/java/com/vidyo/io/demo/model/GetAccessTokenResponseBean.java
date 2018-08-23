package com.vidyo.io.demo.model;

/**
 * Summary: POJO class for getAccessToken api response
 * @author R Systems
 * @date 20.08.2018
 */

public class GetAccessTokenResponseBean {
    String accessToken;
    String username;
    String status;
    String meetingId;


    public String getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
