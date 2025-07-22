package com.example.Project.Service;

import com.example.Project.Entity.Like;
import com.example.Project.Repo.LikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LikeService {

    @Autowired
    private LikeRepository likeRepository;

    public long countLikesByPostId(int postId) {
        return likeRepository.countByPostId(postId);
    }

    public boolean isPostLikedByUser(int userId, int postId) {
        return likeRepository.existsByUserIdAndPostId(userId, postId);
    }

    public Like addLike(Like like) {
        return likeRepository.save(like);
    }

    public void removeLike(int id) {
        likeRepository.deleteById(id);
    }
}
