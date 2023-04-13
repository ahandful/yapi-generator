package com.solution.lightsystem.service.impl;

import com.solution.lightsystem.entity.*;
import com.solution.lightsystem.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 照明系统首页
 *
 * @author paji
 * @date 2023/04/13
 */
@Service
public class StatisticsServiceImpl implements StatisticsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(StatisticsServiceImpl.class);

    @Override
    public RootDTO statistics() {
        return null;
    }

}