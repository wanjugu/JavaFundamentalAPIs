package com.SpringFundamentalAPI.JavaFundamentalAPIs.Controllers.JsonOM;


import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Workers {

    @JsonProperty("worker_id")
    @JsonAlias({"id","workerId"})
    private int workerId;
    @JsonProperty("worker_name")
    @JsonAlias("name")
    private String workerName;
    @JsonProperty("worker_qualification")
    @JsonAlias({"workerQualification", "qualification"})
    private String workerQualification;
    @JsonProperty("years_of_experience")
    @JsonAlias("yearsOfExperience")
    private Double yearsOfExperience;
}
