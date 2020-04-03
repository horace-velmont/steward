package nation.model.entity;

import core.model.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import territory.model.Territory;

@Getter
@Setter
public class Nation extends BaseEntity {
    private String name;
    private Territory territory;
}
