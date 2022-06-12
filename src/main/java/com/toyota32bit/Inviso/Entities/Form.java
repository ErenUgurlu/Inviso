package com.toyota32bit.Inviso.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="form")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Form {
    @Id
    private Long id;
    private String title;
    private String shortName;
}
