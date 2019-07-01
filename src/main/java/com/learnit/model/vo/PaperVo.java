package com.learnit.model.vo;

import com.learnit.model.po.Paper;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel(value = "文章信息")
public class PaperVo extends Paper {
    @ApiModelProperty(value = "文章图片地址")
    private List<String> accessUrls;

    @ApiModelProperty(value = "学习推荐")
    private List<RecommendVo> recommends;

}
