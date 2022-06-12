package com.toyota32bit.Inviso.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="option")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Option {

    @Id
    private Long id;
    private String name;
    private String key;
    private String orderNumber;
    private String value;
    private Integer optionTypeId;
}
