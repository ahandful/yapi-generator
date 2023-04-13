package com.solution.lightsystem.controller;

import com.solution.lightsystem.entity.*;
import com.solution.lightsystem.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 照明系统首页
 *
 * @author paji
 * @date 2023/04/13
 */
@RestController
@RequestMapping("/")
public class StatisticsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(StatisticsController.class);

    @Autowired
    private StatisticsService statisticsService;

    /**
     * 照明系统首页
     *
     * @return rootDTO
     */
    @RequestMapping(value = "/v1.0/solutions/suite-core/lighting-system/statistics", method = RequestMethod.GET)
    public RootDTO statistics() {
        return statisticsService.statistics();
    }

}