package com.group.project.guide.repository;

import java.util.List;

import com.group.project.guide.entity.Guide;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuideRepository extends CrudRepository<Guide, Long> {
  
  List<Guide> findByWithdrawalCodeSeq(Long withdrawalCodeSeq);

}