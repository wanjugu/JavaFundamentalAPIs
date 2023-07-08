package com.SpringFundamentalAPI.JavaFundamentalAPIs.Util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;


@Component
public class EnviromentalVariables {
    @Value("classpath:workers.json")
    public Resource workersJsonFile;

}
