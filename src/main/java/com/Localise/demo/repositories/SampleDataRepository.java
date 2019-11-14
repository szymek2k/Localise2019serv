
package com.Localise.demo.repositories;

import com.Localise.demo.entities.SampleData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleDataRepository extends JpaRepository<SampleData, Long> {
}