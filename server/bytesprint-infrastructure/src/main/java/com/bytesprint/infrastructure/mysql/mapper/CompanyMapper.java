package com.bytesprint.infrastructure.mysql.mapper;

import com.bytesprint.infrastructure.mysql.pojo.CompanyPojo;

import java.util.List;

/**
 * @author Eason Liu
 */
public interface CompanyMapper {

    int insertCompany(CompanyPojo object);

    int updateCompany(CompanyPojo object);

    List<CompanyPojo> queryCompany(CompanyPojo object);

    CompanyPojo queryCompanyLimit1(CompanyPojo object);

}