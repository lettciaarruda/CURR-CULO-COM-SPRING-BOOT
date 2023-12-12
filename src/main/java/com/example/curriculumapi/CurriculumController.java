package com.example.curriculumapi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/curriculum")
public class CurriculumController {
    @Autowired
    private CurriculumRepository curriculumRepository;

    @GetMapping
    public List<Curriculum> getAllCurricula() {
        return curriculumRepository.findAll();
    }

    @PostMapping
    public Curriculum addCurriculum(@RequestBody Curriculum curriculum) {
        return curriculumRepository.save(curriculum);
    }
}
