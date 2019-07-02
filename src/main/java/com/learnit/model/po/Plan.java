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
import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.UUID;

@Data
@Table(name = "plan")
@Entity
@DynamicInsert
@DynamicUpdate
@ApiModel(value = "学习计划")
public class Plan {
    @Id
    @Column(name = "id")
    @ApiModelProperty(value = "自增主键")
    private int id;

    @Column(name = "paper_id")
    @ApiModelProperty(value = "文章ID")
    @NotBlank(message="文章ID不能为空")
    private UUID paperId;

    @Column(name = "access_url")
    @ApiModelProperty(value = "附件地址")
    private String accessUrl;

    @Column(name = "create_time")
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @Column(name = "update_time")
    @ApiModelProperty(value = "更新时间")
    private Date updateTime;
}
