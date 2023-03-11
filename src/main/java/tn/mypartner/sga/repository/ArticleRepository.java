package tn.mypartner.sga.repository;

import org.springframework.data.repository.CrudRepository;
import tn.mypartner.sga.model.Article;  
//repository that extends CrudRepository  

public interface ArticleRepository extends CrudRepository<Article, Integer>  
{  
}  
