package com.solution.lightsystem.entity;

import com.solution.lightsystem.entity.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * RootDTO
 *
 * @author paji
 * @date 2023/04/13
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RootDTO {

    /**
     * scene_count
     */
    private Double scene_count;

    /**
     * device_group_count
     */
    private Double device_group_count;

    /**
     * device_count
     */
    private Double device_count;

}
