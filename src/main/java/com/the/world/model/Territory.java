package com.the.world.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Territory {
    @Builder.Default
    private int x = 0;
    @Builder.Default
    private int y = 0;
    @Builder.Default
    private int width = 0;
    @Builder.Default
    private int height = 0;
}
