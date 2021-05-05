package com.example.demo.excelUpload;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Card")
@Table
public class Card {
    private String code;
    private String section;
    @Id
    private String taskNumber ;
    private String sourceTaskRef;
    private String access;
    private String preparation;
    private String zone ;
    private String description;
    private String skillCode;
    private String taskCode;
    private String sampleThreshold;
    private String sampleInterval;
    private String threshold;
    private String interval;
    private String source;
    private String tci;
    private String tps;
    private String reference;
    private String men;
    private String taskMH;
    private String accessMH;
    private String prepMH;
    private String applicability;

}
