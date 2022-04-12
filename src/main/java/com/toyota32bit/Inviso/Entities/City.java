package com.toyota32bit.Inviso.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name="city")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class City {

    @Id
    @Column
    private Long id;
    @Column
    private String name;
    @Column
    private  int code;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @OneToMany(mappedBy = "city", orphanRemoval = true)
    private List<City> cities = new ArrayList<>();

}
