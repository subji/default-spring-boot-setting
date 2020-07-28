package com.group.project.guide.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "t_withdrawal_code")
public class Guide {
  
  @Id
  @Column(name = "withdrawal_code_seq")
  private Long withdrawalCodeSeq;

  @Column(name = "reason")
  private String reason;

}