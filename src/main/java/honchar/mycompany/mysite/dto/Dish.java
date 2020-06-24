package honchar.mycompany.mysite.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Dish {
    private String title;
    private String description;
    private String price;
    private String image;
    private String category;
    private int inBasket;
}
