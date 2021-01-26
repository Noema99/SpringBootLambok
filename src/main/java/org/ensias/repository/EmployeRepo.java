

// @RepositoryRestResource(collectionResourceRel="employes", path="employes")

//vous pouvez omettre cette annotation et voir que Spring Boot le prend en charge


package org.ensias.repository;

import org.ensias.modele.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepo extends JpaRepository<Employe, Integer> {
}
