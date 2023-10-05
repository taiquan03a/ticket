package com.ptit.ticket.Repositories;

import com.ptit.ticket.Models.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,String> {
}
