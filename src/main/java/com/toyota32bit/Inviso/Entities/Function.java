package com.toyota32bit.Inviso.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name="function")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Function {

    @Id
    private Long id;
    private String description;
    private String functionDetail;

    @ManyToOne
    @JoinColumn(name = "application_id")
    private Application application;

}
