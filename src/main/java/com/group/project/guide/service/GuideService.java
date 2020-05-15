package com.group.project.guide.service;

import java.util.List;

import com.group.project.guide.dto.GuideMapperDTO;
import com.group.project.guide.entity.Guide;
import com.group.project.guide.repository.GuideRepository;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

@Service
public class GuideService {
  
  private final GuideRepository guideRepository;
  private final SqlSessionTemplate sqlSessionTemplate;

  public GuideService (SqlSessionTemplate sqlSessionTemplate, GuideRepository guideRepository) {
    this.guideRepository = guideRepository;
    this.sqlSessionTemplate = sqlSessionTemplate;
  }

  /**
   * MyBatis Guide 
   * @param guideMapperDTO
   * @return
   */
  public List<GuideMapperDTO> selectGuideMapper (GuideMapperDTO guideMapperDTO) {
    return sqlSessionTemplate.selectList("guideMapper.selectGuideUserInfo", guideMapperDTO);
  }

  /**
   * JPA Guide
   * @param userSeq
   * @return
   */
  public List<Guide> findByUserSeq (String userSeq) {
    return guideRepository.findByUserSeq(userSeq);
  }

}