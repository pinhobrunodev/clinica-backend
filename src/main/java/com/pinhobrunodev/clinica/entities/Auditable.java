package com.pinhobrunodev.clinica.entities;

import javax.persistence.Column;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.Instant;

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
