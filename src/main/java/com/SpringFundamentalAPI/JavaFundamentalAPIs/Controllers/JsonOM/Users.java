package com.SpringFundamentalAPI.JavaFundamentalAPIs.Controllers.JsonOM;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Users {
    private int id;
    private String name;
    private String qualification;
    private Double yearsOfExperience;
}
