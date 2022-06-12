package com.toyota32bit.Inviso.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="function_type")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FunctionType {
    @Id
    private Long id;
    private String value;
    private String name;
}
