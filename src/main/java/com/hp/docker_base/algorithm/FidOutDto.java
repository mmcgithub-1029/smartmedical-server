package com.hp.docker_base.algorithm;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @description: 算法输出结果
 * @author: biyangqiang
 * @time: 2020/8/31 17:39
 */
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Data
public class FidOutDto {

    @ApiModelProperty(value = "诊疗记录Id", example = "诊疗记录Id")
    private String RecId;

    @ApiModelProperty(value = "科室Id", example = "科室Id")
    private String DeptId;

    private List<DataOutDto> Result;

    private List<ActivedRulesDto> ActivedRules;

}
