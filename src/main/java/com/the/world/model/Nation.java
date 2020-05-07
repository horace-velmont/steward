package com.the.world.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Nation extends BaseEntity {
    @Builder.Default
    private String name;
    @Builder.Default
    private Territory territory;
}
