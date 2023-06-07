package com.SpringFundamentalAPI.JavaFundamentalAPIs.Controllers;

import com.SpringFundamentalAPI.JavaFundamentalAPIs.Util.Helpers;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ApplicationRun {
    private static Helpers helpers;

    public static void main(String[] args) throws JsonProcessingException {
        System.out.println(getUsers());

    }

    public static Object getUsers() throws JsonProcessingException {

        Object jsonObject = helpers.mapper();

        return jsonObject;
    }


}
