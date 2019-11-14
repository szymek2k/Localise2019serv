package com.Localise.demo;

import com.Localise.demo.entities.SampleData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.Localise.demo.repositories.SampleDataRepository;

import java.util.stream.Stream;

@Component
public class DataCommandLineRunner implements CommandLineRunner {


    private final SampleDataRepository repository;

    @Autowired
    public DataCommandLineRunner(SampleDataRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        Stream.of("Tom", "John", "Julius",
                "Mark").forEach(name ->
                repository.save(new SampleData(name))
        );
        repository.findAll().forEach(System.out::println);
    }


}
