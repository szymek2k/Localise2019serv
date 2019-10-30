
package repositories;

import entities.SampleData;
import org.springframework.data.jpa.repository.JpaRepository;

interface SampleDataRepository extends JpaRepository<SampleData, Long> {
}