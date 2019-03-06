package com.example.demo.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.UUID;

@Entity
//@Getter
//@Setter
public class Berserk {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @GeneratedValue(generator = "uuid")
//    @GenericGenerator( name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
//    @Column(name = "id" , columnDefinition = "VARCHAR(255)")
    private Long id;

    @Size(max = 1000)
    private String description;

    @Email
    private String email;

    private Byte pic;


    public Berserk() {
    }

    public Berserk(@Size(max = 1000) String description, @Email String email, Byte pic) {
        this.description = description;
        this.email = email;
        this.pic = pic;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
