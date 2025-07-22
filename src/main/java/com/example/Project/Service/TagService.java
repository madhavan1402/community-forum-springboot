package com.example.Project.Service;

import com.example.Project.Entity.Tag;
import com.example.Project.Repo.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;

@Service
public class TagService {

    @Autowired
    private TagRepository tagRepository;

    public List<Tag> getAllTags() {
        return tagRepository.findAll();
    }

    public Optional<Tag> getTagById(int id) {
        return tagRepository.findById(id);
    }

    public Optional<Tag> getTagByName(String name) {
        return tagRepository.findByName(name);
    }

    public Tag createTag(Tag tag) {
        return tagRepository.save(tag);
    }

    public Tag updateTag(int id, Tag updatedTag) {
        return tagRepository.findById(id).map(tag -> {
            tag.setName(updatedTag.getName());
            return tagRepository.save(tag);
        }).orElse(null);
    }

    public void deleteTag(int id) {
        tagRepository.deleteById(id);
    }
}
