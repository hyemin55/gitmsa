package org.pmh.components;

import lombok.*;
import org.springframework.stereotype.Component;

@Data
//Data를 사용해도 되고 아래 롬복을 모두 적어줘도 된다.
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Component
public class AA {
    private String name;
}
