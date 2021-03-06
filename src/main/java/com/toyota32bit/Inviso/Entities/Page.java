package com.toyota32bit.Inviso.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Table(name="page")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Page {
    @Id
    private Long id;
    private String createdAt;
    private String createdBy;
    private String title;
    private String updatedAt;
    private String  updatedBy;
    private Boolean homePage;
    private Integer pageNumber;
}
