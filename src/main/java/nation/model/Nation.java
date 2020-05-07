package nation.model;

import core.model.BaseEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import territory.model.Territory;

@Getter
@Setter
@Builder
public class Nation extends BaseEntity {
    @Builder.Default
    private String name;
    @Builder.Default
    private Territory territory;
}
