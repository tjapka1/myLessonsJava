package com.GetHelpe.GetHelperDemo.Repository;

import com.GetHelpe.GetHelperDemo.Entity.SkillCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillCardRepository extends JpaRepository<SkillCard, Long> {
}
