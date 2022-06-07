package com.toyota32bit.Inviso.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name="application")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Application {
    @Id
    private Long id;
    private Date created_at;
    private String created_by;
    private String description;
    private String name;
    private String shor_name;
    private Date updated_at;
    private String updated_by;
    private String version_number;
    private String logo;
    private boolean status;
    private int form_type;

}
