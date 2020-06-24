package honchar.mycompany.mysite.service.impl;

import honchar.mycompany.mysite.domain.Category;
import honchar.mycompany.mysite.jpa.CategoryRepository;
import honchar.mycompany.mysite.service.api.IndexService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DbIndexService implements IndexService {

    private final CategoryRepository categoryRepository;

    public DbIndexService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Category> search(String query) {
        return (query != null && !query.isEmpty())
                ? categoryRepository.findAllByTitleLike("%" + query + "%")
                : categoryRepository.findAll();
        //List<Category> list = categoryRepository.findAll();
        /*return query != null && !query.isEmpty() ?
                categoryRepository.findAll().stream().filter(f -> f.getTitle().toLowerCase().matches(".*" + query.toLowerCase() + ".*"))
                .collect(Collectors.toList())
                : categoryRepository.findAll();*/
    }


/*   @PostConstruct
    public void setup(){
        categoryRepository.saveAll(Arrays.asList(
                Category.builder()
                        .title("Пицца плюс")
                        .time("50 мин")
                        .rating("4.5")
                        .price("От 900р.")
                        .description("Пицца")
                        .image("1.jpg")
                        .build(),
                Category.builder()
                        .title("Тануки")
                        .time("30 мин")
                        .rating("4.0")
                        .price("От 1500р.")
                        .description("Ролы")
                        .image("2.jpg")
                        .build(),
                Category.builder()
                        .title("FoodBand")
                        .time("70 мин")
                        .rating("4.8")
                        .price("От 1100р.")
                        .description("Пицца")
                        .image("3.jpg")
                        .build(),
                Category.builder()
                        .title("Жадина-пицца")
                        .time("50 мин")
                        .rating("4.5")
                        .price("От 900р.")
                        .description("Пицца")
                        .image("4.jpg")
                        .build(),
                Category.builder()
                        .title("Точка еды")
                        .time("50 мин")
                        .rating("4.5")
                        .price("От 900р.")
                        .description("Пицца")
                        .image("5.jpg")
                        .build(),
                Category.builder()
                        .title("Точка еды")
                        .time("50 мин")
                        .rating("4.5")
                        .price("От 900р.")
                        .description("Пицца")
                        .image("5.jpg")
                        .build(),
                Category.builder()
                        .title("Точка еды")
                        .time("50 мин")
                        .rating("4.5")
                        .price("От 900р.")
                        .description("Пицца")
                        .image("5.jpg")
                        .build(),
                Category.builder()
                        .title("Pizza-burger")
                        .time("50 мин")
                        .rating("4.5")
                        .price("От 900р.")
                        .description("Пицца")
                        .image("6.jpg")
                        .build()
        ));
    }*/
}
