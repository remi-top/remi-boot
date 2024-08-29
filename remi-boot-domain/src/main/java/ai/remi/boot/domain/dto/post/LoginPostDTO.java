package ai.remi.boot.domain.dto.post;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.io.Serializable;

/**
 * @author DianJiu
 * @email dianjiuxyz@gmail.com
 * @desc 用户登录
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
@Schema(description = "用户表")
public class LoginPostDTO implements Serializable {

    private static final long serialVersionUID = -48342054464737753L;

    /**
     * 登录账号
     */
    @Schema(description = "登录账号")
    private String loginName;

    /**
     * 登录密码
     */
    @Schema(description = "登录密码")
    private String password;


}
