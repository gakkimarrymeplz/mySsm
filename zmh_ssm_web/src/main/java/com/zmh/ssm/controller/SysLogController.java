package com.zmh.ssm.controller;

import com.github.pagehelper.PageInfo;
import com.zmh.ssm.domain.SysLog;
import com.zmh.ssm.service.ISysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import java.util.List;

@Controller
@RequestMapping("/sysLog")
public class SysLogController {


    @Autowired

    private ISysLogService sysLogService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAll(@RequestParam(name = "page", required = true, defaultValue = "1") Integer page, @RequestParam(name = "size", required = true, defaultValue = "4") Integer size) throws Exception {

        ModelAndView mv = new ModelAndView();
        List<SysLog> sysLog = sysLogService.findAll(page,size);
        mv.addObject("sysLogs",sysLog);
        PageInfo pageInfo = new PageInfo(sysLog);
        mv.addObject("pageInfo", pageInfo);
        mv.setViewName("syslog-list");

        return mv;
    }
}
