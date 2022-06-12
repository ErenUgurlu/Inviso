package com.toyota32bit.Inviso.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name="navigation")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Navigation {

        @Id
        private Long id;
        private String name;
        private Integer orderNumber;

}
