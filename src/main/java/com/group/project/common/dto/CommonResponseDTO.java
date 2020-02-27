package com.group.project.common.dto;

public class CommonResponseDTO {

  private int status;
  private String message;
  private Object data;

  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return "CommonResponseDTO [data=" + data + ", message=" + message + ", status=" + status + "]";
  }
  
}