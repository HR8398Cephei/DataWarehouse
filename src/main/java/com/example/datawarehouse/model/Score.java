package com.example.datawarehouse.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
@Entity
public class Score {

    @Id
    @Min(0)
    @Max(500)
    private Integer score;

    @Min(0)
    private Integer movieCount;
}
