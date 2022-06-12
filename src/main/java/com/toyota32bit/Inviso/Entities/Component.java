package com.toyota32bit.Inviso.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="component")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter



public class Component {
    @Id
    private Long id;
    private Integer colNumber;
    private Integer rowNumber;
    private String colSize;
    private String type;
    private String ShortName;
    private Boolean datasourceType;

}
