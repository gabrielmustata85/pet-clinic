package pet.clinic.model;

import lombok.*;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "owners")
public class Owner extends Person{

    @Column(name="address")
    private String address;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "city")
    private String city;

    //fyi: (cascade) if we delete an owner, the pet will be deleted as well
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private Set<Pet> pets = new HashSet<>();


}
