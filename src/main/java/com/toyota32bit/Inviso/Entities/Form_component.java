package com.toyota32bit.Inviso.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Table(name="form_component")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Form_component {
    @Id
    private Long id;
    private Date created_at;
    private String created_by;
    private String short_name;
    private Date updated_at;
    private String updated_by;
    private String version;
    private String col_size;
    private int col_number;
    private int row_number;
    private String description;
    private String col_align;
    private Boolean datasource_type;

    @ManyToOne
    @JoinColumn(name = "component_id")
    private Component component;

    @ManyToOne
    @JoinColumn(name = "form_id")
    private Form form;

    @ManyToOne
    @JoinColumn(name = "versions_id")
    private Version versions;

}
