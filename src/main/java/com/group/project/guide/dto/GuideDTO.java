package com.group.project.guide.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GuideDTO {
  
  private Long withdrawalCodeSeq;
  private String reason;

}