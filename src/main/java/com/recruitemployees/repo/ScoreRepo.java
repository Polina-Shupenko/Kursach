package com.recruitemployees.repo;

import com.recruitemployees.model.Score;
import com.recruitemployees.model.enums.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScoreRepo extends JpaRepository<Score, Long> {
    public List<Score> findAllByOwner_Role(Role role);
}
