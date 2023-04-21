package ku.book.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
public class SignupDto {

    @NotBlank
    private String username;

    @NotBlank
    private String password;

    @NotBlank(message = "First name is required")
    private String name;

    @NotBlank
    @Pattern(regexp = "^(ROLE_ADMIN|ROLE_USER)$", message = "Role is in an incorrect format.")
    private String role;
}
