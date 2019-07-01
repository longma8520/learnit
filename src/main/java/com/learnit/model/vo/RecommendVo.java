package com.learnit.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("学习推荐")
public class RecommendVo {
    @ApiModelProperty("推荐类型")
    private String type;

    @ApiModelProperty("推荐内容")
    private String content;
}
