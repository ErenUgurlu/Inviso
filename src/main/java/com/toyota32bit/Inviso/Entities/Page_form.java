package com.toyota32bit.Inviso.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Table(name="page_form")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Page_form {
    @Id
    private Long id;
    private Date created_at;
    private String created_by;
    private String order_no;
    private String shor_name;
    private Date updated_at;
    private String updated_by;
    private String version;

    @ManyToOne
    @JoinColumn(name = "form_id")
    private Form form;

    @ManyToOne
    @JoinColumn(name = "page_id")
    private Page page;

    @ManyToOne
    @JoinColumn(name = "versions_id")
    private Version versions;

}
