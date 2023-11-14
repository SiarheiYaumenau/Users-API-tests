package web.app.api.model;

import lombok.*;

@NoArgsConstructor
@Data
@Builder
@AllArgsConstructor
@Getter
public class Address {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Geo geo;
}
