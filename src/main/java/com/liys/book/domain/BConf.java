package com.liys.book.domain;

import java.util.Date;

import lombok.Data;

/**
 * 业务参数配置
 * 
 * @author wcyong
 * 
 * @date 2019-08-26
 */
@Data
public class BConf {
    /**
     * id
     */
    private Integer id;

    /**
     * pid
     */
    private Integer pid;

    /**
     * 1:开启
            2:关闭
     */
    private Byte state;

    /**
     * 备注
     */
    private String remark;

    /**
     * 是否删除
     */
    private Boolean isDelete;

    /**
     * 创建人
     */
    private Integer creatorId;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 修改人
     */
    private Integer updaterId;

    /**
     * 修改时间
     */
    private Date updaterDate;

}