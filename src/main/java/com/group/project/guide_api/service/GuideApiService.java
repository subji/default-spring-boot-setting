package com.group.project.guide_api.service;

import com.group.project.guide_api.dto.GuideApiDTO;
import com.group.project.httpClient.service.CallAPI;

import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class GuideApiService {

  private static final Logger logger = LoggerFactory.getLogger(GuideApiService.class);

  // 생성자 주입 방식은 final 로 선언이 가능하다.
  // 단위 테스트 및 확실한 에러 체크 가능 (생성자로 객체가 넘어오지 않으면 오류)
  // @Autowired 는 수정자 주입 방식으로써 오류 검출에 약함
  // 수정자 주입은 Setter 방식으로서 객체 생성에 제한이 없다.
  // 그러므로 Null 에러가 발생한다.
  private final CallAPI callApi;

  public GuideApiService (CallAPI callAPI)  {
    this.callApi = callAPI;
  }

  // URL 을 새로운 파라미터로 넘겨주어도 되고, DTO 객체에 넣어서 넘겨주어도 된다.
  public Object getGuideApiData (String url, GuideApiDTO guideApiDTO) throws Exception {

    JSONObject obj = new JSONObject();
    obj.put("param1 key name", guideApiDTO.getParam1());
    obj.put("param2 key name", guideApiDTO.getParam2());

    // return callApi.callGet(url, obj); // GET
    // return callApi.callPost(url, obj);  // POST
    return callApi.callPost(url, obj);
  }
  
}