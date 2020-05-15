package com.group.project.httpClient.service;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.group.project.httpClient.config.RestTemplateConfiguration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class CallAPI {

  private static final Logger logger = LoggerFactory.getLogger(CallAPI.class);

  private final RestTemplateConfiguration template;
  private final ObjectMapper objectMapper;

  public CallAPI (ObjectMapper objectMapper, RestTemplateConfiguration template)  {
    this.objectMapper = objectMapper;
    this.template = template;
  }

  /**
   * API 호출 메소드 (GET)
   * @param url
   * @param parameter
   * @return
   * @throws Exception
   */
  public JsonNode get(String url, Map<String, Object> parameter) throws RestClientException {
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

      if (result.getStatusCode().is2xxSuccessful()) {
        return objectMapper.readTree(result.getBody());
      } else {
        throw new RestClientException(result.toString());
      }
    } catch (RestClientException | IOException e) {
      logger.error(e.getMessage(), e);
      throw new RestClientException("CallAPI.get " + e.toString());
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
  public JsonNode post(String url, Map<String, Object> parameter) throws RestClientException {
    try {
      MultiValueMap<String, Object> parameters = new LinkedMultiValueMap<String, Object>();

      if (parameter != null) {
        for (Object key : parameter.keySet()) {
          String name = String.valueOf(key.toString());
          Object values = parameter.get(name);

          parameters.add(name, values);
        }
      }

      HttpHeaders headers = template.getHeaders();
      HttpEntity<?> entity = new HttpEntity<>(parameters, headers);

      logger.debug("START API(GET) CALLING >>>>> ");

      // 한글 및 특수문자 파라미터를 전송하기위해서는 UriString 또는 toString 처럼 다시 인코딩을 해주는 방식을 사용하면 안된다.
      // Uri 객체로 만들어서 보내는 방법을 사용하면 한글 및 특수문자도 정확하게 전달할 수 있다.
      ResponseEntity<String> result = template.getRestTemplate().exchange(url, HttpMethod.POST, entity, String.class);

      logger.debug("END API(GET) CALLING >>>>> ");

      if (result.getStatusCode().is2xxSuccessful()) {
        return objectMapper.readTree(result.getBody());
      } else {
        throw new RestClientException(result.getBody().toString());
      }
    } catch (RestClientException | IOException e) {
      logger.error(e.getMessage(), e);
      throw new RestClientException("CallAPI.post " + e.toString());
    }
  }
  
}