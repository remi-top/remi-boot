package ai.remi.boot.domain.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author DianJiu
 * @email dianjiuxyz@gmail.com
 * @desc 用户组角色表 GroupRoleVO对象
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
@Schema(description = "用户组角色表")
public class GroupRoleVO implements Serializable {
    private static final long serialVersionUID = -84676938248587399L;
    /**
     * ID
     */
    @Schema(description = "ID")
    private String id;
    /**
     * 用户组ID
     */
    @Schema(description = "用户组ID")
    private String groupId;
    /**
     * 用户组编码
     */
    @Schema(description = "用户组编码")
    private String groupCode;
    /**
     * 用户组名称
     */
    @Schema(description = "用户组名称")
    private String groupName;
    /**
     * 用户组英文名称
     */
    @Schema(description = "用户组英文名称")
    private String groupNameEn;
    /**
     * 用户组描述
     */
    @Schema(description = "用户组描述")
    private String groupRemark;
    /**
     * 用户组英文描述
     */
    @Schema(description = "用户组英文描述")
    private String groupRemarkEn;
    /**
     * 角色ID
     */
    @Schema(description = "角色ID")
    private String roleId;
    /**
     * 角色编码
     */
    @Schema(description = "角色编码")
    private String roleCode;
    /**
     * 是否启用（0停用 1启用）
     */
    @Schema(description = "是否启用（0停用 1启用）")
    private Integer status;
    /**
     * 是否删除（0正常 1删除）
     */
    @Schema(description = "是否删除（0正常 1删除）")
    private Integer deleted;
    /**
     * 乐观锁
     */
    @Schema(description = "乐观锁")
    private Long revision;
    /**
     * 部门租户ID
     */
    @Schema(description = "部门租户ID")
    private String deptTenantId;
    /**
     * 公司租户ID
     */
    @Schema(description = "公司租户ID")
    private String companyTenantId;
    /**
     * 创建人
     */
    @Schema(description = "创建人")
    private String createdBy;
    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Schema(description = "创建时间")
    private LocalDateTime createdAt;
    /**
     * 更新人
     */
    @Schema(description = "更新人")
    private String updatedBy;
    /**
     * 更新时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Schema(description = "更新时间")
    private LocalDateTime updatedAt;

}
