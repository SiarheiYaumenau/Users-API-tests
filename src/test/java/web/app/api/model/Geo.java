package web.app.api.model;

import lombok.*;

@NoArgsConstructor
@Data
@Builder
@AllArgsConstructor
@Getter
public class Geo {
    private String lat;
    private String lng;
}
