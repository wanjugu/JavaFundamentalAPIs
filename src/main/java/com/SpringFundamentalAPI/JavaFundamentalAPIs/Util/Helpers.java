package com.SpringFundamentalAPI.JavaFundamentalAPIs.Util;

import com.SpringFundamentalAPI.JavaFundamentalAPIs.Controllers.Users;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;


public class Helpers {

    /*Using Object Mapper Example*/


    /**Convert JSON to Object Array*/
    public static Object mapper() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        String user = "{\"id\":1,\"name\":\"RehamMuzzamil\",\"qualification\":\"MBBS\",\"yearsOfExperience\":1.5}";

        /**
         * Use ->readValue<- to convert a JSON String into a Java Object
         * */
        Users userData = objectMapper.readValue(user, Users.class);

        return userData;

    }

    /**
     * Convert Json String to Java Object with Readers
     * The readerValue() methods accepts a Reader
     * **/
//    public static Object



}
