package web.app.api.model;

import lombok.*;

@NoArgsConstructor
@Data
@Builder
@AllArgsConstructor
@Getter
public class Company {
    private String name;
    private String catchPhrase;
    private String bs;
}
