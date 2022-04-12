package com.toyota32bit.Inviso.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Table(name="user_application")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User_application {
    @Id
    private Long id;
    private Date created_at;
    private String created_by;
    private boolean status;
    private Date updated_at;
    private String updated_by;

    @ManyToOne
    @JoinColumn(name = "application_id")
    private Application application;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
