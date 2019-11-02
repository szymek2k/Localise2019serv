package controller;

import entities.SampleData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repositories.SampleDataRepository;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
public class TranslationController {

    private SampleDataRepository repository;

    public TranslationController(SampleDataRepository repository) {
        this.repository = repository;
    }

    @RequestMapping("api/sampleData")
    public Collection<SampleData> lists() {
        return repository.findAll().stream()
                .collect(Collectors.toList());
    }

}
