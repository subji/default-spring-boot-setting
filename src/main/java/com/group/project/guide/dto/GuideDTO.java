package com.group.project.guide.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GuideDTO {
  
  private String lang;
  private String topN;
  private String source;
  private String endDate;
  private String keyword;
  private String command;
  private String startDate;
  private String categorySetName;
  private String[] outputOption;
  private String cutOffFrequencyMin;
  private String cutOffFrequencyMax;

}