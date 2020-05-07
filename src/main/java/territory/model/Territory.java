package territory.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Territory {
    @Builder.Default
    private int x;
    @Builder.Default
    private int y;
    @Builder.Default
    private int width;
    @Builder.Default
    private int height;
}
