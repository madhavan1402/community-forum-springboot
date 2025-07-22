package com.example.Project.Repo;

import com.example.Project.Entity.Like;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikeRepository extends JpaRepository<Like, Integer> {
    long countByPostId(int postId);
    boolean existsByUserIdAndPostId(int userId, int postId);
}
