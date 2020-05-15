package com.group.project.guide.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "T_ORDER_INFO")
public class Guide {
  
  @Id
  @Column(name = "ORDER_INFO_SEQ")
  private String orderInfoSeq;

  @Column(name = "USER_SEQ")
  private String userSeq;

  @Column(name = "REGISTER_DATE")
  private String registerDate;

  @Column(name = "UPDATE_DATE")
  private String updateDate;

  @Column(name = "IN_USE_YN")
  private String inUseYn;

  // @ManyToOne(fetch = FetchType.LAZY)
  // @JoinColumn(name = "USER_SEQ", insertable = false, updatable = false)
  // private User user;

}