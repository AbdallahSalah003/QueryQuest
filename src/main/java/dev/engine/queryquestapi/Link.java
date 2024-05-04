package dev.engine.queryquestapi;

import jakarta.validation.constraints.NotEmpty;

public record Link(
        @NotEmpty
        String url,
        @NotEmpty
        String content,
        @NotEmpty
        String description,
        @NotEmpty
        String title
) {
}
