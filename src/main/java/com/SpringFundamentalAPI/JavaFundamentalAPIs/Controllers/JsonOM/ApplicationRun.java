package com.SpringFundamentalAPI.JavaFundamentalAPIs.Controllers.JsonOM;

import com.SpringFundamentalAPI.JavaFundamentalAPIs.Util.EnviromentalVariables;
import com.SpringFundamentalAPI.JavaFundamentalAPIs.Util.JsonOMHelpers;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.AllArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.IOException;


@AllArgsConstructor
@Service
public class ApplicationRun {
    private static JsonOMHelpers helpers;

    private static EnviromentalVariables enviromentalVariables;

    private final Resource resource = enviromentalVariables.workersJsonFile;

    public static void main(String[] args) throws IOException {
        System.out.println("Users::" + getUsers());
        System.out.println("Workers::" + getWorkers());
//        System.out.println("Read Workers From File::" + getWorkersFromFiles());
        getResource();

    }

    public static Object getUsers() throws JsonProcessingException {

        Object jsonObject = helpers.mapper();

        return jsonObject;
    }

    public static Object getWorkers() throws IOException {

        Object jsonObject = helpers.readerMapper();

        return jsonObject;
    }

    public static Object getWorkersFromFiles() throws IOException {

        Object jsonObject = helpers.fileReader();

        return jsonObject;
    }

    public static Resource getResource(){

        return enviromentalVariables.workersJsonFile;
    }


}
