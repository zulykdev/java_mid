package com.brixton.input.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Setter
@Getter
@ToString
public class Pet extends ObjectAudit{

    int id;
    String name;
    LocalDate birthdate;
    Category category;
    PetStatusType status;
}
