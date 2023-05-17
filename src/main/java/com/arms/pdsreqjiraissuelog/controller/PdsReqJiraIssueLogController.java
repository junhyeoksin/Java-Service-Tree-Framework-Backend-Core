/*
 * @author Dongmin.lee
 * @since 2023-03-29
 * @version 23.03.29
 * @see <pre>
 *  Copyright (C) 2007 by 313 DEV GRP, Inc - All Rights Reserved
 *  Unauthorized copying of this file, via any medium is strictly prohibited
 *  Proprietary and confidential
 *  Written by 313 developer group <313@313.co.kr>, December 2010
 * </pre>
 */
package com.arms.pdsreqjiraissuelog.controller;

import com.egovframework.javaservice.treeframework.controller.TreeAbstractController;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;

import com.arms.pdsreqjiraissuelog.model.PdsReqJiraIssueLogEntity;
import com.arms.pdsreqjiraissuelog.service.PdsReqJiraIssueLog;

@Slf4j
@Controller
@RequestMapping(value = {"/arms/pdsReqJiraIssueLog"})
public class PdsReqJiraIssueLogController extends TreeAbstractController<PdsReqJiraIssueLog, PdsReqJiraIssueLogEntity> {

    @Autowired
    @Qualifier("pdsReqJiraIssueLog")
    private PdsReqJiraIssueLog pdsReqJiraIssueLog;

    @PostConstruct
    public void initialize() {
        setTreeService(pdsReqJiraIssueLog);
    }

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

}