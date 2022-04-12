package com.toyota32bit.Inviso.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Table(name="user_equipment")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User_equipment {
    @Id
    private Long id;

    private Date debit_date;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "equipment_id")
    private Equipment equipment;

}
