package org.example.expert.domain.user.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserChangePasswordRequest {

    @NotBlank
    private String oldPassword;

    //비밀번호 유효성 검사
    @Size(min = 8, message = "비밀번호는 8자 이상이어야 합니다.")
    @Pattern(regexp = ".*\\d.*", message = "비밀번호에는 최소 한 개의 숫자가 포함되어야 합니다.")
    @Pattern(regexp = ".*[A-Z].*", message = "비밀번호에는 최소 한 개의 대문자가 포함되어야 합니다.")

    @NotBlank
    private String newPassword;
}
