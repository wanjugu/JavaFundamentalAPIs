package com.SpringFundamentalAPI.JavaFundamentalAPIs.Util;

import com.SpringFundamentalAPI.JavaFundamentalAPIs.Controllers.JsonOM.Users;
import com.SpringFundamentalAPI.JavaFundamentalAPIs.Controllers.JsonOM.Workers;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

@RequiredArgsConstructor
@Service
public class JsonOMHelpers {
    private final EnviromentalVariables enviromentalVariables;

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
    public static Object readerMapper() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        String workersJson = "{\"id\":1,\"name\":\"EdgarKim\",\"qualification\":\"MBBS\",\"yearsOfExperience\":1.5}";

        Reader reader = new StringReader(workersJson);
        Workers workers = objectMapper.readValue(reader,Workers.class);

        return  workers;
    }

    /**
     * Read File from a file
     * */
    public Object fileReader() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        String myFile = String.valueOf(enviromentalVariables.workersJsonFile);
        System.out.println(myFile);

        return null;

//        File file = new File(String.valueOf(enviromentalVariables.workersJsonFile));
//        Workers workers = objectMapper.readValue(file,Workers.class);
//
//        return workers;

    }

}
