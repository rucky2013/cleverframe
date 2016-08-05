package org.cleverframe.quartz.controller;

import org.cleverframe.common.controller.BaseController;
import org.cleverframe.quartz.QuartzBeanNames;
import org.cleverframe.quartz.service.QrtzJobLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 作者：LiZW <br/>
 * 创建时间：2016-8-5 11:08 <br/>
 */
@SuppressWarnings("MVCPathVariableInspection")
@Controller
@RequestMapping(value = "/${mvcPath}/quartz/joblog")
public class QrtzJobLogController extends BaseController {

    @Autowired
    @Qualifier(QuartzBeanNames.QrtzJobLogService)
    private QrtzJobLogService qrtzJobLogService;

}
