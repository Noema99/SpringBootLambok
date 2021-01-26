package org.ensias.modele;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Entity
@Data //Annotation de Lombok qui va servir à générer les setters et getters en plus du constructeur
public class Employe {
	@Id
	@GeneratedValue
private int id;
private String nom;
private String cours;
}
