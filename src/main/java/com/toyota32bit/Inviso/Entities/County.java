package com.toyota32bit.Inviso.Entities;


import lombok.*;

import javax.persistence.*;

@Table(name="county")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class County {
    @Id
    @Column
    private Long id;
    @Column
    private String name;
    @Column
    private Long city_id;
}
