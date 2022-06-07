package com.toyota32bit.Inviso.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name="version")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Version {
    @Id
    private Long id;
    private String version;

    @ManyToOne
    @JoinColumn(name = "application_id")
    private Application application;

}
