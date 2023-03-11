package tn.mypartner.sga.service;



import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import tn.mypartner.sga.model.Article;
import tn.mypartner.sga.repository.ArticleRepository;

//defining the business logic  
@Service 

public class ArticleService {

	@Autowired  
	ArticleRepository aR;  
	//getting all books record by using the method findaAll() of CrudRepository  

	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Article> getAllArticles()   
	{  
		List<Article> articles = new ArrayList<Article>();  
		aR.findAll().forEach(Article1 -> articles.add(Article1));  
		return articles;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Article getArticlesById(int id)   
	{  
		return aR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Article Articles)   
	{  
		aR.save(Articles);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		aR.deleteById(id);  
	} 

}
