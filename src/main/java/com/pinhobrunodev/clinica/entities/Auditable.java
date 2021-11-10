package com.pinhobrunodev.clinica.entities;

import lombok.Getter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.Instant;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
public abstract class Auditable {

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant criadoEm;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant atualizadoEm;

    @PrePersist
    public void PrePersist() {
        criadoEm = Instant.now();
    }

    @PreUpdate
    public void PreUpdate() {
        atualizadoEm = Instant.now();
    }


}
