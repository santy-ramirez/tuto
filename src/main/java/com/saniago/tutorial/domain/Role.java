package com.saniago.tutorial.domain;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import  jakarta.persistence.Id;
@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "roles")
public class Role {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long Id;
   @NotNull
   @Enumerated(EnumType.STRING)
   private ERole name;

}
