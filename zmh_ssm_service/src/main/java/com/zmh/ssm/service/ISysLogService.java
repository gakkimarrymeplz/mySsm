package com.zmh.ssm.service;

import com.zmh.ssm.domain.SysLog;

import java.util.List;

public interface ISysLogService {
    public void save(SysLog sysLog) throws Exception;

    List<SysLog> findAll(Integer page,Integer size) throws Exception;
}
