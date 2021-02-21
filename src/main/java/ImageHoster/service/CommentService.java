package ImageHoster.service;

import ImageHoster.model.Comment;
import ImageHoster.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Comment Service Created
@Service
public class CommentService {
    
    @Autowired
    CommentRepository repository;

    public Comment uploadComment(Comment comment1) {
        return repository.uploadComment(comment1);
    }
}
