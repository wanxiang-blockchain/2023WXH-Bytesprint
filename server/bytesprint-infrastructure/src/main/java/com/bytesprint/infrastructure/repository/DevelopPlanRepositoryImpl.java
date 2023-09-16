package com.bytesprint.infrastructure.repository;

import com.bytesprint.infrastructure.mysql.mapper.PlanMapper;
import com.bytesprint.infrastructure.mysql.pojo.PlanPojo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

/**
 * @Author: hc.wan
 * @CreateTime: 2023-09-11 01:48
 * @Description:
 */
@Repository
@RequiredArgsConstructor
public class DevelopPlanRepositoryImpl {
    private final PlanMapper planMapper;

    public PlanPojo queryProjectPlan(int projectId) {
        return new PlanPojo();
    }
}
