package com.example.blogv1.Config;

import org.springframework.beans.factory.annotation.Value;

public class ApplicationConstant {


    public static String jwtSecret = "eVXr+7K+2uWEcCYgK00UpY+nKKpi0RGHhqXTV3LAacJC3iuemIbE1ouaZ4KUpBCG0jdS4TaILGEvMp3FKsrpkg==";
    public static String jwtHeader = "Authorization";

    public static String getJwtSecret() {
        return jwtSecret;
    }

    public static String getJwtHeader() {
        return jwtHeader;
    }
}
