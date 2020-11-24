package com.example.netty.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author shawn
 * @date 2020/09/02
 */
@Data
public class ChatMsg implements Serializable {
    private Long id;

    private Integer sendUserId;

    private Integer acceptUserId;

    private String msg;

    /**
     * 消息是否签收状态
     * 1：签收
     * 0：未签收
     */

    private Integer signFlag;

    /**
     * 发送请求的事件
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;


}