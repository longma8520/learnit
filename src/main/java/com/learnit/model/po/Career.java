package com.learnit.model.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.UUID;

@Data
@Table(name = "career")
@Entity
@DynamicInsert
@DynamicUpdate
@ApiModel(value = "职业")
public class Career {
    @Id
    @Column(name = "career_id")
    @ApiModelProperty(value = "职业ID")
    private UUID careerId;

    @Column(name = "career_name")
    @ApiModelProperty(value = "职业名称")
    private String careerName;

    @Column(name = "category_id")
    @ApiModelProperty(value = "分类ID")
    private UUID categoryId;

    @Column(name = "sub_category_id")
    @ApiModelProperty(value = "子分类ID")
    private UUID subCategoryId;

    @Column(name = "sub_category_name")
    @ApiModelProperty(value = "子分类名称")
    private String subCategoryName;

    @Column(name = "career_code")
    @ApiModelProperty(value = "编码")
    private String careerCode;

    @Column(name = "description")
    @ApiModelProperty(value = "职业描述")
    private String description;

    @Column(name = "tag")
    @ApiModelProperty(value = "分类标签")
    private String tag;

    @Column(name = "create_time")
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @Column(name = "update_time")
    @ApiModelProperty(value = "更新时间")
    private Date updateTime;
}
