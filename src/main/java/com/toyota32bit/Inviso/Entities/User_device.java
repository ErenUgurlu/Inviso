package com.toyota32bit.Inviso.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Table(name="user_device")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User_device {
    @Id
    private Long id;
    private Date created_at;
    private String created_by;
    private String device_id;
    private String token;
    private Date updated_at;
    private String updated_by;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
