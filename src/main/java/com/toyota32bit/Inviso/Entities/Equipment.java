package com.toyota32bit.Inviso.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Table(name="equipment")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Equipment {
    @Id
    private Long id;
    private Date created_at;
    private String created_by;
    private String description;
    private String name;
    private String serial_number;
    private int status;
    private Date updated_at;
    private String updated_by;

    @ManyToOne
    @JoinColumn(name = "equipment_type_id")
    private Equipment_type equipment_type;

}
