package com.toyota32bit.Inviso.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Table(name="function")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Function {
    @Id
    private Long id;
    private Date created_at;
    private String created_by;
    private String description;
    private String function_detail;
    private Date updated_at;
    private String updated_by;
    private String type;
    private boolean status;

    @ManyToOne
    @JoinColumn(name = "application_id")
    private Application application;

    @ManyToOne
    @JoinColumn(name = "function_type_id")
    private Function_type function_type;

}
