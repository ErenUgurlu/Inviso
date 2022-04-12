package com.toyota32bit.Inviso.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Table(name="assignment")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Assignment {
    @Id
    private Long id;
    private Date created_at;
    private String created_by;
    private String description;
    private String name;
    private String state_of_control;
    private String status;
    private Date updated_at;
    private String  updated_by;
    private String barcode;
    private Date assignment_date;
    private Date expire_date;
    private int critical_ratio;
    private String decision_status;
    private String reject_reason;
    private Long rejected_id;

    @ManyToOne
    @JoinColumn(name = "equipment_type_id")
    private Equipment_type equipment_type;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "application_id")
    private Application application;

}
