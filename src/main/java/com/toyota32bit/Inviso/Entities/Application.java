package com.toyota32bit.Inviso.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Table(name="application")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Application {
    @Id
    private Long id;
    private String createdAt;
    private String createdBy;
    private String description;
    private String name;
    private String shortName;
    private String updatedAt;
    private String updatedBy;
    private String versionNumber;
    private String logo;
    private Integer formType;

}
