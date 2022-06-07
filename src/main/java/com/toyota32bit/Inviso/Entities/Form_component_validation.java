package com.toyota32bit.Inviso.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name="form_component_validation")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Form_component_validation {
    @Id
    private Long id;
    private String  error_message;
    private String value;
    private int type;



    @ManyToOne
    @JoinColumn(name = "form_component_id")
    private Form_component form_component;

}
