package honchar.mycompany.mysite.service.api;

import honchar.mycompany.mysite.domain.Category;

import java.util.List;

public interface IndexService {
    List<Category> search(String query);
}
