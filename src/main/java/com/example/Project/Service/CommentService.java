package com.example.Project.Service;

import com.example.Project.Entity.Comment;
import com.example.Project.Repo.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public Page<Comment> getCommentsByPostId(int postId, Pageable pageable) {
        return commentRepository.findByPostId(postId, pageable);
    }

    public Optional<Comment> getCommentById(int id) {
        return commentRepository.findById(id);
    }

    public Comment createComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public Comment updateComment(int id, Comment updatedComment) {
        return commentRepository.findById(id).map(comment -> {
            comment.setText(updatedComment.getText());
            return commentRepository.save(comment);
        }).orElse(null);
    }

    public void deleteComment(int id) {
        commentRepository.deleteById(id);
    }
}
