package com.group.project.httpClient.service;

import java.io.IOException;

import com.group.project.httpClient.config.RestTemplateConfiguration;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class CallAPI {

  private static final Logger logger = LoggerFactory.getLogger(CallAPI.class);

  private final ObjectMapper objectMapper;
  private final RestTemplateConfiguration template;

  public CallAPI (ObjectMapper objectMapper, RestTemplateConfiguration template)  {
    this.objectMapper = objectMapper;
    this.template = template;
  }

  /**
   * API 호출 메소드 (GET)
   * 
   * @param url
   * @param parameter
   * @return
   * @throws Exception
   */
  public JsonNode get(String url, JSONObject parameter) throws RestClientException, IOException, Exception {
    try {
      HttpHeaders headers = template.getHeaders();
      HttpEntity<String> entity = new HttpEntity<String>(headers);

      logger.debug("START API(GET) CALLING >>>>> ");
      
      UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url);
      UriComponents uriComponent = null;

      if (parameter != null)  {

        for (Object key : parameter.keySet()) {
          String name = String.valueOf(key.toString());
          Object values = parameter.get(name);

          if (values instanceof List)  {
            for (Object value : (List<?>) values) {
              builder.queryParam(name, value);
            }
          } else {
            builder.queryParam(name, values);
          }
        }
        
        uriComponent = builder.encode().build();
      } else {
        uriComponent = builder.encode().build();
      }

      ResponseEntity<String> result = template.getRestTemplate().exchange(uriComponent.toUri(), HttpMethod.GET, entity, String.class);

      logger.debug("END API(GET) CALLING >>>>> ");

      if (result.getBody() == null) {
        throw new NullPointerException("CallAPI.get NullPointer");
      }

      return objectMapper.readTree(result.getBody());
    } catch (RestClientException e) {
      throw new RestClientException("CallAPI.get " + e.toString());
    } catch (IOException e) {
      throw new IOException("CallAPI.get " + e.toString());
    } 
  }
  
  /**
   * API 호출 메소드 (POST)
   * 
   * @param url
   * @param parameters
   * @return
   * @throws Exception
   */
  public JsonNode post(String url, JSONObject parameter) throws RestClientException, IOException {
    try {
      HttpHeaders headers = template.getHeaders();
      HttpEntity<String> entity = new HttpEntity<String>(headers);

      logger.debug("START API(GET) CALLING >>>>> ");

      UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url);
      UriComponents uriComponent = null;

      if (parameter != null) {
        for (Object key : parameter.keySet()) {
          String name = String.valueOf(key.toString());
          Object values = parameter.get(name);

          if (values instanceof List) {
            for (Object value : (List<?>) values) {
              builder.queryParam(name, value);
            }
          } else {
            builder.queryParam(name, values);
          }
        }

        uriComponent = builder.encode().build();
      } else {
        uriComponent = builder.encode().build();
      }
      // 한글 및 특수문자 파라미터를 전송하기위해서는 UriString 또는 toString 처럼 다시 인코딩을 해주는 방식을 사용하면 안된다.
      // Uri 객체로 만들어서 보내는 방법을 사용하면 한글 및 특수문자도 정확하게 전달할 수 있다.
      ResponseEntity<String> result = template.getRestTemplate().exchange(uriComponent.toUri(), HttpMethod.POST, entity, String.class);

      logger.debug("END API(GET) CALLING >>>>> ");

      if (result.getBody() == null) {
        throw new NullPointerException("CallAPI.post NullPointer");
      }

      return objectMapper.readTree(result.getBody());
    } catch (RestClientException e) {
      throw new RestClientException("CallAPI.post " + e.toString());
    } catch (IOException e) {
      throw new IOException("CallAPI.post " + e.toString());
    } 
    // try {
    //   String param = "";

    //   if (parameter != null)  {
    //     param = parameter.toJSONString();
    //   }

    //   HttpHeaders headers = template.getHeaders();
    //   HttpEntity<String> entity = new HttpEntity<String>(param, headers);
    //   logger.debug("START API(POST) CALLING >>>>> ");
    //   ResponseEntity<String> result = template.getRestTemplate().postForEntity(url, entity, String.class);
    //   logger.debug("END API(POST) CALLING >>>>> ");
    //   return objectMapper.readTree(result.getBody());
    // } catch (RestClientException e) {
    //   e.printStackTrace();
    //   return null;
    // } catch (IOException e) {
    //   e.printStackTrace();
    //   return null;
    // } catch (Exception e) {
    //   e.printStackTrace();
    //   return null;
    // }
  }
  
}