package com.dwes;




import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


/*
import com.dwes.repositories.CommentRepository;
import com.dwes.repositories.PostRepository;
import com.dwes.entities.Comment;
import com.dwes.entities.Post;
import org.springframework.beans.factory.annotation.Autowired;
*/



@Component
public class Seed implements ApplicationRunner{
	/**
	@Autowired
	PostRepository postrepository;
	
	@Autowired
	CommentRepository commentrepository;
*/
	@Override
	public void run(ApplicationArguments args) throws Exception {
		/**
			Post p1 = new Post("Titulo 1", "Comentario 1");
			Post p2 = new Post("Titulo 2", "Comentario 2");
			Post p3 = new Post("Titulo 3", "Comentario 3");
			
			postrepository.save(p1);
			postrepository.save(p2);
			postrepository.save(p3);
			
			Comment c1 = new Comment("Comentario 1", p1);
			Comment c2 = new Comment("Comentario 2", p1);
			Comment c3 = new Comment("Comentario 2", p3);
		
			
			commentrepository.save(c1);
			commentrepository.save(c2);
			commentrepository.save(c3);	*/

	}
	


}

