package com.toyota32bit.Inviso.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name="page")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Page {
    @Id
    private Long id;
    private Date created_at;
    private String created_by;
    private String title;
    private Date updated_at;
    private String  updated_by;
    private Boolean is_page_name_hide;
    private int page_number;
}
