drop table if exists category;

/*==============================================================*/
/* Table: category                                              */
/*==============================================================*/
create table category
(
   category_id          varchar(36) not null comment '分类ID',
   category_name        varchar(256) not null comment '分类名称',
   category_code        varchar(256) comment '分类编码',
   description          varchar(256) comment '分类描述',
   tag                  varchar(256) comment '分类标签',
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
   update_time          timestamp not null default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
   primary key (category_id)
);

alter table category comment '职业分类';

drop table if exists career;

/*==============================================================*/
/* Table: career                                                */
/*==============================================================*/
create table career
(
   career_id            varchar(36) not null comment '职业ID',
   career_name          varchar(256) not null comment '职业名称',
   category_id          varchar(36) not null comment '分类ID',
   sub_category_id      varchar(36) comment '子分类ID',
   sub_category_name    varchar(256) comment '子分类名称',
   career_code          varchar(256) comment '编码',
   description          varchar(256) comment '职业描述',
   tag                  varchar(256) comment '职业标签',
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
   update_time          timestamp not null default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
   primary key (career_id)
);

alter table career comment '职业';

drop table if exists paper;

/*==============================================================*/
/* Table: paper                                                 */
/*==============================================================*/
create table paper
(
   paper_id             varchar(36) not null comment '文章id',
   career_id            varchar(36) comment '职业ID',
   title                varchar(256) comment '文章标题',
   field                varchar(256) comment '领域方向',
   creator_name         varchar(256) not null comment '创建者名称',
   creator_id           bigint(20) comment '创建者id',
   description          varchar(256) comment '描述',
   tag                  varchar(256) comment '文章标签',
   objective            varchar(512) comment '目标',
   recommend            char(10) comment '推荐清单，json格式',
   knowledges           varchar(512) comment '知识点清单，json格式存储',
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
   update_time          timestamp not null default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
   primary key (paper_id)
);

alter table paper comment '文章';

drop table if exists attachement;

/*==============================================================*/
/* Table: attachement                                           */
/*==============================================================*/
create table attachment
(
   id                   int(11) not null auto_increment comment '主键ID',
   paper_id             varchar(36) not null comment '文章id',
   base64               varchar(36) comment '附件base64编码',
   access_url           varchar(512) not null comment '附件地址',
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
   update_time          timestamp not null default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
   primary key (id)
);

alter table attachment comment '文章附件';

drop table if exists plan;

/*==============================================================*/
/* Table: plan                                                  */
/*==============================================================*/
create table plan
(
   id                   int(11) not null auto_increment comment '主键ID',
   paper_id             varchar(36) not null comment '文章ID',
   title                varchar(256) not null comment '标题',
   access_url           varchar(512) comment '图片地址',
   content              varchar(512) not null comment '内容',
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
   update_time          timestamp not null default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
   primary key (id)
);

alter table plan comment '学习计划';

