package com.toyota32bit.Inviso.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Table(name="password_reset_key")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Password_reset_key {
    @Id
    private Long id;
    private Date expire_date;
    private String key;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "user_id")
    private User user;


}
