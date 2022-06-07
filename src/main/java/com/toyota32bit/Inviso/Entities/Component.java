package com.toyota32bit.Inviso.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name="component")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Component {
    @Id
    private Long id;
    private Date created_at;
    private String created_by;
    private String type;
    private Date updated_at;
    private String updated_by;
}
