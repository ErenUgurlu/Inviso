package com.toyota32bit.Inviso.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Table(name="control_metadata")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Control_metadata {
    @Id
    private Long id;
    private String barcode;
    private Date control_date;
    private int coordinate_x;
    private int coordinate_y;
    private String state_code;
    private String device_id;
    private boolean is_report_result_ready;
    private int try_count;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "application_id")
    private Application application;




}
