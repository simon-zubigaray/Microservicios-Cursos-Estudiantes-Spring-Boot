package js.zubigaray.gateway.controller.dto;

import jakarta.validation.constraints.NotNull;

public record AuthLoginRequest (
    @NotNull String username,
    @NotNull String password
) {
}
