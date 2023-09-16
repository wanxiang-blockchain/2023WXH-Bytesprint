package com.bytesprint.domain.project.repository;

import com.bytesprint.domain.project.model.Requirement;

import java.util.List;

/**
 * RequirementRepository
 *
 * @author Eason Liu
 * Create at: 2023/9/15
 */
public interface RequirementRepository {
    List<Requirement> retrieveRequirementList(long projectId);
}
