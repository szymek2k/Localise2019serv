package entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Setter
@Getter
@EqualsAndHashCode
@RequiredArgsConstructor
@ToString
@Entity
public class SampleData {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
}