package com.mekill404.expense_tracker.model;

import javax.management.relation.Role;

import com.mekill404.expense_tracker.model.enumerate.Genre;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @Builder
@Table(name = "utilisateur")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class User {
	/**
	 * @Id: qui indique que c'est la clé primaire de la table
	 * @GeneratedValue: qui indique que la valeur de cette colonne sera générée automatiquement par la base de données
	 * @Column: qui permet de définir les propriétés de la colonne dans la base de données (unique, nullable, columnDefinition)
	 * @Enumerated: qui indique que cette colonne est de type énumération et qui permet de spécifier comment les valeurs de l'
	 * énumération seront stockées dans la base de donnée (EnumType.STRING pour stocker les
	 * valeurs de l'énumération sous forme de chaînes de caractères, EnumType.ORDINAL pour stocker les valeurs de
	 *  l'énumération sous forme d'entiers correspondant à leur position dans l'énumération)
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Column(unique = true, nullable = false, columnDefinition = "varchar(255)")
	private String email;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false, columnDefinition = "varchar(255) default 'ROLE_USER'")
    private Role role;

	@Column(name="telephone", nullable = false , columnDefinition = "varchar(255) default '00000000'")
	private String telephone;

	@Column(nullable = false, columnDefinition = "varchar(255)")
	private String password;

	@Column(nullable = false, columnDefinition = "varchar(255)")
	private String last_name;

	@Column(nullable = false, columnDefinition = "varchar(255)")
	private String first_name;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false, columnDefinition = "varchar(255) default 'HOMME'")
	private Genre genre;

	@Column(nullable = false, columnDefinition = "varchar(255) default 'https://www.w3schools.com/howto/img_avatar.png'")
	private String url_profil;
}
