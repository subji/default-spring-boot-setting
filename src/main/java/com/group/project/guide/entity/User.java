package com.group.project.guide.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
@Table(name = "T_USER_INFO")
public class User {

  @Id
  @Column(name = "USER_SEQ")
  private String userSeq;

  @Column(name = "USER_ID")
  private String userId;

  @Column(name = "PASSWORD")
  private String password;

  @Column(name = "USER_GRP_CD")
  private String userGrpCd;

  @Column(name = "USER_NM")
  private String userNm;

  @Column(name = "PHONE")
  private String phone;

  @Column(name = "USER_BELONG")
  private String userBelong;

  @Column(name = "USER_EMAIL_RECEIVE_YN")
  private String userEmailReceiveYn;

  @Column(name = "USER_MSG_RECEIVE_YN")
  private String userMsgReceiveYn;

  @Column(name = "DB_LOGIN")
  private String dbLogin;

  @Column(name = "LOGIN_ATTEMPT")
  private String loginAttempt;

  @Column(name = "DEL_YN")
  private String delYn;

  @Column(name = "RGST_DT_HMS")
  private Timestamp rgstDtHms;

  @Column(name = "UPD_DT_HMS")
  private Timestamp updDtHms;

  @Column(name = "SVC_START_DT")
  private Timestamp svcStartDt;

  @Column(name = "SVC_END_DT")
  private Timestamp svcEndDT;

  @Column(name = "SALES_ROUTE")
  private String salesRoute;

  @Column(name = "MEMBERSHIP")
  private String membership;

  @Column(name = "FOR_FREE_YN")
  private String forFreeYn;

  @Column(name = "CORP_ID")
  private String corpId;

  @Column(name = "USER_DEPT")
  private String userDept;

  @Column(name = "INVITE_COUNT")
  private String inviteCount;

}