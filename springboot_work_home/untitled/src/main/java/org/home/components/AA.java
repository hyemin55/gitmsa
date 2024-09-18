package org.home.components;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data // 모두 포함되어 있다.(Getter, Setter, ToString,AllArgsConstructor,NoArgsConstructor)
@Component
public class AA {
    private String name;
}
