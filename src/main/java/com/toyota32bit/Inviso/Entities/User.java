package com.toyota32bit.Inviso.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;


@Table(name="users")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
    @Id
    private Long id;
    private String address;
    private String company_name;
    private Date created_at;
    private String created_by;
    private String email;
    private String name;
    private String occupation;
    private String password;
    private String phone_number;
    private int status;
    private String surname;
    private String tc_number;
    private Date updated_at;
    private String updated_by;
    private String user_name;
    private boolean is_admin;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "reset_key",referencedColumnName = "key")
    private Password_reset_key password_reset_key;

    @ManyToMany
    @JoinTable(name = "users_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "roles_id"))
    private Set<Role> roles = new LinkedHashSet<>();

}
