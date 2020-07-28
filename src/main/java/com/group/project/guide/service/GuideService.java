package com.group.project.guide.service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.JsonNode;
import com.group.project.guide.dto.GuideDTO;
import com.group.project.guide.entity.Guide;
import com.group.project.guide.repository.GuideRepository;
import com.group.project.httpClient.service.CallAPI;
import com.group.project.util.ModelMapperUtil;

import org.modelmapper.ModelMapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class GuideService {
  
  private final CallAPI callApi;
  private final GuideRepository guideRepository;
  private final SqlSessionTemplate sqlSessionTemplate;

  public GuideService(CallAPI callApi, SqlSessionTemplate sqlSessionTemplate, GuideRepository guideRepository) {
    this.callApi = callApi;
    this.guideRepository = guideRepository;
    this.sqlSessionTemplate = sqlSessionTemplate;
  }

  /**
   * TM2 요청 서비스 가이드
   * @param parameter
   * @return
   */
  public JsonNode getTm2Api(String tm2Url, @RequestParam Map<String, Object> parameter)  {
    return callApi.get(tm2Url, parameter);
  }

  /**
   * MyBatis 서비스 가이드
   * @param guideDTO
   * @return
   */
  public List<GuideDTO> selectGuideMapper(GuideDTO guideDTO) {
    return sqlSessionTemplate.selectList("guideMapper.selectGuideUserInfo", guideDTO);
  }

  /**
   * JPA 서비스 가이드
   * @param guideDTO
   * @return
   */
  public List<GuideDTO> findByWithdrawalCodeSeq(GuideDTO guideDTO) {
    ModelMapper modelMapper = new ModelMapperUtil().create();
    modelMapper.map(guideDTO, Guide.class);

    return guideRepository.findByWithdrawalCodeSeq(guideDTO.getWithdrawalCodeSeq()).stream().map(
      entity -> modelMapper.map(entity, GuideDTO.class)
    ).collect(Collectors.toList());
  }

}