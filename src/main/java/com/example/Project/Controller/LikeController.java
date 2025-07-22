package com.example.Project.Controller;

import com.example.Project.Entity.Like;
import com.example.Project.Service.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/likes")
public class LikeController {

    @Autowired
    private LikeService likeService;

    @GetMapping("/post/{postId}/count")
    public long countLikesByPost(@PathVariable int postId) {
        return likeService.countLikesByPostId(postId);
    }

    @GetMapping("/check")
    public boolean isPostLikedByUser(@RequestParam int userId, @RequestParam int postId) {
        return likeService.isPostLikedByUser(userId, postId);
    }

    @PostMapping
    public Like addLike(@RequestBody Like like) {
        return likeService.addLike(like);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removeLike(@PathVariable int id) {
        likeService.removeLike(id);
        return ResponseEntity.noContent().build();
    }
}
