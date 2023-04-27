package com.security.rolebased.payload.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
//*1added here for refreshb token

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TokenRefreshRequest {
    @NotBlank
    private String refreshToken;

//    public String getRefreshToken() {
//        return refreshToken;
//    }
//
//    public void setRefreshToken(String refreshToken) {
//        this.refreshToken = refreshToken;
//    }
}