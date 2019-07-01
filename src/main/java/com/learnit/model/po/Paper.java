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
@Table(name = "paper")
@Entity
@DynamicInsert
@DynamicUpdate
@ApiModel(value = "文章")
public class Paper {
    @Id
    @Column(name = "paper_id")
    @ApiModelProperty(value = "文章ID")
    private UUID paperId;

    @Column(name = "career_id")
    @ApiModelProperty(value = "职业ID")
    private UUID careerId;

    @Column(name = "title")
    @ApiModelProperty(value = "文章标题")
    private String title;

    @Column(name = "field")
    @ApiModelProperty(value = "领域方向")
    private String field;

    @Column(name = "creator_name")
    @ApiModelProperty(value = "创建者名称")
    private String creatorName;

    @Column(name = "creator_id")
    @ApiModelProperty(value = "创建者id")
    private Long creatorId;

    @Column(name = "description")
    @ApiModelProperty(value = "职业描述")
    private String description;

    @Column(name = "tag")
    @ApiModelProperty(value = "分类标签")
    private String tag;

    @Column(name = "objective")
    @ApiModelProperty(value = "目标")
    private String objective;

    @Column(name = "knowledges")
    @ApiModelProperty(value = "知识点清单，json格式")
    private String knowledges;

    @Column(name = "recommend")
    @ApiModelProperty(value = "推荐清单，json格式")
    private String recommend;

    @Column(name = "create_time")
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @Column(name = "update_time")
    @ApiModelProperty(value = "更新时间")
    private Date updateTime;
}
