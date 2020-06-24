package honchar.mycompany.mysite.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//dto - data transfer object

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDto {
    private String title;
    private String time;
    private String rating;
    private String price;
    private String description;
    private String image;
}
