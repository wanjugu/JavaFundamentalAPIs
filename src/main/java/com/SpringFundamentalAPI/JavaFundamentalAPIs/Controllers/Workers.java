package com.SpringFundamentalAPI.JavaFundamentalAPIs.Controllers;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Workers {

    @JsonProperty("worker_id")
    private int workerId;
    @JsonProperty("workerName")
    private String workername;
    @JsonProperty("worker_qualification")
    private String workerQualification;
    @JsonProperty("years_of_experience")
    private Double yearsOfExperience;
}
