package com.group.project.guide_api.dto;

public class GuideApiDTO {

  private String param1;
  private String param2;

  public String getParam1() {
    return param1;
  }

  public void setParam1(String param1) {
    this.param1 = param1;
  }

  public String getParam2() {
    return param2;
  }

  public void setParam2(String param2) {
    this.param2 = param2;
  }

  // DTO 객체의 로그 출력을 위해 toString Override
  @Override
  public String toString() {
    return "GuideApiDTO [param1=" + param1 + ", param2=" + param2 + "]";
  }

  // 객체 비교시 아래 두개의 메소드를 Override 해주어야 한다.
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((param1 == null) ? 0 : param1.hashCode());
    result = prime * result + ((param2 == null) ? 0 : param2.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    GuideApiDTO other = (GuideApiDTO) obj;
    if (param1 == null) {
      if (other.param1 != null)
        return false;
    } else if (!param1.equals(other.param1))
      return false;
    if (param2 == null) {
      if (other.param2 != null)
        return false;
    } else if (!param2.equals(other.param2))
      return false;
    return true;
  }
  
}