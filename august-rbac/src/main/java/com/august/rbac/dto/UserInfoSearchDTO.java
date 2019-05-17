package com.august.rbac.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author zkning
 * @date 2018/7/23 17:35
 */
@Data
public class UserInfoSearchDTO extends PagerReqDTO {

    @ApiModelProperty(value = "用户名")
    private String userName;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "手机号码")
    private String mobile;

    @ApiModelProperty(value = "组别id")
    private Long groupId;

    @ApiModelProperty(value = "创建时间")
    private String createTime;

    @ApiModelProperty(value = "角色id")
    private Long roleId;

    @ApiModelProperty(value = "排除角色id")
    private Long notInRoleId;

    /**
     * 用户分组
     */
    List groupIds;
    List userIds;
    List notInUserIds;
}
