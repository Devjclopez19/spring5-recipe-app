package guru.springframework.spring5recipeapp.repositories;

import guru.springframework.spring5recipeapp.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
