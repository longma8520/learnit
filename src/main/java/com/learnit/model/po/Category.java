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
@Table(name = "category")
@Entity
@DynamicInsert
@DynamicUpdate
@ApiModel(value = "职业分类")
public class Category {
    @Id
    @Column(name = "category_id")
    @ApiModelProperty(value = "分类ID")
    private UUID categoryId;

    @Column(name = "category_name")
    @ApiModelProperty(value = "分类名称")
    private String categoryName;

    @Column(name = "category_code")
    @ApiModelProperty(value = "分类编码")
    private String categoryCode;

    @Column(name = "description")
    @ApiModelProperty(value = "分类描述")
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
