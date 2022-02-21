package com.dnd.user.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yanhao
 * @date 2022/2/18 16:52
 * @description
 */
@Data
public class UserBaseVo implements Serializable {

    private static final long serialVersionUID = 6055987220878353080L;

    private Long id;

    private String name;

    private String mobile;
}
