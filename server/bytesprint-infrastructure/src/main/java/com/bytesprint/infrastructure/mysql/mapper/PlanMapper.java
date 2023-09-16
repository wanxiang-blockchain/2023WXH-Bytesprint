package com.bytesprint.infrastructure.mysql.mapper;

import com.bytesprint.infrastructure.mysql.pojo.PlanPojo;

import java.util.List;

/**
 * @author Eason Liu
 */
public interface PlanMapper {

    int insertPlan(PlanPojo object);

    int updatePlan(PlanPojo object);

    List<PlanPojo> queryPlan(PlanPojo object);

    PlanPojo queryPlanLimit1(PlanPojo object);

}