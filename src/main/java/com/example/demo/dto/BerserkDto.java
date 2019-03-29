package com.example.demo.dto;


import com.example.demo.entities.Berserk;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;


public class BerserkDto {


    private Long id;

    private String description;

    private LocalDateTime createDateTime;

    private String login;


    public BerserkDto() {
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public LocalDateTime getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(LocalDateTime createDateTime) {
        this.createDateTime = createDateTime;
    }

    public Berserk toDto(){
        Berserk berserk = new Berserk();
        berserk.setDescription(getDescription());
        berserk.setLogin(getLogin());
        berserk.setCreateDateTime(getCreateDateTime());
        return berserk;
    }
}
